package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:08
 *
 */
public class MiddleDistribute{
	
	//alias
	public static final String TABLE_ALIAS = "配送表";
	
	//columns START
	/**
	 * @Fields companyDistributeId:企业配送明细编号
	 */
	private String companyDistributeId;
	
	/**
	 * @Fields orderDetailId:订单明细编号
	 */
	private String orderDetailId;
	
	/**
	 * @Fields disTime:企业配送时间
	 */
	private Date disTime;
	
	/**
	 * @Fields disCount:配送数量
	 */
	private String disCount;
	
	/**
	 * @Fields distributeId:中心配送明细编号
	 */
	private String distributeId;
	
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
	 * @Fields checkResult:两票制校验结果
	 */
	private String checkResult;
	
	//columns END

	public MiddleDistribute(){
	}

	public MiddleDistribute(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}

	
	public void setCompanyDistributeId(String companyDistributeId){
		this.companyDistributeId = companyDistributeId;
	}
	
	public String getCompanyDistributeId(){
		return companyDistributeId;
	}
	
	public void setOrderDetailId(String orderDetailId){
		this.orderDetailId = orderDetailId;
	}
	
	public String getOrderDetailId(){
		return orderDetailId;
	}
	
	public void setDisTime(Date disTime){
		this.disTime = disTime;
	}
	
	public Date getDisTime(){
		return disTime;
	}
	
	public void setDisCount(String disCount){
		this.disCount = disCount;
	}
	
	public String getDisCount(){
		return disCount;
	}
	
	public void setDistributeId(String distributeId){
		this.distributeId = distributeId;
	}
	
	public String getDistributeId(){
		return distributeId;
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
	
	public void setCheckResult(String checkResult){
		this.checkResult = checkResult;
	}
	
	public String getCheckResult(){
		return checkResult;
	}

}