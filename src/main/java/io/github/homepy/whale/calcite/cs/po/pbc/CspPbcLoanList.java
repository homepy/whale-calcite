package io.github.homepy.whale.calcite.cs.po.pbc;

/** 人行报告贷款明细表(CSP_PBC_LOANLIST) */
public class CspPbcLoanList {

	/** 报告编号 */
	private String reportid;
	/** 贷款种类 */
	private String loan_type;
	/** 担保方式 */
	private String vouch_type;
	/** 币种 */
	private String currency_type;
	/** 帐户状态 */
	private String account_state;
	/** 还款频率 */
	private String ret_frequency;
	/** 还款月数 */
	private String ret_month;
	/** YYYY.MM.DD */
	private String loandate_s;
	/** YYYY.MM.DD */
	private String loandate_e;
	/** 贷款合同金额 */
	private String loan_amount;
	/** 贷款余额 */
	private String loan_balance;
	/** YYYY.MM.DD */
	private String info_date;
	/** 剩余还款月数 */
	private String rest_month;
	/** YYYY.MM.DD */
	private String recent_ret_date;
	/** 本月应还款金额 */
	private String cur_month_need;
	/** 本月实际还款金额 */
	private String cur_month_return;
	/** 当前逾期期数 */
	private String overdue_count;
	/** 当前逾期总额 */
	private String overdue_sum;
	/** 累计逾期次数 */
	private String total_overdue;
	/** 最高逾期期数 */
	private String top_overdue;
	/** 逾期31-60天未归还贷款本金 */
	private String overdue1;
	/** 逾期61-90天未归还贷款本金 */
	private String overdue2;
	/** 逾期91-180天未归还贷款本金 */
	private String overdue3;
	/** 逾期180天以上未归还贷款本金 */
	private String overdue4;
	/** 24月的缴费情况 */
	private String retst24;
	/** 23月的缴费情况 */
	private String retst23;
	/** 22月的缴费情况 */
	private String retst22;
	/** 21月的缴费情况 */
	private String retst21;
	/** 20月的缴费情况 */
	private String retst20;
	/** 19月的缴费情况 */
	private String retst19;
	/** 18月的缴费情况 */
	private String retst18;
	/** 17月的缴费情况 */
	private String retst17;
	/** 16月的缴费情况 */
	private String retst16;
	/** 15月的缴费情况 */
	private String retst15;
	/** 14月的缴费情况 */
	private String retst14;
	/** 13月的缴费情况 */
	private String retst13;
	/** 12月的缴费情况 */
	private String retst12;
	/** 11月的缴费情况 */
	private String retst11;
	/** 10月的缴费情况 */
	private String retst10;
	/** 9月的缴费情况 */
	private String retst9;
	/** 8月的缴费情况 */
	private String retst8;
	/** 7月的缴费情况 */
	private String retst7;
	/** 6月的缴费情况 */
	private String retst6;
	/** 5月的缴费情况 */
	private String retst5;
	/** 4月的缴费情况 */
	private String retst4;
	/** 3月的缴费情况 */
	private String retst3;
	/** 2月的缴费情况 */
	private String retst2;
	/** 1月的缴费情况 */
	private String retst1;
	/** 结算年月 */
	private String balance_date;
	/** 贷款机构名称 */
	private String loan_orgname;
	/** 还款状态记录-编号 */
	private String ret_code;
	/** 业务号 */
	private String tran_code;
	/** 贷款机构类型 */
	private String loan_orgtype;
	/** 账户类型 */
	private String account_type;
}
