package com.trade.model;

import java.math.BigDecimal;
import java.util.Date;


public class TradeDruginfo {
	
	//alias
	public static final String TABLE_ALIAS = "产品表";
	
	//columns START
	/**
	 * @Fields drugid:产品流水号
	 */
	private Object drugid;
	
	/**
	 * @Fields productid:目录编号
	 */
	private Object productid;
	
	/**
	 * @Fields drugnameid:实际通用名ID
	 */
	private Object drugnameid;
	
	/**
	 * @Fields drugname:实际通用名
	 */
	private Object drugname;
	
	/**
	 * @Fields druggoodsname:商品名
	 */
	private String druggoodsname;
	
	/**
	 * @Fields drugformid:剂型名称ID
	 */
	private Object drugformid;
	
	/**
	 * @Fields drugform:剂型名称
	 */
	private Object drugform;
	
	/**
	 * @Fields drugspecid:制剂规格ID
	 */
	private Object drugspecid;
	
	/**
	 * @Fields drugspec:制剂规格
	 */
	private Object drugspec;
	
	/**
	 * @Fields drugfactor:转换系数
	 */
	private String drugfactor;
	
	/**
	 * @Fields drugunitid:包装单位ID
	 */
	private Object drugunitid;
	
	/**
	 * @Fields drugunit:包装单位
	 */
	private Object drugunit;
	
	/**
	 * @Fields preparationunitid:制剂单位ID
	 */
	private Object preparationunitid;
	
	/**
	 * @Fields preparationunit:制剂单位
	 */
	private Object preparationunit;
	
	/**
	 * @Fields drugmaterialid:包装材质ID
	 */
	private Object drugmaterialid;
	
	/**
	 * @Fields drugmaterial:包装材质
	 */
	private Object drugmaterial;
	
	/**
	 * @Fields companyidTb:投标企业编号
	 */
	private Object companyidTb;
	
	/**
	 * @Fields companyidSc:生产企业编号
	 */
	private Object companyidSc;
	
	/**
	 * @Fields companynameSc:生产企业名称
	 */
	private Object companynameSc;
	
	/**
	 * @Fields qualitylevelsid:质量层次ID
	 */
	private Object qualitylevelsid;
	
	/**
	 * @Fields regcardid:注册批件编号(进口注册证号)
	 */
	private String regcardid;
	
	/**
	 * @Fields sourceoffeed:原料来源(1本企业自产0外购)
	 */
	private Object sourceoffeed;
	
	/**
	 * @Fields typecharacteristics:剂型特点
	 */
	private Object typecharacteristics;
	
	/**
	 * @Fields reservecondition:储备条件
	 */
	private Object reservecondition;
	
	/**
	 * @Fields drugvalidity:药品有效期
	 */
	private Object drugvalidity;
	
	/**
	 * @Fields drugroute:给药途径
	 */
	private Object drugroute;
	
	/**
	 * @Fields isgmpnotice:是否有GMP受理通知书(暂无用)
	 */
	private String isgmpnotice;
	
	/**
	 * @Fields gmpid:GMP唯一标识
	 */
	private String gmpid;
	
	/**
	 * @Fields islisencenotice:是否有批准文号受理通知书，0无1有
	 */
	private String islisencenotice;
	
	/**
	 * @Fields lisencecode:批准文号
	 */
	private Object lisencecode;
	
	/**
	 * @Fields licensenumberdate:批准文号有效期至
	 */
	private Date licensenumberdate;
	
	/**
	 * @Fields internationalcertification:制剂国际认证
	 */
	private String internationalcertification;
	
	/**
	 * @Fields importcertificate:进口药品制剂国际认证类型，FDA,cGMP,JGMP
	 */
	private Object importcertificate;
	
	/**
	 * @Fields regcode:进口注册证号
	 */
	private Object regcode;
	
	/**
	 * @Fields regdate:进口注册证有效期至
	 */
	private Date regdate;
	
	/**
	 * @Fields productquality:产品质量抽检抽查情况
	 */
	private Object productquality;
	
	/**
	 * @Fields businessbribery:商业贿赂不良记录
	 */
	private Object businessbribery;
	
	/**
	 * @Fields drugdistribution:贵州省集中采购药品配送不良记录
	 */
	private Object drugdistribution;
	
	/**
	 * @Fields iselectroniccode:是否有电子监管码
	 */
	private BigDecimal iselectroniccode;
	
	/**
	 * @Fields electroniccode:电子监管码
	 */
	private Object electroniccode;
	
	/**
	 * @Fields electroniccodeunit:赋码最小包装盒
	 */
	private Object electroniccodeunit;
	
	/**
	 * @Fields electroniccodeurl:电子监管码网站截图
	 */
	private Object electroniccodeurl;
	
	/**
	 * @Fields drugqualitystandard:药品质量标准
	 */
	private Object drugqualitystandard;
	
	/**
	 * @Fields surveyreportid:最小省或市检验报告书编号
	 */
	private Object surveyreportid;
	
	/**
	 * @Fields surveyreportdate:药品检验报告有效期至
	 */
	private Date surveyreportdate;
	
	/**
	 * @Fields newdrugcode:新药证书编号
	 */
	private Object newdrugcode;
	
	/**
	 * @Fields drugstandardcode:药品本位码
	 */
	private Object drugstandardcode;
	
	/**
	 * @Fields drugansprm:自产原料药批件号
	 */
	private String drugansprm;
	
	/**
	 * @Fields drugremark:备注
	 */
	private String drugremark;
	
	/**
	 * @Fields addtime:添加时间
	 */
	private Date addtime;
	
	/**
	 * @Fields adduserid:添加用户编号
	 */
	private Object adduserid;
	
	/**
	 * @Fields drugformdescription:剂型说明
	 */
	private Object drugformdescription;
	
	/**
	 * @Fields middlepack:中包装
	 */
	private String middlepack;
	
	/**
	 * @Fields bigpack:大包装
	 */
	private String bigpack;
	
	/**
	 * @Fields drugorigin:产地(1国产2进口)
	 */
	private String drugorigin;
	
	/**
	 * @Fields catalogtype:分类采购方式(0000低价药、0001招标采购、0002谈判采购、0003直接挂网、0004定点生产、0005限额采购、0006特殊药品、0007单独定价招标谈判等)(药品分类)
	 */
	private Object catalogtype;
	
	/**
	 * @Fields isusing:启用状态
	 */
	private String isusing;
	
	/**
	 * @Fields isurbmi:是否省医保
	 */
	private String isurbmi;
	
	/**
	 * @Fields isnrcms:是否省农合
	 */
	private String isnrcms;
	
	/**
	 * @Fields isemergencymedicine:是否急抢救药品
	 */
	private String isemergencymedicine;
	
	/**
	 * @Fields isclinicalsmall:是否临床用量小药品
	 */
	private String isclinicalsmall;
	
	/**
	 * @Fields companynameTb:投标企业名称
	 */
	private Object companynameTb;
	
	/**
	 * @Fields drugcode:药品编码
	 */
	private Object drugcode;
	
	/**
	 * @Fields drugtype:药品类别(0化学药品1生物制品2中药和天然药物)
	 */
	private Object drugtype;
	
	/**
	 * @Fields drugenglishname:英文名
	 */
	private Object drugenglishname;
	
	/**
	 * @Fields drugsource:药品来源
	 */
	private Object drugsource;
	
	/**
	 * @Fields mincompanyname:最小制剂单位
	 */
	private Object mincompanyname;
	
	/**
	 * @Fields materialno:资产原料批件号
	 */
	private Object materialno;
	
	/**
	 * @Fields mindrugreportresult:药品最小检验报告书结论
	 */
	private Object mindrugreportresult;
	
	/**
	 * @Fields reportdate:批次厂检报告书检验日期
	 */
	private Date reportdate;
	
	/**
	 * @Fields reportresult:厂检验报告结论
	 */
	private Object reportresult;
	
	/**
	 * @Fields isentrust:是否委托生产
	 */
	private Object isentrust;
	
	/**
	 * @Fields entrustcode:委托生产批件编号
	 */
	private Object entrustcode;
	
	/**
	 * @Fields entrustcompanyname:受委托企业名称
	 */
	private Object entrustcompanyname;
	
	/**
	 * @Fields electronicsupervision:电子监管能力
	 */
	private Object electronicsupervision;
	
	/**
	 * @Fields abroadcompanyname:国外生产企业
	 */
	private Object abroadcompanyname;
	
	/**
	 * @Fields bidcompanyname:投标企业名称
	 */
	private Object bidcompanyname;
	
	/**
	 * @Fields drugcapacity:药品产量
	 */
	private Object drugcapacity;
	
	/**
	 * @Fields medicalinsurancetype:医保类型
	 */
	private Object medicalinsurancetype;
	
	/**
	 * @Fields medicalinsurancecode:医保编号
	 */
	private Object medicalinsurancecode;
	
	/**
	 * @Fields pricetype:定价类型
	 */
	private Object pricetype;
	
	/**
	 * @Fields governmentpricetype:原政府定价类型
	 */
	private Object governmentpricetype;
	
	/**
	 * @Fields governmentprice:原政府定价文号
	 */
	private Object governmentprice;
	
	/**
	 * @Fields isBasicDrug:是否基本药物
	 */
	private Object isBasicDrug;
	
	/**
	 * @Fields minPackUnit:最小包装单位
	 */
	private String minPackUnit;
	
	/**
	 * @Fields minReportCode:最新省或市检验报告书编号
	 */
	private String minReportCode;
	
	/**
	 * @Fields id:guid
	 */
	private String id;
	
	/**
	 * @Fields regid:药品注册证唯一标识
	 */
	private Object regid;
	
	/**
	 * @Fields enteredcomname:报名企业名称
	 */
	private Object enteredcomname;
	
	/**
	 * @Fields indication:适应症
	 */
	private String indication;
	
	/**
	 * @Fields isgmpvaild:是否通过2010版GMP认证
	 */
	private String isgmpvaild;
	
	/**
	 * @Fields entrustcompanyid:受委托企业编号
	 */
	private Object entrustcompanyid;
	
	/**
	 * @Fields regtype:药品注册批件注册分类
	 */
	private String regtype;
	
	/**
	 * @Fields regperformstandard:药品注册批件执行标准
	 */
	private String regperformstandard;
	
	/**
	 * @Fields regperformstandardcode:药品注册批件执行标准编号
	 */
	private String regperformstandardcode;
	
	/**
	 * @Fields yields:2013年产量
	 */
	private String yields;
	
	/**
	 * @Fields isdruglabel:标签0无1有
	 */
	private BigDecimal isdruglabel;
	
	/**
	 * @Fields price:药品采购价格
	 */
	private BigDecimal price;
	
	/**
	 * @Fields comprice:议价药品企业自报价
	 */
	private BigDecimal comprice;
	
	/**
	 * @Fields patenttype:"专利种类1. 发明专利；2. 实用新型专利；3. 外观设计专利；4.没有专利；9.不详。 "
	 */
	private BigDecimal patenttype;
	
	/**
	 * @Fields pack:包装单位
	 */
	private Object pack;
	
	/**
	 * @Fields isusingreason:启用禁用原因
	 */
	private Object isusingreason;
	
	/**
	 * @Fields medicinemodelstandard:剂型编码
	 */
	private String medicinemodelstandard;
	
	/**
	 * @Fields outlookcstandard:制剂规格单位
	 */
	private String outlookcstandard;
	
	/**
	 * @Fields goodsclassification:药品分类
	 */
	private String goodsclassification;
	
	/**
	 * @Fields hasinstructions:说明书
	 */
	private String hasinstructions;
	
	/**
	 * @Fields haspack:包装
	 */
	private String haspack;
	
	/**
	 * @Fields instructionsimg:产品说明书图片
	 */
	private String instructionsimg;
	
	/**
	 * @Fields entityimg:产品外包装及实物图片
	 */
	private String entityimg;
	
	/**
	 * @Fields iscountryfamous:是否是国家驰名商标  1：是  0：否
	 */
	private String iscountryfamous;
	
	/**
	 * @Fields isprovincefamous:是否是省级著名商标 1：是 0：否
	 */
	private String isprovincefamous;
	
	/**
	 * @Fields instructionsid:产品说明书图片唯一标识
	 */
	private String instructionsid;
	
	/**
	 * @Fields entityid:产品外包装及实物图片唯一标识
	 */
	private String entityid;
	
	/**
	 * @Fields isbargaining:是否议价1是0否
	 */
	private BigDecimal isbargaining;
	
	/**
	 * @Fields maxretailprice:最高零售价格
	 */
	private BigDecimal maxretailprice;
	
	/**
	 * @Fields farmgateprice:出厂到岸价
	 */
	private BigDecimal farmgateprice;
	
	/**
	 * @Fields retailprice:市场零售价
	 */
	private BigDecimal retailprice;
	
	/**
	 * @Fields nmpackprice:nmpackprice
	 */
	private BigDecimal nmpackprice;
	
	/**
	 * @Fields isfzy:仿制药一致性评价 0:否, 1:是
	 */
	private String isfzy;
	
	/**
	 * @Fields isdjy:是否低价药  0：否  1：是
	 */
	private String isdjy;
	
	/**
	 * @Fields isBasicDrugOld:是否基本药物(旧)
	 */
	private Object isBasicDrugOld;
	
	/**
	 * @Fields ypid:YPID
	 */
	private String ypid;

	private Date lastUpdateTime;

	//是否4+7药品 (1 是 0 否)
	private String ispilot;
	
	//columns END

	public TradeDruginfo(){
	}

	public TradeDruginfo(String id){
		this.id = id;
	}

	
	public void setDrugid(Object drugid){
		this.drugid = drugid;
	}
	
	public Object getDrugid(){
		return drugid;
	}
	
	public void setProductid(Object productid){
		this.productid = productid;
	}
	
	public Object getProductid(){
		return productid;
	}
	
	public void setDrugnameid(Object drugnameid){
		this.drugnameid = drugnameid;
	}
	
	public Object getDrugnameid(){
		return drugnameid;
	}
	
	public void setDrugname(Object drugname){
		this.drugname = drugname;
	}
	
	public Object getDrugname(){
		return drugname;
	}
	
	public void setDruggoodsname(String druggoodsname){
		this.druggoodsname = druggoodsname;
	}
	
	public String getDruggoodsname(){
		return druggoodsname;
	}
	
	public void setDrugformid(Object drugformid){
		this.drugformid = drugformid;
	}
	
	public Object getDrugformid(){
		return drugformid;
	}
	
	public void setDrugform(Object drugform){
		this.drugform = drugform;
	}
	
	public Object getDrugform(){
		return drugform;
	}
	
	public void setDrugspecid(Object drugspecid){
		this.drugspecid = drugspecid;
	}
	
	public Object getDrugspecid(){
		return drugspecid;
	}
	
	public void setDrugspec(Object drugspec){
		this.drugspec = drugspec;
	}
	
	public Object getDrugspec(){
		return drugspec;
	}
	
	public void setDrugfactor(String drugfactor){
		this.drugfactor = drugfactor;
	}
	
	public String getDrugfactor(){
		return drugfactor;
	}
	
	public void setDrugunitid(Object drugunitid){
		this.drugunitid = drugunitid;
	}
	
	public Object getDrugunitid(){
		return drugunitid;
	}
	
	public void setDrugunit(Object drugunit){
		this.drugunit = drugunit;
	}
	
	public Object getDrugunit(){
		return drugunit;
	}
	
	public void setPreparationunitid(Object preparationunitid){
		this.preparationunitid = preparationunitid;
	}
	
	public Object getPreparationunitid(){
		return preparationunitid;
	}
	
	public void setPreparationunit(Object preparationunit){
		this.preparationunit = preparationunit;
	}
	
	public Object getPreparationunit(){
		return preparationunit;
	}
	
	public void setDrugmaterialid(Object drugmaterialid){
		this.drugmaterialid = drugmaterialid;
	}
	
	public Object getDrugmaterialid(){
		return drugmaterialid;
	}
	
	public void setDrugmaterial(Object drugmaterial){
		this.drugmaterial = drugmaterial;
	}
	
	public Object getDrugmaterial(){
		return drugmaterial;
	}
	
	public void setCompanyidTb(Object companyidTb){
		this.companyidTb = companyidTb;
	}
	
	public Object getCompanyidTb(){
		return companyidTb;
	}
	
	public void setCompanyidSc(Object companyidSc){
		this.companyidSc = companyidSc;
	}
	
	public Object getCompanyidSc(){
		return companyidSc;
	}
	
	public void setCompanynameSc(Object companynameSc){
		this.companynameSc = companynameSc;
	}
	
	public Object getCompanynameSc(){
		return companynameSc;
	}
	
	public void setQualitylevelsid(Object qualitylevelsid){
		this.qualitylevelsid = qualitylevelsid;
	}
	
	public Object getQualitylevelsid(){
		return qualitylevelsid;
	}
	
	public void setRegcardid(String regcardid){
		this.regcardid = regcardid;
	}
	
	public String getRegcardid(){
		return regcardid;
	}
	
	public void setSourceoffeed(Object sourceoffeed){
		this.sourceoffeed = sourceoffeed;
	}
	
	public Object getSourceoffeed(){
		return sourceoffeed;
	}
	
	public void setTypecharacteristics(Object typecharacteristics){
		this.typecharacteristics = typecharacteristics;
	}
	
	public Object getTypecharacteristics(){
		return typecharacteristics;
	}
	
	public void setReservecondition(Object reservecondition){
		this.reservecondition = reservecondition;
	}
	
	public Object getReservecondition(){
		return reservecondition;
	}
	
	public void setDrugvalidity(Object drugvalidity){
		this.drugvalidity = drugvalidity;
	}
	
	public Object getDrugvalidity(){
		return drugvalidity;
	}
	
	public void setDrugroute(Object drugroute){
		this.drugroute = drugroute;
	}
	
	public Object getDrugroute(){
		return drugroute;
	}
	
	public void setIsgmpnotice(String isgmpnotice){
		this.isgmpnotice = isgmpnotice;
	}
	
	public String getIsgmpnotice(){
		return isgmpnotice;
	}
	
	public void setGmpid(String gmpid){
		this.gmpid = gmpid;
	}
	
	public String getGmpid(){
		return gmpid;
	}
	
	public void setIslisencenotice(String islisencenotice){
		this.islisencenotice = islisencenotice;
	}
	
	public String getIslisencenotice(){
		return islisencenotice;
	}
	
	public void setLisencecode(Object lisencecode){
		this.lisencecode = lisencecode;
	}
	
	public Object getLisencecode(){
		return lisencecode;
	}
	
	public void setLicensenumberdate(Date licensenumberdate){
		this.licensenumberdate = licensenumberdate;
	}
	
	public Date getLicensenumberdate(){
		return licensenumberdate;
	}
	
	public void setInternationalcertification(String internationalcertification){
		this.internationalcertification = internationalcertification;
	}
	
	public String getInternationalcertification(){
		return internationalcertification;
	}
	
	public void setImportcertificate(Object importcertificate){
		this.importcertificate = importcertificate;
	}
	
	public Object getImportcertificate(){
		return importcertificate;
	}
	
	public void setRegcode(Object regcode){
		this.regcode = regcode;
	}
	
	public Object getRegcode(){
		return regcode;
	}
	
	public void setRegdate(Date regdate){
		this.regdate = regdate;
	}
	
	public Date getRegdate(){
		return regdate;
	}
	
	public void setProductquality(Object productquality){
		this.productquality = productquality;
	}
	
	public Object getProductquality(){
		return productquality;
	}
	
	public void setBusinessbribery(Object businessbribery){
		this.businessbribery = businessbribery;
	}
	
	public Object getBusinessbribery(){
		return businessbribery;
	}
	
	public void setDrugdistribution(Object drugdistribution){
		this.drugdistribution = drugdistribution;
	}
	
	public Object getDrugdistribution(){
		return drugdistribution;
	}
	
	public void setIselectroniccode(BigDecimal iselectroniccode){
		this.iselectroniccode = iselectroniccode;
	}
	
	public BigDecimal getIselectroniccode(){
		return iselectroniccode;
	}
	
	public void setElectroniccode(Object electroniccode){
		this.electroniccode = electroniccode;
	}
	
	public Object getElectroniccode(){
		return electroniccode;
	}
	
	public void setElectroniccodeunit(Object electroniccodeunit){
		this.electroniccodeunit = electroniccodeunit;
	}
	
	public Object getElectroniccodeunit(){
		return electroniccodeunit;
	}
	
	public void setElectroniccodeurl(Object electroniccodeurl){
		this.electroniccodeurl = electroniccodeurl;
	}
	
	public Object getElectroniccodeurl(){
		return electroniccodeurl;
	}
	
	public void setDrugqualitystandard(Object drugqualitystandard){
		this.drugqualitystandard = drugqualitystandard;
	}
	
	public Object getDrugqualitystandard(){
		return drugqualitystandard;
	}
	
	public void setSurveyreportid(Object surveyreportid){
		this.surveyreportid = surveyreportid;
	}
	
	public Object getSurveyreportid(){
		return surveyreportid;
	}
	
	public void setSurveyreportdate(Date surveyreportdate){
		this.surveyreportdate = surveyreportdate;
	}
	
	public Date getSurveyreportdate(){
		return surveyreportdate;
	}
	
	public void setNewdrugcode(Object newdrugcode){
		this.newdrugcode = newdrugcode;
	}
	
	public Object getNewdrugcode(){
		return newdrugcode;
	}
	
	public void setDrugstandardcode(Object drugstandardcode){
		this.drugstandardcode = drugstandardcode;
	}
	
	public Object getDrugstandardcode(){
		return drugstandardcode;
	}
	
	public void setDrugansprm(String drugansprm){
		this.drugansprm = drugansprm;
	}
	
	public String getDrugansprm(){
		return drugansprm;
	}
	
	public void setDrugremark(String drugremark){
		this.drugremark = drugremark;
	}
	
	public String getDrugremark(){
		return drugremark;
	}
	
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	
	public Date getAddtime(){
		return addtime;
	}
	
	public void setAdduserid(Object adduserid){
		this.adduserid = adduserid;
	}
	
	public Object getAdduserid(){
		return adduserid;
	}
	
	public void setDrugformdescription(Object drugformdescription){
		this.drugformdescription = drugformdescription;
	}
	
	public Object getDrugformdescription(){
		return drugformdescription;
	}
	
	public void setMiddlepack(String middlepack){
		this.middlepack = middlepack;
	}
	
	public String getMiddlepack(){
		return middlepack;
	}
	
	public void setBigpack(String bigpack){
		this.bigpack = bigpack;
	}
	
	public String getBigpack(){
		return bigpack;
	}
	
	public void setDrugorigin(String drugorigin){
		this.drugorigin = drugorigin;
	}
	
	public String getDrugorigin(){
		return drugorigin;
	}
	
	public void setCatalogtype(Object catalogtype){
		this.catalogtype = catalogtype;
	}
	
	public Object getCatalogtype(){
		return catalogtype;
	}
	
	public void setIsusing(String isusing){
		this.isusing = isusing;
	}
	
	public String getIsusing(){
		return isusing;
	}
	
	public void setIsurbmi(String isurbmi){
		this.isurbmi = isurbmi;
	}
	
	public String getIsurbmi(){
		return isurbmi;
	}
	
	public void setIsnrcms(String isnrcms){
		this.isnrcms = isnrcms;
	}
	
	public String getIsnrcms(){
		return isnrcms;
	}
	
	public void setIsemergencymedicine(String isemergencymedicine){
		this.isemergencymedicine = isemergencymedicine;
	}
	
	public String getIsemergencymedicine(){
		return isemergencymedicine;
	}
	
	public void setIsclinicalsmall(String isclinicalsmall){
		this.isclinicalsmall = isclinicalsmall;
	}
	
	public String getIsclinicalsmall(){
		return isclinicalsmall;
	}
	
	public void setCompanynameTb(Object companynameTb){
		this.companynameTb = companynameTb;
	}
	
	public Object getCompanynameTb(){
		return companynameTb;
	}
	
	public void setDrugcode(Object drugcode){
		this.drugcode = drugcode;
	}
	
	public Object getDrugcode(){
		return drugcode;
	}
	
	public void setDrugtype(Object drugtype){
		this.drugtype = drugtype;
	}
	
	public Object getDrugtype(){
		return drugtype;
	}
	
	public void setDrugenglishname(Object drugenglishname){
		this.drugenglishname = drugenglishname;
	}
	
	public Object getDrugenglishname(){
		return drugenglishname;
	}
	
	public void setDrugsource(Object drugsource){
		this.drugsource = drugsource;
	}
	
	public Object getDrugsource(){
		return drugsource;
	}
	
	public void setMincompanyname(Object mincompanyname){
		this.mincompanyname = mincompanyname;
	}
	
	public Object getMincompanyname(){
		return mincompanyname;
	}
	
	public void setMaterialno(Object materialno){
		this.materialno = materialno;
	}
	
	public Object getMaterialno(){
		return materialno;
	}
	
	public void setMindrugreportresult(Object mindrugreportresult){
		this.mindrugreportresult = mindrugreportresult;
	}
	
	public Object getMindrugreportresult(){
		return mindrugreportresult;
	}
	
	public void setReportdate(Date reportdate){
		this.reportdate = reportdate;
	}
	
	public Date getReportdate(){
		return reportdate;
	}
	
	public void setReportresult(Object reportresult){
		this.reportresult = reportresult;
	}
	
	public Object getReportresult(){
		return reportresult;
	}
	
	public void setIsentrust(Object isentrust){
		this.isentrust = isentrust;
	}
	
	public Object getIsentrust(){
		return isentrust;
	}
	
	public void setEntrustcode(Object entrustcode){
		this.entrustcode = entrustcode;
	}
	
	public Object getEntrustcode(){
		return entrustcode;
	}
	
	public void setEntrustcompanyname(Object entrustcompanyname){
		this.entrustcompanyname = entrustcompanyname;
	}
	
	public Object getEntrustcompanyname(){
		return entrustcompanyname;
	}
	
	public void setElectronicsupervision(Object electronicsupervision){
		this.electronicsupervision = electronicsupervision;
	}
	
	public Object getElectronicsupervision(){
		return electronicsupervision;
	}
	
	public void setAbroadcompanyname(Object abroadcompanyname){
		this.abroadcompanyname = abroadcompanyname;
	}
	
	public Object getAbroadcompanyname(){
		return abroadcompanyname;
	}
	
	public void setBidcompanyname(Object bidcompanyname){
		this.bidcompanyname = bidcompanyname;
	}
	
	public Object getBidcompanyname(){
		return bidcompanyname;
	}
	
	public void setDrugcapacity(Object drugcapacity){
		this.drugcapacity = drugcapacity;
	}
	
	public Object getDrugcapacity(){
		return drugcapacity;
	}
	
	public void setMedicalinsurancetype(Object medicalinsurancetype){
		this.medicalinsurancetype = medicalinsurancetype;
	}
	
	public Object getMedicalinsurancetype(){
		return medicalinsurancetype;
	}
	
	public void setMedicalinsurancecode(Object medicalinsurancecode){
		this.medicalinsurancecode = medicalinsurancecode;
	}
	
	public Object getMedicalinsurancecode(){
		return medicalinsurancecode;
	}
	
	public void setPricetype(Object pricetype){
		this.pricetype = pricetype;
	}
	
	public Object getPricetype(){
		return pricetype;
	}
	
	public void setGovernmentpricetype(Object governmentpricetype){
		this.governmentpricetype = governmentpricetype;
	}
	
	public Object getGovernmentpricetype(){
		return governmentpricetype;
	}
	
	public void setGovernmentprice(Object governmentprice){
		this.governmentprice = governmentprice;
	}
	
	public Object getGovernmentprice(){
		return governmentprice;
	}
	
	public void setIsBasicDrug(Object isBasicDrug){
		this.isBasicDrug = isBasicDrug;
	}
	
	public Object getIsBasicDrug(){
		return isBasicDrug;
	}
	
	public void setMinPackUnit(String minPackUnit){
		this.minPackUnit = minPackUnit;
	}
	
	public String getMinPackUnit(){
		return minPackUnit;
	}
	
	public void setMinReportCode(String minReportCode){
		this.minReportCode = minReportCode;
	}
	
	public String getMinReportCode(){
		return minReportCode;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setRegid(Object regid){
		this.regid = regid;
	}
	
	public Object getRegid(){
		return regid;
	}
	
	public void setEnteredcomname(Object enteredcomname){
		this.enteredcomname = enteredcomname;
	}
	
	public Object getEnteredcomname(){
		return enteredcomname;
	}
	
	public void setIndication(String indication){
		this.indication = indication;
	}
	
	public String getIndication(){
		return indication;
	}
	
	public void setIsgmpvaild(String isgmpvaild){
		this.isgmpvaild = isgmpvaild;
	}
	
	public String getIsgmpvaild(){
		return isgmpvaild;
	}
	
	public void setEntrustcompanyid(Object entrustcompanyid){
		this.entrustcompanyid = entrustcompanyid;
	}
	
	public Object getEntrustcompanyid(){
		return entrustcompanyid;
	}
	
	public void setRegtype(String regtype){
		this.regtype = regtype;
	}
	
	public String getRegtype(){
		return regtype;
	}
	
	public void setRegperformstandard(String regperformstandard){
		this.regperformstandard = regperformstandard;
	}
	
	public String getRegperformstandard(){
		return regperformstandard;
	}
	
	public void setRegperformstandardcode(String regperformstandardcode){
		this.regperformstandardcode = regperformstandardcode;
	}
	
	public String getRegperformstandardcode(){
		return regperformstandardcode;
	}
	
	public void setYields(String yields){
		this.yields = yields;
	}
	
	public String getYields(){
		return yields;
	}
	
	public void setIsdruglabel(BigDecimal isdruglabel){
		this.isdruglabel = isdruglabel;
	}
	
	public BigDecimal getIsdruglabel(){
		return isdruglabel;
	}
	
	public void setPrice(BigDecimal price){
		this.price = price;
	}
	
	public BigDecimal getPrice(){
		return price;
	}
	
	public void setComprice(BigDecimal comprice){
		this.comprice = comprice;
	}
	
	public BigDecimal getComprice(){
		return comprice;
	}
	
	public void setPatenttype(BigDecimal patenttype){
		this.patenttype = patenttype;
	}
	
	public BigDecimal getPatenttype(){
		return patenttype;
	}
	
	public void setPack(Object pack){
		this.pack = pack;
	}
	
	public Object getPack(){
		return pack;
	}
	
	public void setIsusingreason(Object isusingreason){
		this.isusingreason = isusingreason;
	}
	
	public Object getIsusingreason(){
		return isusingreason;
	}
	
	public void setMedicinemodelstandard(String medicinemodelstandard){
		this.medicinemodelstandard = medicinemodelstandard;
	}
	
	public String getMedicinemodelstandard(){
		return medicinemodelstandard;
	}
	
	public void setOutlookcstandard(String outlookcstandard){
		this.outlookcstandard = outlookcstandard;
	}
	
	public String getOutlookcstandard(){
		return outlookcstandard;
	}
	
	public void setGoodsclassification(String goodsclassification){
		this.goodsclassification = goodsclassification;
	}
	
	public String getGoodsclassification(){
		return goodsclassification;
	}
	
	public void setHasinstructions(String hasinstructions){
		this.hasinstructions = hasinstructions;
	}
	
	public String getHasinstructions(){
		return hasinstructions;
	}
	
	public void setHaspack(String haspack){
		this.haspack = haspack;
	}
	
	public String getHaspack(){
		return haspack;
	}
	
	public void setInstructionsimg(String instructionsimg){
		this.instructionsimg = instructionsimg;
	}
	
	public String getInstructionsimg(){
		return instructionsimg;
	}
	
	public void setEntityimg(String entityimg){
		this.entityimg = entityimg;
	}
	
	public String getEntityimg(){
		return entityimg;
	}
	
	public void setIscountryfamous(String iscountryfamous){
		this.iscountryfamous = iscountryfamous;
	}
	
	public String getIscountryfamous(){
		return iscountryfamous;
	}
	
	public void setIsprovincefamous(String isprovincefamous){
		this.isprovincefamous = isprovincefamous;
	}
	
	public String getIsprovincefamous(){
		return isprovincefamous;
	}
	
	public void setInstructionsid(String instructionsid){
		this.instructionsid = instructionsid;
	}
	
	public String getInstructionsid(){
		return instructionsid;
	}
	
	public void setEntityid(String entityid){
		this.entityid = entityid;
	}
	
	public String getEntityid(){
		return entityid;
	}
	
	public void setIsbargaining(BigDecimal isbargaining){
		this.isbargaining = isbargaining;
	}
	
	public BigDecimal getIsbargaining(){
		return isbargaining;
	}
	
	public void setMaxretailprice(BigDecimal maxretailprice){
		this.maxretailprice = maxretailprice;
	}
	
	public BigDecimal getMaxretailprice(){
		return maxretailprice;
	}
	
	public void setFarmgateprice(BigDecimal farmgateprice){
		this.farmgateprice = farmgateprice;
	}
	
	public BigDecimal getFarmgateprice(){
		return farmgateprice;
	}
	
	public void setRetailprice(BigDecimal retailprice){
		this.retailprice = retailprice;
	}
	
	public BigDecimal getRetailprice(){
		return retailprice;
	}
	
	public void setNmpackprice(BigDecimal nmpackprice){
		this.nmpackprice = nmpackprice;
	}
	
	public BigDecimal getNmpackprice(){
		return nmpackprice;
	}
	
	public void setIsfzy(String isfzy){
		this.isfzy = isfzy;
	}
	
	public String getIsfzy(){
		return isfzy;
	}
	
	public void setIsdjy(String isdjy){
		this.isdjy = isdjy;
	}
	
	public String getIsdjy(){
		return isdjy;
	}
	
	public void setIsBasicDrugOld(Object isBasicDrugOld){
		this.isBasicDrugOld = isBasicDrugOld;
	}
	
	public Object getIsBasicDrugOld(){
		return isBasicDrugOld;
	}
	
	public void setYpid(String ypid){
		this.ypid = ypid;
	}
	
	public String getYpid(){
		return ypid;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getIspilot() {
		return ispilot;
	}

	public void setIspilot(String ispilot) {
		this.ispilot = ispilot;
	}
}