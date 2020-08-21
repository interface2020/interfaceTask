package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;

/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:22
 *
 */
public class MiddleSaleInfo  {
	
	//alias
	public static final String TABLE_ALIAS = "发票清单";
	
	//columns START
	/**
	 * @Fields companyPrimaryKey:企业主键
	 */
	private String companyPrimaryKey;
	
	/**
	 * @Fields invoiceCode:发票代码
	 */
	private String invoiceCode;
	
	/**
	 * @Fields invoiceId:发票号码
	 */
	private String invoiceId;
	
	/**
	 * @Fields goodsId:产品ID
	 */
	private String goodsId;
	
	/**
	 * @Fields batchCode:批号 统一发票内，批号+产品ID不能重复出现,
	 */
	private String batchCode;
	
	/**
	 * @Fields periodDate:有效期
	 */
	private Date periodDate;
	
	/**
	 * @Fields saleNumber:销售数量
	 */
	private BigDecimal saleNumber;
	
	/**
	 * @Fields invoicePrimaryId:平台发票唯一编号
	 */
	private String invoicePrimaryId;
	
	/**
	 * @Fields orgId:所属企业
	 */
	private String orgId;
	
	/**
	 * @Fields responseState:省平台交互状态
	 */
	private String responseState;
	
	/**
	 * @Fields responseInfo:省平台交互信息
	 */
	private String responseInfo;
	
	/**
	 * @Fields responseTime:省平台交互时间
	 */
	private Date responseTime;
	
	//columns END

	public MiddleSaleInfo(){
	}

	public MiddleSaleInfo(String companyPrimaryKey){
		this.companyPrimaryKey = companyPrimaryKey;
	}

	
	public void setCompanyPrimaryKey(String companyPrimaryKey){
		this.companyPrimaryKey = companyPrimaryKey;
	}
	
	public String getCompanyPrimaryKey(){
		return companyPrimaryKey;
	}
	
	public void setInvoiceCode(String invoiceCode){
		this.invoiceCode = invoiceCode;
	}
	
	public String getInvoiceCode(){
		return invoiceCode;
	}
	
	public void setInvoiceId(String invoiceId){
		this.invoiceId = invoiceId;
	}
	
	public String getInvoiceId(){
		return invoiceId;
	}
	
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	
	public String getGoodsId(){
		return goodsId;
	}
	
	public void setBatchCode(String batchCode){
		this.batchCode = batchCode;
	}
	
	public String getBatchCode(){
		return batchCode;
	}
	
	public void setPeriodDate(Date periodDate){
		this.periodDate = periodDate;
	}
	
	public Date getPeriodDate(){
		return periodDate;
	}
	
	public void setSaleNumber(BigDecimal saleNumber){
		this.saleNumber = saleNumber;
	}
	
	public BigDecimal getSaleNumber(){
		return saleNumber;
	}
	
	public void setInvoicePrimaryId(String invoicePrimaryId){
		this.invoicePrimaryId = invoicePrimaryId;
	}
	
	public String getInvoicePrimaryId(){
		return invoicePrimaryId;
	}
	
	public void setOrgId(String orgId){
		this.orgId = orgId;
	}
	
	public String getOrgId(){
		return orgId;
	}
	
	public void setResponseState(String responseState){
		this.responseState = responseState;
	}
	
	public String getResponseState(){
		return responseState;
	}
	
	public void setResponseInfo(String responseInfo){
		this.responseInfo = responseInfo;
	}
	
	public String getResponseInfo(){
		return responseInfo;
	}
	
	public void setResponseTime(Date responseTime){
		this.responseTime = responseTime;
	}
	
	public Date getResponseTime(){
		return responseTime;
	}

}