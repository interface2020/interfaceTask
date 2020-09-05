package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;



/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-09-05 21:38:34
 *
 */
public class MiddleInvoicecheckResult {
	
	//alias
	public static final String TABLE_ALIAS = "发票核验信息表";
	
	//columns START
	/**
	 * @Fields distributeId:省平台配送明细编号
	 */
	private String distributeId;
	
	/**
	 * @Fields invoicePrimaryId:省平台发票唯一编码
	 */
	private String invoicePrimaryId;
	
	/**
	 * @Fields invoiceId:发票号
	 */
	private String invoiceId;
	
	/**
	 * @Fields invoiceCode:发票代码
	 */
	private String invoiceCode;
	
	/**
	 * @Fields comidPs:配送企业ID
	 */
	private String comidPs;
	
	/**
	 * @Fields checkResult:发票核验结果
	 */
	private String checkResult;
	
	/**
	 * @Fields submittime:提交时间
	 */
	private Date submittime;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	//columns END

	public MiddleInvoicecheckResult(){
	}

	public MiddleInvoicecheckResult(String distributeId){
		this.distributeId = distributeId;
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
	
	public void setInvoiceId(String invoiceId){
		this.invoiceId = invoiceId;
	}
	
	public String getInvoiceId(){
		return invoiceId;
	}
	
	public void setInvoiceCode(String invoiceCode){
		this.invoiceCode = invoiceCode;
	}
	
	public String getInvoiceCode(){
		return invoiceCode;
	}
	
	public void setComidPs(String comidPs){
		this.comidPs = comidPs;
	}
	
	public String getComidPs(){
		return comidPs;
	}
	
	public void setCheckResult(String checkResult){
		this.checkResult = checkResult;
	}
	
	public String getCheckResult(){
		return checkResult;
	}
	
	public void setSubmittime(Date submittime){
		this.submittime = submittime;
	}
	
	public Date getSubmittime(){
		return submittime;
	}
	
	public void setAddTime(Date addTime){
		this.addTime = addTime;
	}
	
	public Date getAddTime(){
		return addTime;
	}

}