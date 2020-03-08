package io.github.homepy.whale.calcite.cs.po.pbc;

import java.util.Arrays;
import java.util.Date;

/** 人行报告主信息表(CSP_PBC_MAIN) */

public class CspPbcMain {
	
	public CspPbcMain(String reportid) {
		this.reportid = reportid;
	}

	/** 报告编号 */
	public String reportid;
	/** 被查询者证件号码 */
	public String certi_no;
	/** 被查询者姓名 */
	public String name;
	/** 通讯地址 */
	public String address;
	/** 住宅电话 */
	public String homephone;
	/** 单位电话 */
	public String compphone;
	/** 手机号码 */
	public String mobile;
	/** 贷记卡发卡机构数 */
	public String org_count;
	/** 查询时间 */
	public Date querytime;
	/** 人行报告存放路径 */
	public String depositpath;
	/** 人行报告内容 */
	byte[] rpthtml;
	/** 婚姻状况 */
	public String wedst;
	/** 配偶姓名 */
	public String mate_name;
	/** 配偶证件类型 */
	public String mate_certp;
	/** 配偶证件号码 */
	public String mate_cerno;
	/** 配偶工作单位 */
	public String mate_corp;
	/** 配偶联系电话 */
	public String mate_phone;
	/** 婚姻信息猎取时间 */
	public String wed_gettime;
	/** 银行授信机构数 */
	public String banknum;
	/** 银行授信额度 */
	public String banksum;
	/** 信用卡发卡机构数 */
	public String creditnum;
	/** 信用卡信用额度 */
	public String creditsum;
	/** 贷记卡信用额度 */
	public String org_sum;
	/** 银行法人机构数 */
	public String bankapsum;
	/** 信用卡法人机构数 */
	public String creditapnum;
	/** 贷记卡法人机构数 */
	public String orgapnum;
	/** 信用卡透支额度 */
	public String creditodnum;
	/** 准贷记卡透支180天以上未付余额 */
	public String creditxodnum180;
	/** 银行授信账户数 */
	public String bankacc_num;
	/** 银行授信余额 */
	public String bank_balance;
	/** 为他人贷款合同担保余额 */
	public String other_assure;
	/** 信用卡账户数 */
	public String creditacc_num;
	/** 贷记卡账户数 */
	public String orgacc_num;
	/** 贷记卡已使用余额 */
	public String org_balance;
	/** 准贷记卡帐户数 */
	public String zorg_num;
	/** 准贷记卡发卡法人机构数 */
	public String zorgfr_count;
	/** 准贷记卡发卡机构数 */
	public String zorg_count;
	/** 准贷记卡信用额度 */
	public String zorg_sum;
	/** 准贷记卡透支余额 */
	public String zorg_balance;
	/** 贷款笔数 */
	public String loan_num;
	/** 贷款法人机构数 */
	public String loan_corpnum;
	/** 贷款机构数 */
	public String loan_orgnum;
	/** 贷款合同金额 */
	public String loan_money;
	/** 贷款余额 */
	public String loan_balance;
	/** 当前贷款逾期总额 */
	public String overdue_sum;
	/** 报告时间 */
	public String report_date;
	/** 性别 */
	public String sex;
	/** 证件类型 */
	public String certi_type;
	/** 出生日期 */
	public String birth_date;
	/** 最高学历 */
	public String qualification;
	/** 最高学位 */
	public String degree;
	/** 户籍地址 */
	public String reside_addr;
	/** 电子邮箱 */
	public String email;
	/** 邮政编码 */
	public String zip;
	/** 查询结果 */
	public String query_result;
	/** 国籍 */
	public String nationality;
	/** 就业状况 */
	public String employ_type;
	
	
	
	

}
