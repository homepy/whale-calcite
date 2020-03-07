package io.github.homepy.whale.calcite.cs.pbc.po;

import java.sql.Timestamp;

/**
 * 人行报告主信息表
 * 
 * @author hongpai
 *
 */
public class CspPbcMain {
	/** 报告编号 */
	private String reportid;
	/** 被查询者证件号码 */
	private String certi_no;
	/** 被查询者姓名 */
	private String name;
	/** 通讯地址 */
	private String address;
	/** 住宅电话 */
	private String homephone;
	/** 单位电话 */
	private String compphone;
	/** 手机号码 */
	private String mobile;
	/** 贷记卡发卡机构数 */
	private String org_count;
	/** 查询时间 */
	private Timestamp querytime;
	/** 人行报告存放路径 */
	private String depositpath;
	/** 人行报告内容 */
	private byte[] rpthtml;
	/** 婚姻状况 */
	private String wedst;
	/** 配偶姓名 */
	private String mate_name;
	/** 配偶证件类型 */
	private String mate_certp;
	/** 配偶证件号码 */
	private String mate_cerno;
	/** 配偶工作单位 */
	private String mate_corp;
	/** 配偶联系电话 */
	private String mate_phone;
	/** 婚姻信息猎取时间 */
	private String wed_gettime;
	/** 银行授信机构数 */
	private String banknum;
	/** 银行授信额度 */
	private String banksum;
	/** 信用卡发卡机构数 */
	private String creditnum;
	/** 信用卡信用额度 */
	private String creditsum;
	/** 贷记卡信用额度 */
	private String org_sum;
	/** 银行法人机构数 */
	private String bankapsum;
	/** 信用卡法人机构数 */
	private String creditapnum;
	/** 贷记卡法人机构数 */
	private String orgapnum;
	/** 信用卡透支额度 */
	private String creditodnum;
	/** 准贷记卡透支180天以上未付余额 */
	private String creditxodnum180;
	/** 银行授信账户数 */
	private String bankacc_num;
	/** 银行授信余额 */
	private String bank_balance;
	/** 为他人贷款合同担保余额 */
	private String other_assure;
	/** 信用卡账户数 */
	private String creditacc_num;
	/** 贷记卡账户数 */
	private String orgacc_num;
	/** 贷记卡已使用余额 */
	private String org_balance;
	/** 准贷记卡帐户数 */
	private String zorg_num;
	/** 准贷记卡发卡法人机构数 */
	private String zorgfr_count;
	/** 准贷记卡发卡机构数 */
	private String zorg_count;
	/** 准贷记卡信用额度 */
	private String zorg_sum;
	/** 准贷记卡透支余额 */
	private String zorg_balance;
	/** 贷款笔数 */
	private String loan_num;
	/** 贷款法人机构数 */
	private String loan_corpnum;
	/** 贷款机构数 */
	private String loan_orgnum;
	/** 贷款合同金额 */
	private String loan_money;
	/** 贷款余额 */
	private String loan_balance;
	/** 当前贷款逾期总额 */
	private String overdue_sum;
	/** 报告时间 */
	private String report_date;
	/** 性别 */
	private String sex;
	/** 证件类型 */
	private String certi_type;
	/** 出生日期 */
	private String birth_date;
	/** 最高学历 */
	private String qualification;
	/** 最高学位 */
	private String degree;
	/** 户籍地址 */
	private String reside_addr;
	/** 电子邮箱 */
	private String email;
	/** 邮政编码 */
	private String zip;
	/** 查询结果 */
	private String query_result;
	/** 国籍 */
	private String nationality;
	/** 就业状况 */
	private String employ_type;

	public String getReportid() {
		return reportid;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}

	public String getCerti_no() {
		return certi_no;
	}

	public void setCerti_no(String certi_no) {
		this.certi_no = certi_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getCompphone() {
		return compphone;
	}

	public void setCompphone(String compphone) {
		this.compphone = compphone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrg_count() {
		return org_count;
	}

	public void setOrg_count(String org_count) {
		this.org_count = org_count;
	}

	public Timestamp getQuerytime() {
		return querytime;
	}

	public void setQuerytime(Timestamp querytime) {
		this.querytime = querytime;
	}

	public String getDepositpath() {
		return depositpath;
	}

	public void setDepositpath(String depositpath) {
		this.depositpath = depositpath;
	}

	public byte[] getRpthtml() {
		return rpthtml;
	}

	public void setRpthtml(byte[] rpthtml) {
		this.rpthtml = rpthtml;
	}

	public String getWedst() {
		return wedst;
	}

	public void setWedst(String wedst) {
		this.wedst = wedst;
	}

	public String getMate_name() {
		return mate_name;
	}

	public void setMate_name(String mate_name) {
		this.mate_name = mate_name;
	}

	public String getMate_certp() {
		return mate_certp;
	}

	public void setMate_certp(String mate_certp) {
		this.mate_certp = mate_certp;
	}

	public String getMate_cerno() {
		return mate_cerno;
	}

	public void setMate_cerno(String mate_cerno) {
		this.mate_cerno = mate_cerno;
	}

	public String getMate_corp() {
		return mate_corp;
	}

	public void setMate_corp(String mate_corp) {
		this.mate_corp = mate_corp;
	}

	public String getMate_phone() {
		return mate_phone;
	}

	public void setMate_phone(String mate_phone) {
		this.mate_phone = mate_phone;
	}

	public String getWed_gettime() {
		return wed_gettime;
	}

	public void setWed_gettime(String wed_gettime) {
		this.wed_gettime = wed_gettime;
	}

	public String getBanknum() {
		return banknum;
	}

	public void setBanknum(String banknum) {
		this.banknum = banknum;
	}

	public String getBanksum() {
		return banksum;
	}

	public void setBanksum(String banksum) {
		this.banksum = banksum;
	}

	public String getCreditnum() {
		return creditnum;
	}

	public void setCreditnum(String creditnum) {
		this.creditnum = creditnum;
	}

	public String getCreditsum() {
		return creditsum;
	}

	public void setCreditsum(String creditsum) {
		this.creditsum = creditsum;
	}

	public String getOrg_sum() {
		return org_sum;
	}

	public void setOrg_sum(String org_sum) {
		this.org_sum = org_sum;
	}

	public String getBankapsum() {
		return bankapsum;
	}

	public void setBankapsum(String bankapsum) {
		this.bankapsum = bankapsum;
	}

	public String getCreditapnum() {
		return creditapnum;
	}

	public void setCreditapnum(String creditapnum) {
		this.creditapnum = creditapnum;
	}

	public String getOrgapnum() {
		return orgapnum;
	}

	public void setOrgapnum(String orgapnum) {
		this.orgapnum = orgapnum;
	}

	public String getCreditodnum() {
		return creditodnum;
	}

	public void setCreditodnum(String creditodnum) {
		this.creditodnum = creditodnum;
	}

	public String getCreditxodnum180() {
		return creditxodnum180;
	}

	public void setCreditxodnum180(String creditxodnum180) {
		this.creditxodnum180 = creditxodnum180;
	}

	public String getBankacc_num() {
		return bankacc_num;
	}

	public void setBankacc_num(String bankacc_num) {
		this.bankacc_num = bankacc_num;
	}

	public String getBank_balance() {
		return bank_balance;
	}

	public void setBank_balance(String bank_balance) {
		this.bank_balance = bank_balance;
	}

	public String getOther_assure() {
		return other_assure;
	}

	public void setOther_assure(String other_assure) {
		this.other_assure = other_assure;
	}

	public String getCreditacc_num() {
		return creditacc_num;
	}

	public void setCreditacc_num(String creditacc_num) {
		this.creditacc_num = creditacc_num;
	}

	public String getOrgacc_num() {
		return orgacc_num;
	}

	public void setOrgacc_num(String orgacc_num) {
		this.orgacc_num = orgacc_num;
	}

	public String getOrg_balance() {
		return org_balance;
	}

	public void setOrg_balance(String org_balance) {
		this.org_balance = org_balance;
	}

	public String getZorg_num() {
		return zorg_num;
	}

	public void setZorg_num(String zorg_num) {
		this.zorg_num = zorg_num;
	}

	public String getZorgfr_count() {
		return zorgfr_count;
	}

	public void setZorgfr_count(String zorgfr_count) {
		this.zorgfr_count = zorgfr_count;
	}

	public String getZorg_count() {
		return zorg_count;
	}

	public void setZorg_count(String zorg_count) {
		this.zorg_count = zorg_count;
	}

	public String getZorg_sum() {
		return zorg_sum;
	}

	public void setZorg_sum(String zorg_sum) {
		this.zorg_sum = zorg_sum;
	}

	public String getZorg_balance() {
		return zorg_balance;
	}

	public void setZorg_balance(String zorg_balance) {
		this.zorg_balance = zorg_balance;
	}

	public String getLoan_num() {
		return loan_num;
	}

	public void setLoan_num(String loan_num) {
		this.loan_num = loan_num;
	}

	public String getLoan_corpnum() {
		return loan_corpnum;
	}

	public void setLoan_corpnum(String loan_corpnum) {
		this.loan_corpnum = loan_corpnum;
	}

	public String getLoan_orgnum() {
		return loan_orgnum;
	}

	public void setLoan_orgnum(String loan_orgnum) {
		this.loan_orgnum = loan_orgnum;
	}

	public String getLoan_money() {
		return loan_money;
	}

	public void setLoan_money(String loan_money) {
		this.loan_money = loan_money;
	}

	public String getLoan_balance() {
		return loan_balance;
	}

	public void setLoan_balance(String loan_balance) {
		this.loan_balance = loan_balance;
	}

	public String getOverdue_sum() {
		return overdue_sum;
	}

	public void setOverdue_sum(String overdue_sum) {
		this.overdue_sum = overdue_sum;
	}

	public String getReport_date() {
		return report_date;
	}

	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCerti_type() {
		return certi_type;
	}

	public void setCerti_type(String certi_type) {
		this.certi_type = certi_type;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getReside_addr() {
		return reside_addr;
	}

	public void setReside_addr(String reside_addr) {
		this.reside_addr = reside_addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getQuery_result() {
		return query_result;
	}

	public void setQuery_result(String query_result) {
		this.query_result = query_result;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmploy_type() {
		return employ_type;
	}

	public void setEmploy_type(String employ_type) {
		this.employ_type = employ_type;
	}

}
