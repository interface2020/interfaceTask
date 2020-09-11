package com.jobs;

import com.common.model.ScheduleJob;
import com.trade.model.SysTasks;
import com.trade.service.SysTasksManager;
import org.quartz.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class QuartzConfig implements ApplicationContextAware {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(QuartzConfig.class);

    private static ApplicationContext appCtx;

    private static SchedulerFactoryBean schedulerFactoryBean = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (appCtx == null) {
            appCtx = applicationContext;
        }
    }

    @Bean
    public static void init()throws Exception{
        schedulerFactoryBean = appCtx.getBean(SchedulerFactoryBean.class);
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        SysTasksManager tasksManager=appCtx.getBean(SysTasksManager.class);
        Map<String,Object> params=new HashMap<>();
        params.put("isusing","1");
        List<SysTasks> tasks = tasksManager.getListByParams(params);
        for (SysTasks task : tasks) {
            ScheduleJob job=new ScheduleJob();
            job.setJobGroup("synTasks"); // 任务组
            job.setJobName(task.getTaskName());// 任务名称
            job.setJobStatus("1"); // 任务发布状态
            job.setIsConcurrent("1"); // 运行状态
            job.setCronExpression(task.getTaskCron());
            job.setBeanClass(task.getTaskClass());// 一个以所给名字注册的bean的实例
            addOrUpdateJob(job);
        }

    }

    public static void addOrUpdateJob(ScheduleJob job) throws Exception {
        if (job == null || !ScheduleJob.STATUS_RUNNING.equals(job.getJobStatus())) {
            return;
        }
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        // 不存在，创建一个
        if (null == trigger) {
            JobDetail jobDetail = JobBuilder.newJob(getClass(job.getBeanClass()).getClass()).
                    withIdentity(job.getJobName(), job.getJobGroup()).build();
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
            trigger = TriggerBuilder.newTrigger().
                    withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
            scheduler.scheduleJob(jobDetail, trigger);
        } else {
            // Trigger已存在，那么更新相应的定时设置
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
            // 按新的cronExpression表达式重新构建trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
            // 按新的trigger重新设置job执行
            scheduler.rescheduleJob(triggerKey, trigger);
        }
    }

    public static BaseJob getClass(String classname) throws Exception {
        Class<?> class1 = Class.forName(classname);
        return (BaseJob) class1.newInstance();
    }
    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return appCtx;
    }

    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}
