package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-09-05 22:40:02
 *
 */
public class SysTasks {
	
	//alias
	public static final String TABLE_ALIAS = "定时任务表";
	
	//columns START
	/**
	 * @Fields taskId:任务ID
	 */
	private String taskId;
	
	/**
	 * @Fields taskName:任务名称
	 */
	private String taskName;
	
	/**
	 * @Fields taskCron:任务时间
	 */
	private String taskCron;
	
	/**
	 * @Fields taskClass:任务类
	 */
	private String taskClass;
	
	/**
	 * @Fields isusing:任务是否启用
	 */
	private String isusing;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	//columns END

	public SysTasks(){
	}

	public SysTasks(String taskId){
		this.taskId = taskId;
	}

	
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}
	
	public String getTaskId(){
		return taskId;
	}
	
	public void setTaskName(String taskName){
		this.taskName = taskName;
	}
	
	public String getTaskName(){
		return taskName;
	}
	
	public void setTaskCron(String taskCron){
		this.taskCron = taskCron;
	}
	
	public String getTaskCron(){
		return taskCron;
	}
	
	public void setTaskClass(String taskClass){
		this.taskClass = taskClass;
	}
	
	public String getTaskClass(){
		return taskClass;
	}
	
	public void setIsusing(String isusing){
		this.isusing = isusing;
	}
	
	public String getIsusing(){
		return isusing;
	}
	
	public void setAddTime(Date addTime){
		this.addTime = addTime;
	}
	
	public Date getAddTime(){
		return addTime;
	}

}