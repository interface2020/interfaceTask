package com.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @category 校验信息
 * @author 韩守松
 * @date 2015年7月13日
 */
public class Result {
	private boolean isSuccess = true;// 存储校验结果
	private Map<String,ArrayList<String>> failCauseMap = new HashMap<String, ArrayList<String>>();// 存储校验结果

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Map<String, ArrayList<String>> getFailCauseMap() {
		return failCauseMap;
	}

	public void setFailCauseMap(Map<String, ArrayList<String>> failCauseMap) {
		this.failCauseMap = failCauseMap;
	}

	
}
