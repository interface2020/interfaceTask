package com.trade.model;

import java.util.Date;
import java.math.BigDecimal;


/**
 *
 * @Since 2010-2020
 * @Description: TODO
 * @author ***
 * @date 2020-08-19 20:27:26
 *
 */
public class BaseDruginfoProvince  {
	
	//alias
	public static final String TABLE_ALIAS = "药品信息";
	
	//columns START
	/**
	 * @Fields procureCatalogId:商品编号
	 */
	private String procureCatalogId;
	
	/**
	 * @Fields goodsId:产品ID
	 */
	private String goodsId;
	
	/**
	 * @Fields productName:通用名
	 */
	private String productName;
	
	/**
	 * @Fields goodsName:商品名
	 */
	private String goodsName;
	
	/**
	 * @Fields medicineModel:剂型
	 */
	private String medicineModel;
	
	/**
	 * @Fields outLook:规格
	 */
	private String outLook;
	
	/**
	 * @Fields factor:转换比
	 */
	private String factor;
	
	/**
	 * @Fields materialName:包装材质
	 */
	private String materialName;
	
	/**
	 * @Fields unit:单位
	 */
	private String unit;
	
	/**
	 * @Fields companyIdSc:生产企业编号
	 */
	private String companyIdSc;
	
	/**
	 * @Fields companyNameSc:生产企业名称
	 */
	private String companyNameSc;
	
	/**
	 * @Fields companyIdTb:投标企业编号
	 */
	private String companyIdTb;
	
	/**
	 * @Fields companyNameTb:投标企业名称
	 */
	private String companyNameTb;
	
	/**
	 * @Fields purchaseType:采购类别，中标药品(0)、廉价药品(1)、紧张药品(2)、低价药品(3)、备案药品(4)
	 */
	private String purchaseType;
	
	/**
	 * @Fields sourceName:来源名称
	 */
	private String sourceName;
	
	/**
	 * @Fields middlePack:中包装
	 */
	private String middlePack;
	
	/**
	 * @Fields maxPack:大包装
	 */
	private String maxPack;
	
	/**
	 * @Fields bidPrice:中标价格
	 */
	private BigDecimal bidPrice;
	
	/**
	 * @Fields comPrice:议价药品企业自报价
	 */
	private BigDecimal comPrice;
	
	/**
	 * @Fields isurbmi:是否省医保
	 */
	private String isurbmi;
	
	/**
	 * @Fields medicalinsuranceType:医保类型
	 */
	private String medicalinsuranceType;
	
	/**
	 * @Fields isbasicdrug:是否基本药物
	 */
	private String isbasicdrug;
	
	/**
	 * @Fields isUsing:是否撤废，启用(1)停用(0)
	 */
	private String isUsing;
	
	/**
	 * @Fields ispilot:是否4+7药品 (1 是 0 否)
	 */
	private String ispilot;
	
	/**
	 * @Fields id:ID
	 */
	private String id;
	
	/**
	 * @Fields addTime:添加时间
	 */
	private Date addTime;
	
	/**
	 * @Fields lastUpdateTime:变更时间
	 */
	private Date lastUpdateTime;
	
	//columns END

	public BaseDruginfoProvince(){
	}

	public BaseDruginfoProvince(String procureCatalogId){
		this.procureCatalogId = procureCatalogId;
	}

	
	public void setProcureCatalogId(String procureCatalogId){
		this.procureCatalogId = procureCatalogId;
	}
	
	public String getProcureCatalogId(){
		return procureCatalogId;
	}
	
	public void setGoodsId(String goodsId){
		this.goodsId = goodsId;
	}
	
	public String getGoodsId(){
		return goodsId;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	
	public String getGoodsName(){
		return goodsName;
	}
	
	public void setMedicineModel(String medicineModel){
		this.medicineModel = medicineModel;
	}
	
	public String getMedicineModel(){
		return medicineModel;
	}
	
	public void setOutLook(String outLook){
		this.outLook = outLook;
	}
	
	public String getOutLook(){
		return outLook;
	}
	
	public void setFactor(String factor){
		this.factor = factor;
	}
	
	public String getFactor(){
		return factor;
	}
	
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}
	
	public String getMaterialName(){
		return materialName;
	}
	
	public void setUnit(String unit){
		this.unit = unit;
	}
	
	public String getUnit(){
		return unit;
	}
	
	public void setCompanyIdSc(String companyIdSc){
		this.companyIdSc = companyIdSc;
	}
	
	public String getCompanyIdSc(){
		return companyIdSc;
	}
	
	public void setCompanyNameSc(String companyNameSc){
		this.companyNameSc = companyNameSc;
	}
	
	public String getCompanyNameSc(){
		return companyNameSc;
	}
	
	public void setCompanyIdTb(String companyIdTb){
		this.companyIdTb = companyIdTb;
	}
	
	public String getCompanyIdTb(){
		return companyIdTb;
	}
	
	public void setCompanyNameTb(String companyNameTb){
		this.companyNameTb = companyNameTb;
	}
	
	public String getCompanyNameTb(){
		return companyNameTb;
	}
	
	public void setPurchaseType(String purchaseType){
		this.purchaseType = purchaseType;
	}
	
	public String getPurchaseType(){
		return purchaseType;
	}
	
	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}
	
	public String getSourceName(){
		return sourceName;
	}
	
	public void setMiddlePack(String middlePack){
		this.middlePack = middlePack;
	}
	
	public String getMiddlePack(){
		return middlePack;
	}
	
	public void setMaxPack(String maxPack){
		this.maxPack = maxPack;
	}
	
	public String getMaxPack(){
		return maxPack;
	}
	
	public void setBidPrice(BigDecimal bidPrice){
		this.bidPrice = bidPrice;
	}
	
	public BigDecimal getBidPrice(){
		return bidPrice;
	}
	
	public void setComPrice(BigDecimal comPrice){
		this.comPrice = comPrice;
	}
	
	public BigDecimal getComPrice(){
		return comPrice;
	}
	
	public void setIsurbmi(String isurbmi){
		this.isurbmi = isurbmi;
	}
	
	public String getIsurbmi(){
		return isurbmi;
	}
	
	public void setMedicalinsuranceType(String medicalinsuranceType){
		this.medicalinsuranceType = medicalinsuranceType;
	}
	
	public String getMedicalinsuranceType(){
		return medicalinsuranceType;
	}
	
	public void setIsbasicdrug(String isbasicdrug){
		this.isbasicdrug = isbasicdrug;
	}
	
	public String getIsbasicdrug(){
		return isbasicdrug;
	}
	
	public void setIsUsing(String isUsing){
		this.isUsing = isUsing;
	}
	
	public String getIsUsing(){
		return isUsing;
	}
	
	public void setIspilot(String ispilot){
		this.ispilot = ispilot;
	}
	
	public String getIspilot(){
		return ispilot;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
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