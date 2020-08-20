package com.trade.model;

import java.math.BigDecimal;
import java.util.Date;

public class TradePurchaseorder {
	
	//alias
	public static final String TABLE_ALIAS = "订单表";
	
	//columns START
	/**
	 * @Fields purchaseorderid:订单ID
	 */
	private String purchaseorderid;
	
	/**
	 * @Fields hosid:医院ID
	 */
	private String hosid;
	
	/**
	 * @Fields purchaseordercode:订单编号
	 */
	private String purchaseordercode;
	
	/**
	 * @Fields addtime:新建订单时间
	 */
	private Date addtime;
	
	/**
	 * @Fields reportedtime:计划上报时间
	 */
	private Date reportedtime;
	
	/**
	 * @Fields submittime:提交订单时间
	 */
	private Date submittime;
	
	/**
	 * @Fields orderstarttime:订单开始时间
	 */
	private Date orderstarttime;
	
	/**
	 * @Fields orderendtime:订单截止时间
	 */
	private Date orderendtime;
	
	/**
	 * @Fields orderamount:订单总金额
	 */
	private BigDecimal orderamount;
	
	/**
	 * @Fields remark:备注
	 */
	private String remark;
	
	/**
	 * @Fields ordertype:订单类型(0默认类型5退货单)
	 */
	private String ordertype;
	
	/**
	 * @Fields orderstatus:订单状态(0未上报1待下发2已提交3被打回)
	 */
	private String orderstatus;
	
	/**
	 * @Fields eduptime:最后更新时间
	 */
	private Date eduptime;
	
	/**
	 * @Fields onpassreason:打回原因
	 */
	private Object onpassreason;
	
	//columns END

	public TradePurchaseorder(){
	}

	public TradePurchaseorder(String purchaseorderid){
		this.purchaseorderid = purchaseorderid;
	}

	
	public void setPurchaseorderid(String purchaseorderid){
		this.purchaseorderid = purchaseorderid;
	}
	
	public String getPurchaseorderid(){
		return purchaseorderid;
	}
	
	public void setHosid(String hosid){
		this.hosid = hosid;
	}
	
	public String getHosid(){
		return hosid;
	}
	
	public void setPurchaseordercode(String purchaseordercode){
		this.purchaseordercode = purchaseordercode;
	}
	
	public String getPurchaseordercode(){
		return purchaseordercode;
	}
	
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	
	public Date getAddtime(){
		return addtime;
	}
	
	public void setReportedtime(Date reportedtime){
		this.reportedtime = reportedtime;
	}
	
	public Date getReportedtime(){
		return reportedtime;
	}
	
	public void setSubmittime(Date submittime){
		this.submittime = submittime;
	}
	
	public Date getSubmittime(){
		return submittime;
	}
	
	public void setOrderstarttime(Date orderstarttime){
		this.orderstarttime = orderstarttime;
	}
	
	public Date getOrderstarttime(){
		return orderstarttime;
	}
	
	public void setOrderendtime(Date orderendtime){
		this.orderendtime = orderendtime;
	}
	
	public Date getOrderendtime(){
		return orderendtime;
	}
	
	public void setOrderamount(BigDecimal orderamount){
		this.orderamount = orderamount;
	}
	
	public BigDecimal getOrderamount(){
		return orderamount;
	}
	
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return remark;
	}
	
	public void setOrdertype(String ordertype){
		this.ordertype = ordertype;
	}
	
	public String getOrdertype(){
		return ordertype;
	}
	
	public void setOrderstatus(String orderstatus){
		this.orderstatus = orderstatus;
	}
	
	public String getOrderstatus(){
		return orderstatus;
	}
	
	public void setEduptime(Date eduptime){
		this.eduptime = eduptime;
	}
	
	public Date getEduptime(){
		return eduptime;
	}
	
	public void setOnpassreason(Object onpassreason){
		this.onpassreason = onpassreason;
	}
	
	public Object getOnpassreason(){
		return onpassreason;
	}

}