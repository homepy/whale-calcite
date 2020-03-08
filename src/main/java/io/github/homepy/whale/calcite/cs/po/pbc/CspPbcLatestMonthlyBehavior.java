package io.github.homepy.whale.calcite.cs.po.pbc;

/** 最近一次月度表现信息(CSP_PBC_LATESTMONTHLYBEHAVIOR) */
public class CspPbcLatestMonthlyBehavior {

	/** 报告编号 */
	private String reportid;
	/** 账户编号 */
	private String accountno;
	/** 账户类型 */
	private String accounttype;
	/** 月份 */
	private String month;
	/** 账户状态 */
	private String state;
	/** 五级分类 */
	private String class5state;
	/** 余额 */
	private String balance;
	/** 已用额度 */
	private String usedcreditlimitamount;
	/** 未出单的大额专项分期余额 */
	private String largestagebalance;
	/** 剩余还款期数 */
	private String remainpaymentcyc;
	/** 结算/应还款日 */
	private String scheduledpaymentdate;
	/** 本月应还款 */
	private String scheduledpaymentamount;
	/** 本月实还款 */
	private String actualpaymentamount;
	/** 最近一次还款日期 */
	private String recentpaydate;
	/** 当前逾期期数 */
	private String curroverduecyc;
	/** 当前逾期总额 */
	private String curroverdueamount;
	/** 逾期31—60天未还本金 */
	private String overdue31to60amount;
	/** 逾期61－90天未还本金 */
	private String overdue61to90amount;
	/** 逾期91－180天未还本金 */
	private String overdue91to180amount;
	/** 逾期180天以上未还本金 */
	private String overdueover180amount;
	/** 透支180天以上未付余额 */
	private String overdraftover180amount;
	/** 最近6个月平均使用额度 */
	private String latest6monthusedavgamount;
	/** 最近6个月平均透支余额 */
	private String latest6monthoverdraftavgamount;
	/** 最大使用额度 */
	private String usedhighestamount;
	/** 最大透支余额 */
	private String overdrafthighestamount;
	/** 信息报告日期 */
	private String gettime;
	/** 标识 */
	private String seq;

}
