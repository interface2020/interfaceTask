package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;

/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:26:45
 *
 */
public class MiddlePurchaseOrder{
	
	//alias
	public static final String TABLE_ALIAS = "订单信息";
	
	//columns START
	/**
	 * @Fields orderDetailState:订单状态
	 */
	private String orderDetailState;
	
	/**
	 * @Fields orderId:订单ID
	 */
	private String orderId;
	
	/**
	 * @Fields orderCode:订单编号
	 */
	private String orderCode;
	
	/**
	 * @Fields orderDetailId:订单明细编号
	 */
	private String orderDetailId;
	
	/**
	 * @Fields purchaseCount:采购数量
	 */
	private String purchaseCount;
	
	/**
	 * @Fields purchasePrice:采购价格
	 */
	private BigDecimal purchasePrice;
	
	/**
	 * @Fields purchaseAmount:采购总价格
	 */
	private BigDecimal purchaseAmount;
	
	/**
	 * @Fields totalDetailCount:订单明细数
	 */
	private String totalDetailCount;
	
	/**
	 * @Fields procureCatalogId:商品编号
	 */
	private String procureCatalogId;
	
	/**
	 * @Fields submitTime:提交时间
	 */
	private Date submitTime;
	
	/**
	 * @Fields hospitalId:医院ID
	 */
	private String hospitalId;
	
	/**
	 * @Fields hospitalName:医院名称
	 */
	private String hospitalName;
	
	/**
	 * @Fields companyNamePs:配送企业名称
	 */
	private String companyNamePs;
	
	/**
	 * @Fields companyIdPs:配送企业ID
	 */
	private String companyIdPs;
	
	/**
	 * @Fields orderName:订单名称
	 */
	private String orderName;
	
	/**
	 * @Fields orderRemarks:订单备注
	 */
	private String orderRemarks;
	
	//columns END

	public MiddlePurchaseOrder(){
	}

	public MiddlePurchaseOrder(String orderId){
		this.orderId = orderId;
	}

	
	public void setOrderDetailState(String orderDetailState){
		this.orderDetailState = orderDetailState;
	}
	
	public String getOrderDetailState(){
		return orderDetailState;
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
	
	public void setOrderDetailId(String orderDetailId){
		this.orderDetailId = orderDetailId;
	}
	
	public String getOrderDetailId(){
		return orderDetailId;
	}
	
	public void setPurchaseCount(String purchaseCount){
		this.purchaseCount = purchaseCount;
	}
	
	public String getPurchaseCount(){
		return purchaseCount;
	}
	
	public void setPurchasePrice(BigDecimal purchasePrice){
		this.purchasePrice = purchasePrice;
	}
	
	public BigDecimal getPurchasePrice(){
		return purchasePrice;
	}
	
	public void setPurchaseAmount(BigDecimal purchaseAmount){
		this.purchaseAmount = purchaseAmount;
	}
	
	public BigDecimal getPurchaseAmount(){
		return purchaseAmount;
	}
	
	public void setTotalDetailCount(String totalDetailCount){
		this.totalDetailCount = totalDetailCount;
	}
	
	public String getTotalDetailCount(){
		return totalDetailCount;
	}
	
	public void setProcureCatalogId(String procureCatalogId){
		this.procureCatalogId = procureCatalogId;
	}
	
	public String getProcureCatalogId(){
		return procureCatalogId;
	}
	
	public void setSubmitTime(Date submitTime){
		this.submitTime = submitTime;
	}
	
	public Date getSubmitTime(){
		return submitTime;
	}
	
	public void setHospitalId(String hospitalId){
		this.hospitalId = hospitalId;
	}
	
	public String getHospitalId(){
		return hospitalId;
	}
	
	public void setHospitalName(String hospitalName){
		this.hospitalName = hospitalName;
	}
	
	public String getHospitalName(){
		return hospitalName;
	}
	
	public void setCompanyNamePs(String companyNamePs){
		this.companyNamePs = companyNamePs;
	}
	
	public String getCompanyNamePs(){
		return companyNamePs;
	}
	
	public void setCompanyIdPs(String companyIdPs){
		this.companyIdPs = companyIdPs;
	}
	
	public String getCompanyIdPs(){
		return companyIdPs;
	}
	
	public void setOrderName(String orderName){
		this.orderName = orderName;
	}
	
	public String getOrderName(){
		return orderName;
	}
	
	public void setOrderRemarks(String orderRemarks){
		this.orderRemarks = orderRemarks;
	}
	
	public String getOrderRemarks(){
		return orderRemarks;
	}

}