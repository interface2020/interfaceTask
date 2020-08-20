package com.trade.model;

import java.math.BigDecimal;
import java.util.Date;

public class TradePurchaseorderdetail {
	
	//alias
	public static final String TABLE_ALIAS = "订单明细表(未完成）";
	
	//columns START
	/**
	 * @Fields purchaseorderdetailid:订单明细ID
	 */
	private String purchaseorderdetailid;
	
	/**
	 * @Fields purchaseorderid:订单ID
	 */
	private String purchaseorderid;
	
	/**
	 * @Fields procurecatalogid:目录ID
	 */
	private String procurecatalogid;
	
	/**
	 * @Fields purchasecount:采购数量
	 */
	private Long purchasecount;
	
	/**
	 * @Fields purchaseprice:采购价格
	 */
	private BigDecimal purchaseprice;
	
	/**
	 * @Fields purchaseamount:采购金额
	 */
	private BigDecimal purchaseamount;
	
	/**
	 * @Fields comidPs:配送企业ID
	 */
	private String comidPs;
	
	/**
	 * @Fields comnamePs:配送企业名称
	 */
	private String comnamePs;
	
	/**
	 * @Fields comidTb:申报企业ID
	 */
	private String comidTb;
	
	/**
	 * @Fields comnameTb:申报企业名称
	 */
	private String comnameTb;
	
	/**
	 * @Fields comnameSc:生产企业名称
	 */
	private String comnameSc;
	
	/**
	 * @Fields detailstatus:状态 0未处理、1已确认、4已配送、5拒绝配送、6已入库、7拒收、8过期撤废、9确认采购单
	 */
	private String detailstatus;
	
	/**
	 * @Fields detailcontime:明细确认时间
	 */
	private Date detailcontime;
	
	/**
	 * @Fields ndisreson:拒绝配送原因
	 */
	private String ndisreson;
	
	/**
	 * @Fields eduptime:最后更新时间
	 */
	private Date eduptime;
	
	/**
	 * @Fields refuseretreson:拒绝退货原因
	 */
	private String refuseretreson;
	
	/**
	 * @Fields podetailid:退货明细对应的采购明细
	 */
	private String podetailid;
	
	/**
	 * @Fields purchasedetailcontime:确认采购单时间
	 */
	private Date purchasedetailcontime;

	/**
	 * @Fields purchaseordercode:订单编号
	 */
	private String purchaseordercode;

	/**
	 * @Fields remark:备注
	 */
	private String remark;

	/**
	 * @Fields hosid:医院ID
	 */
	private String hosid;

	private String hosName;

	/**
	 * @Fields submittime:提交订单时间
	 */
	private Date submittime;

	/**
	 * @Fields ordertype:订单类型(0默认类型5退货单)
	 */
	private String ordertype;

	private String detailCount;

	//columns END

	public TradePurchaseorderdetail(){
	}

	public TradePurchaseorderdetail(String purchaseorderdetailid){
		this.purchaseorderdetailid = purchaseorderdetailid;
	}

	
	public void setPurchaseorderdetailid(String purchaseorderdetailid){
		this.purchaseorderdetailid = purchaseorderdetailid;
	}
	
	public String getPurchaseorderdetailid(){
		return purchaseorderdetailid;
	}
	
	public void setPurchaseorderid(String purchaseorderid){
		this.purchaseorderid = purchaseorderid;
	}
	
	public String getPurchaseorderid(){
		return purchaseorderid;
	}
	
	public void setProcurecatalogid(String procurecatalogid){
		this.procurecatalogid = procurecatalogid;
	}
	
	public String getProcurecatalogid(){
		return procurecatalogid;
	}
	
	public void setPurchasecount(Long purchasecount){
		this.purchasecount = purchasecount;
	}
	
	public Long getPurchasecount(){
		return purchasecount;
	}
	
	public void setPurchaseprice(BigDecimal purchaseprice){
		this.purchaseprice = purchaseprice;
	}
	
	public BigDecimal getPurchaseprice(){
		return purchaseprice;
	}
	
	public void setPurchaseamount(BigDecimal purchaseamount){
		this.purchaseamount = purchaseamount;
	}
	
	public BigDecimal getPurchaseamount(){
		return purchaseamount;
	}
	
	public void setComidPs(String comidPs){
		this.comidPs = comidPs;
	}
	
	public String getComidPs(){
		return comidPs;
	}
	
	public void setComnamePs(String comnamePs){
		this.comnamePs = comnamePs;
	}
	
	public String getComnamePs(){
		return comnamePs;
	}
	
	public void setComidTb(String comidTb){
		this.comidTb = comidTb;
	}
	
	public String getComidTb(){
		return comidTb;
	}
	
	public void setComnameTb(String comnameTb){
		this.comnameTb = comnameTb;
	}
	
	public String getComnameTb(){
		return comnameTb;
	}
	
	public void setComnameSc(String comnameSc){
		this.comnameSc = comnameSc;
	}
	
	public String getComnameSc(){
		return comnameSc;
	}
	
	public void setDetailstatus(String detailstatus){
		this.detailstatus = detailstatus;
	}
	
	public String getDetailstatus(){
		return detailstatus;
	}
	
	public void setDetailcontime(Date detailcontime){
		this.detailcontime = detailcontime;
	}
	
	public Date getDetailcontime(){
		return detailcontime;
	}
	
	public void setNdisreson(String ndisreson){
		this.ndisreson = ndisreson;
	}
	
	public String getNdisreson(){
		return ndisreson;
	}
	
	public void setEduptime(Date eduptime){
		this.eduptime = eduptime;
	}
	
	public Date getEduptime(){
		return eduptime;
	}
	
	public void setRefuseretreson(String refuseretreson){
		this.refuseretreson = refuseretreson;
	}
	
	public String getRefuseretreson(){
		return refuseretreson;
	}
	
	public void setPodetailid(String podetailid){
		this.podetailid = podetailid;
	}
	
	public String getPodetailid(){
		return podetailid;
	}
	
	public void setPurchasedetailcontime(Date purchasedetailcontime){
		this.purchasedetailcontime = purchasedetailcontime;
	}
	
	public Date getPurchasedetailcontime(){
		return purchasedetailcontime;
	}

	public String getPurchaseordercode() {
		return purchaseordercode;
	}

	public void setPurchaseordercode(String purchaseordercode) {
		this.purchaseordercode = purchaseordercode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHosid() {
		return hosid;
	}

	public void setHosid(String hosid) {
		this.hosid = hosid;
	}

	public Date getSubmittime() {
		return submittime;
	}

	public void setSubmittime(Date submittime) {
		this.submittime = submittime;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getDetailCount() {
		return detailCount;
	}

	public void setDetailCount(String detailCount) {
		this.detailCount = detailCount;
	}

	public String getHosName() {
		return hosName;
	}

	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
}