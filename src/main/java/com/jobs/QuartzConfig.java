package com.jobs;

import com.common.model.ScheduleJob;
import org.quartz.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfig implements ApplicationContextAware {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(QuartzConfig.class);

    private static ApplicationContext appCtx;

    public static SchedulerFactoryBean schedulerFactoryBean = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (this.appCtx == null) {
            this.appCtx = applicationContext;
        }
    }

    @Bean
    public static void init()throws Exception{
        schedulerFactoryBean = (SchedulerFactoryBean) appCtx.getBean(SchedulerFactoryBean.class);
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        ScheduleJob job=new ScheduleJob();
        job.setJobGroup("synTasks"); // 任务组
        job.setJobName("syn");// 任务名称
        job.setJobStatus("1"); // 任务发布状态
        job.setIsConcurrent("1"); // 运行状态
        job.setCronExpression("*/2 * * * * ?");
        job.setBeanClass("com.jobs.SimpleJob");// 一个以所给名字注册的bean的实例
        addOrUpdateJob(job);
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


}
