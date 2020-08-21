package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:20
 *
 */
public class MiddleInvoiceImage  {
	
	//alias
	public static final String TABLE_ALIAS = "发票图片信息";
	
	//columns START
	/**
	 * @Fields companyPrimaryKey:企业主键
	 */
	private String companyPrimaryKey;
	
	/**
	 * @Fields invoiceCode:发票代码,10位数或者12位数
	 */
	private String invoiceCode;
	
	/**
	 * @Fields invoiceId:发票号码,8位数
	 */
	private String invoiceId;
	
	/**
	 * @Fields imageType:图片类型 0发票1清单
	 */
	private String imageType;
	
	/**
	 * @Fields imgUrl:图片URL
	 */
	private String imgUrl;
	
	/**
	 * @Fields invoicePrimaryId:平台发票唯一编号
	 */
	private String invoicePrimaryId;
	
	/**
	 * @Fields orgId:所属企业
	 */
	private String orgId;
	
	/**
	 * @Fields id:省平台图片唯一编码
	 */
	private String id;
	
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

	public MiddleInvoiceImage(){
	}

	public MiddleInvoiceImage(String companyPrimaryKey){
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
	
	public void setImageType(String imageType){
		this.imageType = imageType;
	}
	
	public String getImageType(){
		return imageType;
	}
	
	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}
	
	public String getImgUrl(){
		return imgUrl;
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
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
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