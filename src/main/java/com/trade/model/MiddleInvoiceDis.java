package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:32
 *
 */
public class MiddleInvoiceDis{
	
	//alias
	public static final String TABLE_ALIAS = "配送发票补录";
	
	//columns START
	/**
	 * @Fields companyDistributeId:企业补录发票明细ID
	 */
	private String companyDistributeId;
	
	/**
	 * @Fields distributeId:省平台配送明细ID
	 */
	private String distributeId;
	
	/**
	 * @Fields invoicePrimaryId:发票唯一编码
	 */
	private String invoicePrimaryId;
	
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

	public MiddleInvoiceDis(){
	}

	public MiddleInvoiceDis(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}

	
	public void setCompanyDistributeId(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}
	
	public String getCompanyDistributeId(){
		return companyDistributeId;
	}
	
	public void setDistributeId(String distributeId){
		this.distributeId = distributeId;
	}
	
	public String getDistributeId(){
		return distributeId;
	}
	
	public void setInvoicePrimaryId(String invoicePrimaryId){
		this.invoicePrimaryId = invoicePrimaryId;
	}
	
	public String getInvoicePrimaryId(){
		return invoicePrimaryId;
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