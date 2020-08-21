package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:29
 *
 */
public class BaseCompanyProvince   {
	
	//alias
	public static final String TABLE_ALIAS = "企业信息";
	
	//columns START
	/**
	 * @Fields companyId:企业编号
	 */
	private String companyId;
	
	/**
	 * @Fields id:ID
	 */
	private String id;
	
	/**
	 * @Fields companyType:企业类型
	 */
	private String companyType;
	
	/**
	 * @Fields companyName:企业名称
	 */
	private String companyName;
	
	/**
	 * @Fields address:地址
	 */
	private String address;
	
	/**
	 * @Fields companyContactTel:企业联系电话
	 */
	private String companyContactTel;
	
	/**
	 * @Fields companyContactFax:企业传真号码
	 */
	private String companyContactFax;
	
	/**
	 * @Fields zipCode:邮编
	 */
	private String zipCode;
	
	/**
	 * @Fields email:邮箱
	 */
	private String email;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	/**
	 * @Fields lastUpdateTime:变更时间
	 */
	private Date lastUpdateTime;
	
	//columns END

	public BaseCompanyProvince(){
	}

	public BaseCompanyProvince(String companyId){
		this.companyId = companyId;
	}

	
	public void setCompanyId(String companyId){
		this.companyId = companyId;
	}
	
	public String getCompanyId(){
		return companyId;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setCompanyType(String companyType){
		this.companyType = companyType;
	}
	
	public String getCompanyType(){
		return companyType;
	}
	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setCompanyContactTel(String companyContactTel){
		this.companyContactTel = companyContactTel;
	}
	
	public String getCompanyContactTel(){
		return companyContactTel;
	}
	
	public void setCompanyContactFax(String companyContactFax){
		this.companyContactFax = companyContactFax;
	}
	
	public String getCompanyContactFax(){
		return companyContactFax;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public String getZipCode(){
		return zipCode;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
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