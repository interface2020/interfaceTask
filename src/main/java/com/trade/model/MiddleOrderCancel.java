package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-09-05 21:39:00
 *
 */
public class MiddleOrderCancel  {
	
	//alias
	public static final String TABLE_ALIAS = "医疗机构撤单记录表";
	
	//columns START
	/**
	 * @Fields orderId:订单编号
	 */
	private String orderId;
	
	/**
	 * @Fields orderCode:订单名称
	 */
	private String orderCode;
	
	/**
	 * @Fields hospitalId:医院编号
	 */
	private String hospitalId;
	
	/**
	 * @Fields cancelTime:撤单时间
	 */
	private String cancelTime;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	/**
	 * @Fields lastUpdateTime:最后更新时间
	 */
	private Date lastUpdateTime;
	
	//columns END

	public MiddleOrderCancel(){
	}

	public MiddleOrderCancel(String orderId){
		this.orderId = orderId;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
	public String getOrderId(){
		return orderId;
	}
	
	public void setOrderCode(String orderCode){
		this.orderCode = orderCode;
	}
	
	public String getOrderCode(){
		return orderCode;
	}
	
	public void setHospitalId(String hospitalId){
		this.hospitalId = hospitalId;
	}
	
	public String getHospitalId(){
		return hospitalId;
	}
	
	public void setCancelTime(String cancelTime){
		this.cancelTime = cancelTime;
	}
	
	public String getCancelTime(){
		return cancelTime;
	}
	
	public void setAddTime(Date addTime){
		this.addTime = addTime;
	}
	
	public Date getAddTime(){
		return addTime;
	}
	
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}

}