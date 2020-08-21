package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;

/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:30
 *
 */
public class BaseHospitalProvince {
	
	//alias
	public static final String TABLE_ALIAS = "医疗机构信息";
	
	//columns START
	/**
	 * @Fields hospitalId:医疗机构ID
	 */
	private String hospitalId;
	
	/**
	 * @Fields hospitalCode:医疗机构编号
	 */
	private String hospitalCode;
	
	/**
	 * @Fields hospitalName:医疗机构名称
	 */
	private String hospitalName;
	
	/**
	 * @Fields hospitalType:医疗机构类型
	 */
	private String hospitalType;
	
	/**
	 * @Fields areaId:地区编号
	 */
	private String areaId;
	
	/**
	 * @Fields areaName:地区名称
	 */
	private String areaName;
	
	/**
	 * @Fields isUsing:是否启用
	 */
	private String isUsing;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	/**
	 * @Fields lastUpdateTime:变更时间
	 */
	private Date lastUpdateTime;
	
	//columns END

	public BaseHospitalProvince(){
	}

	public BaseHospitalProvince(String hospitalId){
		this.hospitalId = hospitalId;
	}

	
	public void setHospitalId(String hospitalId){
		this.hospitalId = hospitalId;
	}
	
	public String getHospitalId(){
		return hospitalId;
	}
	
	public void setHospitalCode(String hospitalCode){
		this.hospitalCode = hospitalCode;
	}
	
	public String getHospitalCode(){
		return hospitalCode;
	}
	
	public void setHospitalName(String hospitalName){
		this.hospitalName = hospitalName;
	}
	
	public String getHospitalName(){
		return hospitalName;
	}
	
	public void setHospitalType(String hospitalType){
		this.hospitalType = hospitalType;
	}
	
	public String getHospitalType(){
		return hospitalType;
	}
	
	public void setAreaId(String areaId){
		this.areaId = areaId;
	}
	
	public String getAreaId(){
		return areaId;
	}
	
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	
	public String getAreaName(){
		return areaName;
	}
	
	public void setIsUsing(String isUsing){
		this.isUsing = isUsing;
	}
	
	public String getIsUsing(){
		return isUsing;
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