package com.common.utils;

import com.validator.DbUtil;
import com.validator.Result;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Pagination {
	private long records;// 总记录数
	private int total;// 总页数
	private Object rows;
	private int page;// 当前页
	private int count = 10;// 每页条数
	private int firstResult;
	private int maxResults = 10;
	private boolean success;
	private Result result;//校验结果
	private Map<String, Object> conditions = new HashMap<String, Object>();
	private String msg; // 失败信息
	private Object form;// 查询条件实体对象
	private int code; // 错误码

	private int operCount;//操作记录数
	private String sord;  //排序方向
	private String sidx;  //排序字段
	
	private String orderby; //排序
	
	public int getOperCount() {
		return operCount;
	}

	public void setOperCount(int operCount) {
		this.operCount = operCount;
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public Pagination() {

	}

	public Pagination(HttpServletRequest request) {
		int pageIndex = request.getParameter("page") == null ? 1 : request
				.getParameter("page").equals("") ? 1 : request.getParameter(
				"page").equals("0") ? 1 : Integer.valueOf(request
				.getParameter("page"));
		int pageSize = request.getParameter("rows") == null ? 10 : request
				.getParameter("rows").equals("") ? 10 : request.getParameter(
				"rows").equals("0") ? 10 : Integer.valueOf(request
				.getParameter("rows"));
		DbUtil.jsonToMap(request, this);
		int firstRes = (pageIndex - 1) * pageSize;
		this.setFirstResult(firstRes);
		this.setMaxResults(pageSize);
		this.setPage(pageIndex);
		this.setCount(pageSize);
		this.setSidx(request.getParameter("sidx"));
		this.setSord(request.getParameter("sord"));
		this.setOrderby();
	}

	public long getRecords() {
		return records;
	}

	public void setRecords(long records) {
		this.records = records;
	}

	public int getTotal() {
		// return total;
		total = new Long(getRecords() % getMaxResults() == 0 ? getRecords()
				/ getMaxResults() : getRecords() / getMaxResults() + 1)
				.intValue();
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getCount() {
		return count;
	}

	@Deprecated
	public void setCount(int count) {
		this.count = count;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getConditions() {
		return conditions;
	}

	public void setConditions(Map<String, Object> conditions) {
		this.conditions = conditions;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getForm() {
		return form;
	}

	public void setForm(Object form) {
		this.form = form;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public void putConditions(String key, Object value) {
		conditions.put(key, value);
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby() {
		if(getSidx() != null && !"".equals(getSidx())) {
			this.orderby = getSidx() +" "+getSord();
		}
		
	}
	
}
