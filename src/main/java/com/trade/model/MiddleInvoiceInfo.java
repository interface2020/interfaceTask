package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;

/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:16
 *
 */
public class MiddleInvoiceInfo  {
	
	//alias
	public static final String TABLE_ALIAS = "发票表";
	
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
	 * @Fields invoiceDate:开票日期
	 */
	private Date invoiceDate;
	
	/**
	 * @Fields invoiceType:（发票类型 1第一票2最终票3中间票）
	 */
	private String invoiceType;
	
	/**
	 * @Fields saleId:销售方ID【平台内的企业编号】
	 */
	private String saleId;
	
	/**
	 * @Fields saleName:销方名称
	 */
	private String saleName;
	
	/**
	 * @Fields saleRemark:销售方备注
	 */
	private String saleRemark;
	
	/**
	 * @Fields saleTaxpayerNumber:销方纳税识别号
	 */
	private String saleTaxpayerNumber;
	
	/**
	 * @Fields buyId:购买方ID
	 */
	private String buyId;
	
	/**
	 * @Fields buyName:购方名称
	 */
	private String buyName;
	
	/**
	 * @Fields buyRemarks:购买方备注
	 */
	private String buyRemarks;
	
	/**
	 * @Fields buyTaxpayerNumber:购方纳税识别号
	 */
	private String buyTaxpayerNumber;
	
	/**
	 * @Fields totalTaxPrice:开票金额
	 */
	private BigDecimal totalTaxPrice;
	
	/**
	 * @Fields orgId:所属企业
	 */
	private String orgId;
	
	/**
	 * @Fields invoiceImgId:发票图片ID
	 */
	private String invoiceImgId;
	
	/**
	 * @Fields id:发票唯一ID
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

	public MiddleInvoiceInfo(){
	}

	public MiddleInvoiceInfo(String companyPrimaryKey){
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
	
	public void setInvoiceDate(Date invoiceDate){
		this.invoiceDate = invoiceDate;
	}
	
	public Date getInvoiceDate(){
		return invoiceDate;
	}
	
	public void setInvoiceType(String invoiceType){
		this.invoiceType = invoiceType;
	}
	
	public String getInvoiceType(){
		return invoiceType;
	}
	
	public void setSaleId(String saleId){
		this.saleId = saleId;
	}
	
	public String getSaleId(){
		return saleId;
	}
	
	public void setSaleName(String saleName){
		this.saleName = saleName;
	}
	
	public String getSaleName(){
		return saleName;
	}
	
	public void setSaleRemark(String saleRemark){
		this.saleRemark = saleRemark;
	}
	
	public String getSaleRemark(){
		return saleRemark;
	}
	
	public void setSaleTaxpayerNumber(String saleTaxpayerNumber){
		this.saleTaxpayerNumber = saleTaxpayerNumber;
	}
	
	public String getSaleTaxpayerNumber(){
		return saleTaxpayerNumber;
	}
	
	public void setBuyId(String buyId){
		this.buyId = buyId;
	}
	
	public String getBuyId(){
		return buyId;
	}
	
	public void setBuyName(String buyName){
		this.buyName = buyName;
	}
	
	public String getBuyName(){
		return buyName;
	}
	
	public void setBuyRemarks(String buyRemarks){
		this.buyRemarks = buyRemarks;
	}
	
	public String getBuyRemarks(){
		return buyRemarks;
	}
	
	public void setBuyTaxpayerNumber(String buyTaxpayerNumber){
		this.buyTaxpayerNumber = buyTaxpayerNumber;
	}
	
	public String getBuyTaxpayerNumber(){
		return buyTaxpayerNumber;
	}
	
	public void setTotalTaxPrice(BigDecimal totalTaxPrice){
		this.totalTaxPrice = totalTaxPrice;
	}
	
	public BigDecimal getTotalTaxPrice(){
		return totalTaxPrice;
	}
	
	public void setOrgId(String orgId){
		this.orgId = orgId;
	}
	
	public String getOrgId(){
		return orgId;
	}
	
	public void setInvoiceImgId(String invoiceImgId){
		this.invoiceImgId = invoiceImgId;
	}
	
	public String getInvoiceImgId(){
		return invoiceImgId;
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