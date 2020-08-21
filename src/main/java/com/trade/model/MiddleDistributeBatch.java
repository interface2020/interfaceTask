package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:11
 *
 */
public class MiddleDistributeBatch {
	
	//alias
	public static final String TABLE_ALIAS = "配送批次表";
	
	//columns START
	/**
	 * @Fields companyDistributeId:企业配送明细编号
	 */
	private String companyDistributeId;
	
	/**
	 * @Fields batchCode:批号
	 */
	private String batchCode;
	
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
	
	/**
	 * @Fields batchCount:数量
	 */
	private String batchCount;
	
	//columns END

	public MiddleDistributeBatch(){
	}

	public MiddleDistributeBatch(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}

	
	public void setCompanyDistributeId(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}
	
	public String getCompanyDistributeId(){
		return companyDistributeId;
	}
	
	public void setBatchCode(String batchCode){
		this.batchCode = batchCode;
	}
	
	public String getBatchCode(){
		return batchCode;
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
	
	public void setBatchCount(String batchCount){
		this.batchCount = batchCount;
	}
	
	public String getBatchCount(){
		return batchCount;
	}

}