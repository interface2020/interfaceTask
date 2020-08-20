package com.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UploadResponse {
    /**
     * 返回值
     */
    private String returnCode;
    /**
     * 返回信息
     */
    private String returnMsg;
    /**
     * 当前页码
     */
    private Integer currentPageNumber;
    /**
     * 总页数
     */
    private Integer totalPageCount;
    /**
     * 总记录数量
     */
    private Integer totalRecordCount;

    private List<Map<String, Object>> successList ;

    private List<Map<String, Object>> errorList;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Integer getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(Integer currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public List<Map<String, Object>> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<Map<String, Object>> successList) {
        this.successList = successList;
    }

    public List<Map<String, Object>> getErrorList() {
        if(errorList == null) return new ArrayList<Map<String, Object>>();
        return errorList;
    }

    public void setErrorList(List<Map<String, Object>> errorList) {
        this.errorList = errorList;
    }
}
