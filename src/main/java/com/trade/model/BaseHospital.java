package com.trade.model;

import java.math.BigDecimal;
import java.util.Date;


public class BaseHospital {
	
	//alias
	public static final String TABLE_ALIAS = "医疗机构";
	
	//columns START
	/**
	 * @Fields id:唯一标识
	 */
	private String id;
	
	/**
	 * @Fields hospitalcode:医疗机构编码
	 */
	private String hospitalcode;
	
	/**
	 * @Fields hospitalname:医疗机构名称
	 */
	private String hospitalname;
	
	/**
	 * @Fields areaid:医疗机构所在区域
	 */
	private String areaid;
	
	/**
	 * @Fields orgcode:组织机构代码
	 */
	private String orgcode;
	
	/**
	 * @Fields hospitaltype:医疗机构类别
	 */
	private Object hospitaltype;
	
	/**
	 * @Fields hoslevel:医疗机构等级
	 */
	private Object hoslevel;
	
	/**
	 * @Fields hosorder:医疗机构等次
	 */
	private Object hosorder;
	
	/**
	 * @Fields hostunit:主办单位
	 */
	private Object hostunit;
	
	/**
	 * @Fields affiliation:政府办医疗机构隶属关系
	 */
	private Object affiliation;
	
	/**
	 * @Fields economicstype:经济类型
	 */
	private Object economicstype;
	
	/**
	 * @Fields creationtime:单位成立时间
	 */
	private Date creationtime;
	
	/**
	 * @Fields hosaddress:医院地址
	 */
	private String hosaddress;
	
	/**
	 * @Fields legalperson:法人
	 */
	private String legalperson;
	
	/**
	 * @Fields contactperson:联系人
	 */
	private String contactperson;
	
	/**
	 * @Fields contacttel:固定电话
	 */
	private String contacttel;
	
	/**
	 * @Fields mobile:移动电话
	 */
	private String mobile;
	
	/**
	 * @Fields email:邮箱
	 */
	private String email;
	
	/**
	 * @Fields addtime:新增时间
	 */
	private Date addtime;
	
	/**
	 * @Fields orgareaid:行政区划编号
	 */
	private String orgareaid;
	
	/**
	 * @Fields hostype:医院类型(湖北数据结构）
	 */
	private String hostype;
	
	/**
	 * @Fields bzcws:编制床位数
	 */
	private BigDecimal bzcws;
	
	/**
	 * @Fields sycws:实有床位数
	 */
	private BigDecimal sycws;
	
	/**
	 * @Fields wsjsrys:卫生技术人员数
	 */
	private BigDecimal wsjsrys;
	
	/**
	 * @Fields ishzylddyy:是否合作医疗定点医院
	 */
	private BigDecimal ishzylddyy;
	
	/**
	 * @Fields isybddyy:是否医保定点医院
	 */
	private BigDecimal isybddyy;
	
	/**
	 * @Fields islgbddyy:是否老干部定点医院
	 */
	private BigDecimal islgbddyy;
	
	/**
	 * @Fields isdemc:第二名称是否为社区卫生服务中心
	 */
	private BigDecimal isdemc;
	
	/**
	 * @Fields isxszsfz:是否下设直属分站
	 */
	private BigDecimal isxszsfz;
	
	/**
	 * @Fields xszsfzycount:下设直属分站院所个数
	 */
	private BigDecimal xszsfzycount;
	
	/**
	 * @Fields qzsqwsfwzcount:其中社区卫生服务站个数
	 */
	private BigDecimal qzsqwsfwzcount;
	
	/**
	 * @Fields djyuserid:低价药系统用户账号
	 */
	private String djyuserid;
	
	/**
	 * @Fields jyuserid:基药系统用户账号
	 */
	private String jyuserid;
	
	/**
	 * @Fields fjyuserid:非基药系统用户账号
	 */
	private String fjyuserid;
	
	/**
	 * @Fields isusing:是否启用(1:启用,0:禁用)
	 */
	private BigDecimal isusing;
	
	/**
	 * @Fields ischeck:是否自动审核0否1是
	 */
	private BigDecimal ischeck;
	
	/**
	 * @Fields isusingreason:启用禁用原因
	 */
	private Object isusingreason;
	
	/**
	 * @Fields hospitalcategory:医疗机构类型
	 */
	private Object hospitalcategory;
	
	/**
	 * @Fields orgcodevalue:组织机构代码(最后一位)
	 */
	private String orgcodevalue;
	
	/**
	 * @Fields basicdrugsystem:所属基药系统
	 */
	private String basicdrugsystem;
	
	/**
	 * @Fields basicdrugsystemuserid:所属基药系统用户编码
	 */
	private String basicdrugsystemuserid;
	
	/**
	 * @Fields unbasicdrugsystem:所属非基药系统
	 */
	private String unbasicdrugsystem;
	
	/**
	 * @Fields unbasicdrugsystemuserid:所属非基药系统用户编码
	 */
	private String unbasicdrugsystemuserid;
	
	/**
	 * @Fields lowdrugsystem:所属低价药系统
	 */
	private String lowdrugsystem;
	
	/**
	 * @Fields lowdrugsystemuserid:所属低价药系统用户编码
	 */
	private String lowdrugsystemuserid;
	
	/**
	 * @Fields hospitalclass:医疗机构分类
	 */
	private Object hospitalclass;
	
	/**
	 * @Fields checkstatus:审核状态(0：未提交，1：已提交，2：旗县审核通过，3：旗县审核不通过，4：盟市审核通过，5：盟市审核不通过)
	 */
	private String checkstatus;
	
	/**
	 * @Fields citycheckreason:盟市审核不通过原因
	 */
	private String citycheckreason;
	
	/**
	 * @Fields towncheckreason:旗县审核不通过原因
	 */
	private String towncheckreason;
	
	/**
	 * @Fields pharmacycount:药房数
	 */
	private BigDecimal pharmacycount;
	
	/**
	 * @Fields isremote:isremote
	 */
	private String isremote;
	
	/**
	 * @Fields nssbh:纳税识别号
	 */
	private String nssbh;

	private Date lastUpdateTime;

	private String areaName;
	
	//columns END

	public BaseHospital(){
	}

	public BaseHospital(String id){
		this.id = id;
	}

	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setHospitalcode(String hospitalcode){
		this.hospitalcode = hospitalcode;
	}
	
	public String getHospitalcode(){
		return hospitalcode;
	}
	
	public void setHospitalname(String hospitalname){
		this.hospitalname = hospitalname;
	}
	
	public String getHospitalname(){
		return hospitalname;
	}
	
	public void setAreaid(String areaid){
		this.areaid = areaid;
	}
	
	public String getAreaid(){
		return areaid;
	}
	
	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}
	
	public String getOrgcode(){
		return orgcode;
	}
	
	public void setHospitaltype(Object hospitaltype){
		this.hospitaltype = hospitaltype;
	}
	
	public Object getHospitaltype(){
		return hospitaltype;
	}
	
	public void setHoslevel(Object hoslevel){
		this.hoslevel = hoslevel;
	}
	
	public Object getHoslevel(){
		return hoslevel;
	}
	
	public void setHosorder(Object hosorder){
		this.hosorder = hosorder;
	}
	
	public Object getHosorder(){
		return hosorder;
	}
	
	public void setHostunit(Object hostunit){
		this.hostunit = hostunit;
	}
	
	public Object getHostunit(){
		return hostunit;
	}
	
	public void setAffiliation(Object affiliation){
		this.affiliation = affiliation;
	}
	
	public Object getAffiliation(){
		return affiliation;
	}
	
	public void setEconomicstype(Object economicstype){
		this.economicstype = economicstype;
	}
	
	public Object getEconomicstype(){
		return economicstype;
	}
	
	public void setCreationtime(Date creationtime){
		this.creationtime = creationtime;
	}
	
	public Date getCreationtime(){
		return creationtime;
	}
	
	public void setHosaddress(String hosaddress){
		this.hosaddress = hosaddress;
	}
	
	public String getHosaddress(){
		return hosaddress;
	}
	
	public void setLegalperson(String legalperson){
		this.legalperson = legalperson;
	}
	
	public String getLegalperson(){
		return legalperson;
	}
	
	public void setContactperson(String contactperson){
		this.contactperson = contactperson;
	}
	
	public String getContactperson(){
		return contactperson;
	}
	
	public void setContacttel(String contacttel){
		this.contacttel = contacttel;
	}
	
	public String getContacttel(){
		return contacttel;
	}
	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	
	public String getMobile(){
		return mobile;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	
	public Date getAddtime(){
		return addtime;
	}
	
	public void setOrgareaid(String orgareaid){
		this.orgareaid = orgareaid;
	}
	
	public String getOrgareaid(){
		return orgareaid;
	}
	
	public void setHostype(String hostype){
		this.hostype = hostype;
	}
	
	public String getHostype(){
		return hostype;
	}
	
	public void setBzcws(BigDecimal bzcws){
		this.bzcws = bzcws;
	}
	
	public BigDecimal getBzcws(){
		return bzcws;
	}
	
	public void setSycws(BigDecimal sycws){
		this.sycws = sycws;
	}
	
	public BigDecimal getSycws(){
		return sycws;
	}
	
	public void setWsjsrys(BigDecimal wsjsrys){
		this.wsjsrys = wsjsrys;
	}
	
	public BigDecimal getWsjsrys(){
		return wsjsrys;
	}
	
	public void setIshzylddyy(BigDecimal ishzylddyy){
		this.ishzylddyy = ishzylddyy;
	}
	
	public BigDecimal getIshzylddyy(){
		return ishzylddyy;
	}
	
	public void setIsybddyy(BigDecimal isybddyy){
		this.isybddyy = isybddyy;
	}
	
	public BigDecimal getIsybddyy(){
		return isybddyy;
	}
	
	public void setIslgbddyy(BigDecimal islgbddyy){
		this.islgbddyy = islgbddyy;
	}
	
	public BigDecimal getIslgbddyy(){
		return islgbddyy;
	}
	
	public void setIsdemc(BigDecimal isdemc){
		this.isdemc = isdemc;
	}
	
	public BigDecimal getIsdemc(){
		return isdemc;
	}
	
	public void setIsxszsfz(BigDecimal isxszsfz){
		this.isxszsfz = isxszsfz;
	}
	
	public BigDecimal getIsxszsfz(){
		return isxszsfz;
	}
	
	public void setXszsfzycount(BigDecimal xszsfzycount){
		this.xszsfzycount = xszsfzycount;
	}
	
	public BigDecimal getXszsfzycount(){
		return xszsfzycount;
	}
	
	public void setQzsqwsfwzcount(BigDecimal qzsqwsfwzcount){
		this.qzsqwsfwzcount = qzsqwsfwzcount;
	}
	
	public BigDecimal getQzsqwsfwzcount(){
		return qzsqwsfwzcount;
	}
	
	public void setDjyuserid(String djyuserid){
		this.djyuserid = djyuserid;
	}
	
	public String getDjyuserid(){
		return djyuserid;
	}
	
	public void setJyuserid(String jyuserid){
		this.jyuserid = jyuserid;
	}
	
	public String getJyuserid(){
		return jyuserid;
	}
	
	public void setFjyuserid(String fjyuserid){
		this.fjyuserid = fjyuserid;
	}
	
	public String getFjyuserid(){
		return fjyuserid;
	}
	
	public void setIsusing(BigDecimal isusing){
		this.isusing = isusing;
	}
	
	public BigDecimal getIsusing(){
		return isusing;
	}
	
	public void setIscheck(BigDecimal ischeck){
		this.ischeck = ischeck;
	}
	
	public BigDecimal getIscheck(){
		return ischeck;
	}
	
	public void setIsusingreason(Object isusingreason){
		this.isusingreason = isusingreason;
	}
	
	public Object getIsusingreason(){
		return isusingreason;
	}
	
	public void setHospitalcategory(Object hospitalcategory){
		this.hospitalcategory = hospitalcategory;
	}
	
	public Object getHospitalcategory(){
		return hospitalcategory;
	}
	
	public void setOrgcodevalue(String orgcodevalue){
		this.orgcodevalue = orgcodevalue;
	}
	
	public String getOrgcodevalue(){
		return orgcodevalue;
	}
	
	public void setBasicdrugsystem(String basicdrugsystem){
		this.basicdrugsystem = basicdrugsystem;
	}
	
	public String getBasicdrugsystem(){
		return basicdrugsystem;
	}
	
	public void setBasicdrugsystemuserid(String basicdrugsystemuserid){
		this.basicdrugsystemuserid = basicdrugsystemuserid;
	}
	
	public String getBasicdrugsystemuserid(){
		return basicdrugsystemuserid;
	}
	
	public void setUnbasicdrugsystem(String unbasicdrugsystem){
		this.unbasicdrugsystem = unbasicdrugsystem;
	}
	
	public String getUnbasicdrugsystem(){
		return unbasicdrugsystem;
	}
	
	public void setUnbasicdrugsystemuserid(String unbasicdrugsystemuserid){
		this.unbasicdrugsystemuserid = unbasicdrugsystemuserid;
	}
	
	public String getUnbasicdrugsystemuserid(){
		return unbasicdrugsystemuserid;
	}
	
	public void setLowdrugsystem(String lowdrugsystem){
		this.lowdrugsystem = lowdrugsystem;
	}
	
	public String getLowdrugsystem(){
		return lowdrugsystem;
	}
	
	public void setLowdrugsystemuserid(String lowdrugsystemuserid){
		this.lowdrugsystemuserid = lowdrugsystemuserid;
	}
	
	public String getLowdrugsystemuserid(){
		return lowdrugsystemuserid;
	}
	
	public void setHospitalclass(Object hospitalclass){
		this.hospitalclass = hospitalclass;
	}
	
	public Object getHospitalclass(){
		return hospitalclass;
	}
	
	public void setCheckstatus(String checkstatus){
		this.checkstatus = checkstatus;
	}
	
	public String getCheckstatus(){
		return checkstatus;
	}
	
	public void setCitycheckreason(String citycheckreason){
		this.citycheckreason = citycheckreason;
	}
	
	public String getCitycheckreason(){
		return citycheckreason;
	}
	
	public void setTowncheckreason(String towncheckreason){
		this.towncheckreason = towncheckreason;
	}
	
	public String getTowncheckreason(){
		return towncheckreason;
	}
	
	public void setPharmacycount(BigDecimal pharmacycount){
		this.pharmacycount = pharmacycount;
	}
	
	public BigDecimal getPharmacycount(){
		return pharmacycount;
	}
	
	public void setIsremote(String isremote){
		this.isremote = isremote;
	}
	
	public String getIsremote(){
		return isremote;
	}
	
	public void setNssbh(String nssbh){
		this.nssbh = nssbh;
	}
	
	public String getNssbh(){
		return nssbh;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}