package com.trade.model;

import java.math.BigDecimal;
import java.util.Date;


public class TradeCominfo {
	
	//alias
	public static final String TABLE_ALIAS = "企业表";
	
	//columns START
	/**
	 * @Fields companyid:企业编码
	 */
	private Object companyid;
	
	/**
	 * @Fields companyname:企业名称
	 */
	private Object companyname;
	
	/**
	 * @Fields compshortname:企业简称
	 */
	private Object compshortname;
	
	/**
	 * @Fields companytype:企业类型 0:生产企业;1:投标(代理)企业;2:生产(代理)企业;3:配送企业;4:国外生产企业
	 */
	private String companytype;
	
	/**
	 * @Fields areaid:注册地区编号
	 */
	private String areaid;
	
	/**
	 * @Fields regaddress:企业注册地址
	 */
	private Object regaddress;
	
	/**
	 * @Fields addressid:企业所在地区编号
	 */
	private String addressid;
	
	/**
	 * @Fields address:企业联系地址
	 */
	private Object address;
	
	/**
	 * @Fields zipcode:邮政编码
	 */
	private String zipcode;
	
	/**
	 * @Fields companytel:企业联系电话
	 */
	private String companytel;
	
	/**
	 * @Fields fax:企业传真
	 */
	private String fax;
	
	/**
	 * @Fields fixfund:企业注册资金（万元）
	 */
	private BigDecimal fixfund;
	
	/**
	 * @Fields lawer:法人代表姓名
	 */
	private String lawer;
	
	/**
	 * @Fields laweridcard:法人代表身份证号
	 */
	private String laweridcard;
	
	/**
	 * @Fields laweremail:法定代表人电子信箱
	 */
	private String laweremail;
	
	/**
	 * @Fields lawermobilephone:法定代表人手机
	 */
	private String lawermobilephone;
	
	/**
	 * @Fields mandatary:被授权人
	 */
	private String mandatary;
	
	/**
	 * @Fields mandataryidcard:被授权人身份证号
	 */
	private String mandataryidcard;
	
	/**
	 * @Fields mobilephone:被授权人联系电话
	 */
	private String mobilephone;
	
	/**
	 * @Fields email:被授权人电子邮件
	 */
	private String email;
	
	/**
	 * @Fields introduction:公司简介
	 */
	private String introduction;
	
	/**
	 * @Fields lastyearincome:上年销售额（万元）
	 */
	private BigDecimal lastyearincome;
	
	/**
	 * @Fields chemicalsrank:化学药排名
	 */
	private BigDecimal chemicalsrank;
	
	/**
	 * @Fields chinesedrugsranks:中成药排名
	 */
	private BigDecimal chinesedrugsranks;
	
	/**
	 * @Fields biologicalproductranks:生物制品排名
	 */
	private BigDecimal biologicalproductranks;
	
	/**
	 * @Fields warrantcode:生产许可证号
	 */
	private String warrantcode;
	
	/**
	 * @Fields warrandate:生产许可证有效期
	 */
	private Date warrandate;
	
	/**
	 * @Fields businesslicence:企业营业执照
	 */
	private String businesslicence;
	
	/**
	 * @Fields businessdate:企业营业执照有效期
	 */
	private Date businessdate;
	
	/**
	 * @Fields companycode:组织机构代码证代码
	 */
	private String companycode;
	
	/**
	 * @Fields codedate:组织机构代码证代码有效期
	 */
	private Date codedate;
	
	/**
	 * @Fields isadequatesupply:是否保证供应承诺函
	 */
	private BigDecimal isadequatesupply;
	
	/**
	 * @Fields isdistribution:是否配送承诺函
	 */
	private BigDecimal isdistribution;
	
	/**
	 * @Fields iscrime:是否无违法违纪行为0无1有，0为默认
	 */
	private BigDecimal iscrime;
	
	/**
	 * @Fields companyregisterid:企业注册编号
	 */
	private Object companyregisterid;
	
	/**
	 * @Fields adduserid:添加用户编号
	 */
	private Object adduserid;
	
	/**
	 * @Fields addtime:添加时间
	 */
	private Date addtime;
	
	/**
	 * @Fields distribution:是否配送（0：不配送 1：配送）
	 */
	private String distribution;
	
	/**
	 * @Fields disareaid:配送区域ID
	 */
	private String disareaid;
	
	/**
	 * @Fields lawerjob:法定代表人职务
	 */
	private String lawerjob;
	
	/**
	 * @Fields lawercall:法定代表人电话
	 */
	private String lawercall;
	
	/**
	 * @Fields regcardcount:注册证数量
	 */
	private BigDecimal regcardcount;
	
	/**
	 * @Fields drugcount:药品数量
	 */
	private BigDecimal drugcount;
	
	/**
	 * @Fields tptalassets:总资产
	 */
	private BigDecimal tptalassets;
	
	/**
	 * @Fields fixedassets:固定资产
	 */
	private BigDecimal fixedassets;
	
	/**
	 * @Fields gspcode:GSP证书编号
	 */
	private String gspcode;
	
	/**
	 * @Fields gspendtime:GSP证书到期时间
	 */
	private Date gspendtime;
	
	/**
	 * @Fields issecularlicence:是否长期生产或经营许可证
	 */
	private String issecularlicence;
	
	/**
	 * @Fields isjly:两年内有无假劣要记录
	 */
	private String isjly;
	
	/**
	 * @Fields isbusinesslicence:是否长期营业执照
	 */
	private String isbusinesslicence;
	
	/**
	 * @Fields id:唯一标识
	 */
	private String id;
	
	/**
	 * @Fields creditcode:统一社会信用代码证号
	 */
	private Object creditcode;
	
	/**
	 * @Fields reportdate:年度报告公示日期
	 */
	private Date reportdate;
	
	/**
	 * @Fields lastyeartotal:上年度资产总额
	 */
	private BigDecimal lastyeartotal;
	
	/**
	 * @Fields isnwkt:是否国家驰名商标
	 */
	private Object isnwkt;
	
	/**
	 * @Fields ispft:是否省级著名商标
	 */
	private Object ispft;
	
	/**
	 * @Fields companyemergencytel:企业紧急联系电话
	 */
	private Object companyemergencytel;
	
	/**
	 * @Fields varietynumber:药品储备品种数
	 */
	private Object varietynumber;
	
	/**
	 * @Fields productgauge:药品储备品规数
	 */
	private Object productgauge;
	
	/**
	 * @Fields winvarietynumber:药品储备中标药品品种数
	 */
	private Object winvarietynumber;
	
	/**
	 * @Fields winproductgauge:药品储备中标药品品规数
	 */
	private Object winproductgauge;
	
	/**
	 * @Fields warehousearea:仓库面积
	 */
	private Object warehousearea;
	
	/**
	 * @Fields iswon:自有
	 */
	private Object iswon;
	
	/**
	 * @Fields pickingsystem:独立拣货系统
	 */
	private Object pickingsystem;
	
	/**
	 * @Fields computersystem:独立的计算机管理系统
	 */
	private Object computersystem;
	
	/**
	 * @Fields inventorysystem:独立的库存管理系统
	 */
	private Object inventorysystem;
	
	/**
	 * @Fields platformdocking:与自治区药品平台对接能力
	 */
	private Object platformdocking;
	
	/**
	 * @Fields lastyearbusinessincome:上年度主营业务收入
	 */
	private BigDecimal lastyearbusinessincome;
	
	/**
	 * @Fields violationstatement:企业出具的两年无违法违规声明
	 */
	private Object violationstatement;
	
	/**
	 * @Fields comcriticaltel:企业紧急联系电话
	 */
	private String comcriticaltel;
	
	/**
	 * @Fields mandatarycriticaltel:被授权人紧急联系电话
	 */
	private String mandatarycriticaltel;
	
	/**
	 * @Fields isusing:是否启用(1:启用,0:禁用)
	 */
	private BigDecimal isusing;
	
	/**
	 * @Fields companycategory:企业类型
	 */
	private Object companycategory;
	
	/**
	 * @Fields businessscope:2013年以来无生产假劣药品记录
	 */
	private String businessscope;
	
	/**
	 * @Fields iscreditcode:是否三证合一
	 */
	private BigDecimal iscreditcode;
	
	/**
	 * @Fields trcid:税务登记证唯一标识
	 */
	private String trcid;
	
	/**
	 * @Fields businesslicenseid:经营许可证唯一标识
	 */
	private String businesslicenseid;
	
	/**
	 * @Fields isusingreason:启用禁用原因
	 */
	private Object isusingreason;
	
	/**
	 * @Fields ischangename:企业名称是否变更
	 */
	private String ischangename;
	
	/**
	 * @Fields beforename:变更前名称
	 */
	private String beforename;
	
	/**
	 * @Fields isgeneralagreement:国外生产企业的委托授权书或总代理协议等证明材料
	 */
	private String isgeneralagreement;
	
	/**
	 * @Fields companyidold:用户编号
	 */
	private String companyidold;
	
	/**
	 * @Fields companyidSc:直接配送关联的生产企业编号
	 */
	private String companyidSc;
	
	/**
	 * @Fields companynameSc:直接配送关联的生产企业名称
	 */
	private String companynameSc;
	
	/**
	 * @Fields businesslicenceimg:营业执照图片
	 */
	private String businesslicenceimg;
	
	/**
	 * @Fields warrantimg:药品经营许可证图片
	 */
	private String warrantimg;
	
	/**
	 * @Fields authorizationimg:法人授权书图片
	 */
	private String authorizationimg;
	
	/**
	 * @Fields gspimg:药品经营质量管理规范证图片
	 */
	private String gspimg;
	
	/**
	 * @Fields otherinformation:企业其他相关信息
	 */
	private String otherinformation;
	
	/**
	 * @Fields isfiveone:isfiveone
	 */
	private BigDecimal isfiveone;
	
	/**
	 * @Fields fivecode:fivecode
	 */
	private Object fivecode;
	
	/**
	 * @Fields isscdis:是否生产企业直接配送,0:否 , 1:是
	 */
	private String isscdis;
	
	/**
	 * @Fields nssbh:纳税识别号
	 */
	private String nssbh;
	
	/**
	 * @Fields isyq:是否延期：0否 ,1是
	 */
	private String isyq;

	private Date lastUpdateTime;
	
	//columns END

	public TradeCominfo(){
	}

	public TradeCominfo(String id){
		this.id = id;
	}

	
	public void setCompanyid(Object companyid){
		this.companyid = companyid;
	}
	
	public Object getCompanyid(){
		return companyid;
	}
	
	public void setCompanyname(Object companyname){
		this.companyname = companyname;
	}
	
	public Object getCompanyname(){
		return companyname;
	}
	
	public void setCompshortname(Object compshortname){
		this.compshortname = compshortname;
	}
	
	public Object getCompshortname(){
		return compshortname;
	}
	
	public void setCompanytype(String companytype){
		this.companytype = companytype;
	}
	
	public String getCompanytype(){
		return companytype;
	}
	
	public void setAreaid(String areaid){
		this.areaid = areaid;
	}
	
	public String getAreaid(){
		return areaid;
	}
	
	public void setRegaddress(Object regaddress){
		this.regaddress = regaddress;
	}
	
	public Object getRegaddress(){
		return regaddress;
	}
	
	public void setAddressid(String addressid){
		this.addressid = addressid;
	}
	
	public String getAddressid(){
		return addressid;
	}
	
	public void setAddress(Object address){
		this.address = address;
	}
	
	public Object getAddress(){
		return address;
	}
	
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public void setCompanytel(String companytel){
		this.companytel = companytel;
	}
	
	public String getCompanytel(){
		return companytel;
	}
	
	public void setFax(String fax){
		this.fax = fax;
	}
	
	public String getFax(){
		return fax;
	}
	
	public void setFixfund(BigDecimal fixfund){
		this.fixfund = fixfund;
	}
	
	public BigDecimal getFixfund(){
		return fixfund;
	}
	
	public void setLawer(String lawer){
		this.lawer = lawer;
	}
	
	public String getLawer(){
		return lawer;
	}
	
	public void setLaweridcard(String laweridcard){
		this.laweridcard = laweridcard;
	}
	
	public String getLaweridcard(){
		return laweridcard;
	}
	
	public void setLaweremail(String laweremail){
		this.laweremail = laweremail;
	}
	
	public String getLaweremail(){
		return laweremail;
	}
	
	public void setLawermobilephone(String lawermobilephone){
		this.lawermobilephone = lawermobilephone;
	}
	
	public String getLawermobilephone(){
		return lawermobilephone;
	}
	
	public void setMandatary(String mandatary){
		this.mandatary = mandatary;
	}
	
	public String getMandatary(){
		return mandatary;
	}
	
	public void setMandataryidcard(String mandataryidcard){
		this.mandataryidcard = mandataryidcard;
	}
	
	public String getMandataryidcard(){
		return mandataryidcard;
	}
	
	public void setMobilephone(String mobilephone){
		this.mobilephone = mobilephone;
	}
	
	public String getMobilephone(){
		return mobilephone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}
	
	public String getIntroduction(){
		return introduction;
	}
	
	public void setLastyearincome(BigDecimal lastyearincome){
		this.lastyearincome = lastyearincome;
	}
	
	public BigDecimal getLastyearincome(){
		return lastyearincome;
	}
	
	public void setChemicalsrank(BigDecimal chemicalsrank){
		this.chemicalsrank = chemicalsrank;
	}
	
	public BigDecimal getChemicalsrank(){
		return chemicalsrank;
	}
	
	public void setChinesedrugsranks(BigDecimal chinesedrugsranks){
		this.chinesedrugsranks = chinesedrugsranks;
	}
	
	public BigDecimal getChinesedrugsranks(){
		return chinesedrugsranks;
	}
	
	public void setBiologicalproductranks(BigDecimal biologicalproductranks){
		this.biologicalproductranks = biologicalproductranks;
	}
	
	public BigDecimal getBiologicalproductranks(){
		return biologicalproductranks;
	}
	
	public void setWarrantcode(String warrantcode){
		this.warrantcode = warrantcode;
	}
	
	public String getWarrantcode(){
		return warrantcode;
	}
	
	public void setWarrandate(Date warrandate){
		this.warrandate = warrandate;
	}
	
	public Date getWarrandate(){
		return warrandate;
	}
	
	public void setBusinesslicence(String businesslicence){
		this.businesslicence = businesslicence;
	}
	
	public String getBusinesslicence(){
		return businesslicence;
	}
	
	public void setBusinessdate(Date businessdate){
		this.businessdate = businessdate;
	}
	
	public Date getBusinessdate(){
		return businessdate;
	}
	
	public void setCompanycode(String companycode){
		this.companycode = companycode;
	}
	
	public String getCompanycode(){
		return companycode;
	}
	
	public void setCodedate(Date codedate){
		this.codedate = codedate;
	}
	
	public Date getCodedate(){
		return codedate;
	}
	
	public void setIsadequatesupply(BigDecimal isadequatesupply){
		this.isadequatesupply = isadequatesupply;
	}
	
	public BigDecimal getIsadequatesupply(){
		return isadequatesupply;
	}
	
	public void setIsdistribution(BigDecimal isdistribution){
		this.isdistribution = isdistribution;
	}
	
	public BigDecimal getIsdistribution(){
		return isdistribution;
	}
	
	public void setIscrime(BigDecimal iscrime){
		this.iscrime = iscrime;
	}
	
	public BigDecimal getIscrime(){
		return iscrime;
	}
	
	public void setCompanyregisterid(Object companyregisterid){
		this.companyregisterid = companyregisterid;
	}
	
	public Object getCompanyregisterid(){
		return companyregisterid;
	}
	
	public void setAdduserid(Object adduserid){
		this.adduserid = adduserid;
	}
	
	public Object getAdduserid(){
		return adduserid;
	}
	
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	
	public Date getAddtime(){
		return addtime;
	}
	
	public void setDistribution(String distribution){
		this.distribution = distribution;
	}
	
	public String getDistribution(){
		return distribution;
	}
	
	public void setDisareaid(String disareaid){
		this.disareaid = disareaid;
	}
	
	public String getDisareaid(){
		return disareaid;
	}
	
	public void setLawerjob(String lawerjob){
		this.lawerjob = lawerjob;
	}
	
	public String getLawerjob(){
		return lawerjob;
	}
	
	public void setLawercall(String lawercall){
		this.lawercall = lawercall;
	}
	
	public String getLawercall(){
		return lawercall;
	}
	
	public void setRegcardcount(BigDecimal regcardcount){
		this.regcardcount = regcardcount;
	}
	
	public BigDecimal getRegcardcount(){
		return regcardcount;
	}
	
	public void setDrugcount(BigDecimal drugcount){
		this.drugcount = drugcount;
	}
	
	public BigDecimal getDrugcount(){
		return drugcount;
	}
	
	public void setTptalassets(BigDecimal tptalassets){
		this.tptalassets = tptalassets;
	}
	
	public BigDecimal getTptalassets(){
		return tptalassets;
	}
	
	public void setFixedassets(BigDecimal fixedassets){
		this.fixedassets = fixedassets;
	}
	
	public BigDecimal getFixedassets(){
		return fixedassets;
	}
	
	public void setGspcode(String gspcode){
		this.gspcode = gspcode;
	}
	
	public String getGspcode(){
		return gspcode;
	}
	
	public void setGspendtime(Date gspendtime){
		this.gspendtime = gspendtime;
	}
	
	public Date getGspendtime(){
		return gspendtime;
	}
	
	public void setIssecularlicence(String issecularlicence){
		this.issecularlicence = issecularlicence;
	}
	
	public String getIssecularlicence(){
		return issecularlicence;
	}
	
	public void setIsjly(String isjly){
		this.isjly = isjly;
	}
	
	public String getIsjly(){
		return isjly;
	}
	
	public void setIsbusinesslicence(String isbusinesslicence){
		this.isbusinesslicence = isbusinesslicence;
	}
	
	public String getIsbusinesslicence(){
		return isbusinesslicence;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setCreditcode(Object creditcode){
		this.creditcode = creditcode;
	}
	
	public Object getCreditcode(){
		return creditcode;
	}
	
	public void setReportdate(Date reportdate){
		this.reportdate = reportdate;
	}
	
	public Date getReportdate(){
		return reportdate;
	}
	
	public void setLastyeartotal(BigDecimal lastyeartotal){
		this.lastyeartotal = lastyeartotal;
	}
	
	public BigDecimal getLastyeartotal(){
		return lastyeartotal;
	}
	
	public void setIsnwkt(Object isnwkt){
		this.isnwkt = isnwkt;
	}
	
	public Object getIsnwkt(){
		return isnwkt;
	}
	
	public void setIspft(Object ispft){
		this.ispft = ispft;
	}
	
	public Object getIspft(){
		return ispft;
	}
	
	public void setCompanyemergencytel(Object companyemergencytel){
		this.companyemergencytel = companyemergencytel;
	}
	
	public Object getCompanyemergencytel(){
		return companyemergencytel;
	}
	
	public void setVarietynumber(Object varietynumber){
		this.varietynumber = varietynumber;
	}
	
	public Object getVarietynumber(){
		return varietynumber;
	}
	
	public void setProductgauge(Object productgauge){
		this.productgauge = productgauge;
	}
	
	public Object getProductgauge(){
		return productgauge;
	}
	
	public void setWinvarietynumber(Object winvarietynumber){
		this.winvarietynumber = winvarietynumber;
	}
	
	public Object getWinvarietynumber(){
		return winvarietynumber;
	}
	
	public void setWinproductgauge(Object winproductgauge){
		this.winproductgauge = winproductgauge;
	}
	
	public Object getWinproductgauge(){
		return winproductgauge;
	}
	
	public void setWarehousearea(Object warehousearea){
		this.warehousearea = warehousearea;
	}
	
	public Object getWarehousearea(){
		return warehousearea;
	}
	
	public void setIswon(Object iswon){
		this.iswon = iswon;
	}
	
	public Object getIswon(){
		return iswon;
	}
	
	public void setPickingsystem(Object pickingsystem){
		this.pickingsystem = pickingsystem;
	}
	
	public Object getPickingsystem(){
		return pickingsystem;
	}
	
	public void setComputersystem(Object computersystem){
		this.computersystem = computersystem;
	}
	
	public Object getComputersystem(){
		return computersystem;
	}
	
	public void setInventorysystem(Object inventorysystem){
		this.inventorysystem = inventorysystem;
	}
	
	public Object getInventorysystem(){
		return inventorysystem;
	}
	
	public void setPlatformdocking(Object platformdocking){
		this.platformdocking = platformdocking;
	}
	
	public Object getPlatformdocking(){
		return platformdocking;
	}
	
	public void setLastyearbusinessincome(BigDecimal lastyearbusinessincome){
		this.lastyearbusinessincome = lastyearbusinessincome;
	}
	
	public BigDecimal getLastyearbusinessincome(){
		return lastyearbusinessincome;
	}
	
	public void setViolationstatement(Object violationstatement){
		this.violationstatement = violationstatement;
	}
	
	public Object getViolationstatement(){
		return violationstatement;
	}
	
	public void setComcriticaltel(String comcriticaltel){
		this.comcriticaltel = comcriticaltel;
	}
	
	public String getComcriticaltel(){
		return comcriticaltel;
	}
	
	public void setMandatarycriticaltel(String mandatarycriticaltel){
		this.mandatarycriticaltel = mandatarycriticaltel;
	}
	
	public String getMandatarycriticaltel(){
		return mandatarycriticaltel;
	}
	
	public void setIsusing(BigDecimal isusing){
		this.isusing = isusing;
	}
	
	public BigDecimal getIsusing(){
		return isusing;
	}
	
	public void setCompanycategory(Object companycategory){
		this.companycategory = companycategory;
	}
	
	public Object getCompanycategory(){
		return companycategory;
	}
	
	public void setBusinessscope(String businessscope){
		this.businessscope = businessscope;
	}
	
	public String getBusinessscope(){
		return businessscope;
	}
	
	public void setIscreditcode(BigDecimal iscreditcode){
		this.iscreditcode = iscreditcode;
	}
	
	public BigDecimal getIscreditcode(){
		return iscreditcode;
	}
	
	public void setTrcid(String trcid){
		this.trcid = trcid;
	}
	
	public String getTrcid(){
		return trcid;
	}
	
	public void setBusinesslicenseid(String businesslicenseid){
		this.businesslicenseid = businesslicenseid;
	}
	
	public String getBusinesslicenseid(){
		return businesslicenseid;
	}
	
	public void setIsusingreason(Object isusingreason){
		this.isusingreason = isusingreason;
	}
	
	public Object getIsusingreason(){
		return isusingreason;
	}
	
	public void setIschangename(String ischangename){
		this.ischangename = ischangename;
	}
	
	public String getIschangename(){
		return ischangename;
	}
	
	public void setBeforename(String beforename){
		this.beforename = beforename;
	}
	
	public String getBeforename(){
		return beforename;
	}
	
	public void setIsgeneralagreement(String isgeneralagreement){
		this.isgeneralagreement = isgeneralagreement;
	}
	
	public String getIsgeneralagreement(){
		return isgeneralagreement;
	}
	
	public void setCompanyidold(String companyidold){
		this.companyidold = companyidold;
	}
	
	public String getCompanyidold(){
		return companyidold;
	}
	
	public void setCompanyidSc(String companyidSc){
		this.companyidSc = companyidSc;
	}
	
	public String getCompanyidSc(){
		return companyidSc;
	}
	
	public void setCompanynameSc(String companynameSc){
		this.companynameSc = companynameSc;
	}
	
	public String getCompanynameSc(){
		return companynameSc;
	}
	
	public void setBusinesslicenceimg(String businesslicenceimg){
		this.businesslicenceimg = businesslicenceimg;
	}
	
	public String getBusinesslicenceimg(){
		return businesslicenceimg;
	}
	
	public void setWarrantimg(String warrantimg){
		this.warrantimg = warrantimg;
	}
	
	public String getWarrantimg(){
		return warrantimg;
	}
	
	public void setAuthorizationimg(String authorizationimg){
		this.authorizationimg = authorizationimg;
	}
	
	public String getAuthorizationimg(){
		return authorizationimg;
	}
	
	public void setGspimg(String gspimg){
		this.gspimg = gspimg;
	}
	
	public String getGspimg(){
		return gspimg;
	}
	
	public void setOtherinformation(String otherinformation){
		this.otherinformation = otherinformation;
	}
	
	public String getOtherinformation(){
		return otherinformation;
	}
	
	public void setIsfiveone(BigDecimal isfiveone){
		this.isfiveone = isfiveone;
	}
	
	public BigDecimal getIsfiveone(){
		return isfiveone;
	}
	
	public void setFivecode(Object fivecode){
		this.fivecode = fivecode;
	}
	
	public Object getFivecode(){
		return fivecode;
	}
	
	public void setIsscdis(String isscdis){
		this.isscdis = isscdis;
	}
	
	public String getIsscdis(){
		return isscdis;
	}
	
	public void setNssbh(String nssbh){
		this.nssbh = nssbh;
	}
	
	public String getNssbh(){
		return nssbh;
	}
	
	public void setIsyq(String isyq){
		this.isyq = isyq;
	}
	
	public String getIsyq(){
		return isyq;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}