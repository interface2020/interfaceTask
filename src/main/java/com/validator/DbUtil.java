package com.validator;

import com.common.utils.Pagination;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class DbUtil {

	/**
	 * Controller层 将前台传来的json对象以键-值对的方式放入page.getConditions()
	 * @author yxc
	 * @param request
	 * @param page
	 */
	@SuppressWarnings("serial")
	public static void jsonToMap(HttpServletRequest request, Pagination page) {
		Enumeration<?> paramNames = request.getParameterNames();
		List<String> list = new ArrayList<String>(){{
			add("_search");
			add("nd");
			add("rows");
			add("page");
			add("sidx");
			add("sord");
		}};
		while ( paramNames.hasMoreElements()) {
			// 获取 键名
			String paramName = (String) paramNames.nextElement();
			if (isExistparams(paramName,list)) {
				String[] paramValues = request.getParameterValues(paramName);
				if(paramName.lastIndexOf("[]") != -1) {
					paramName = paramName.substring(0, paramName.indexOf("["));
					page.getConditions().put(paramName, paramValues);
				}else if(paramValues.length>1){
					page.getConditions().put(paramName, paramValues);
				} else {
					String paramValue = paramValues[0];
					if (paramValues[0].length() != 0) {
						page.getConditions().put(paramName, paramValue);
					}  
				}
			}
		}
	}
	
	private static boolean isExistparams (String paramName,List<String> list){
		// 过滤前台分页字符串即list集合
		boolean temp = true; 
		for (int i = 0; i < list.size();i++) {
			if (paramName.equals(list.get(i))) {
				list.remove(i);
				 temp = false;
			}
		}
		return temp;
	}
	
	
}
