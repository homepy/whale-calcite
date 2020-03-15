package io.github.homepy.whale.calcite.cs.po.pbc;

/** 最近一次月度表现信息(CSP_PBC_LATESTMONTHLYBEHAVIOR) */
public class CspPbcLatestMonthlyBehavior {

	/** 报告编号 */
	public String reportid;
	/** 账户编号 */
	public String accountno;
	/** 账户类型 */
	public String accounttype;
	/** 月份 */
	public String month;
	/** 账户状态 */
	public String state;
	/** 五级分类 */
	public String class5state;
	/** 余额 */
	public String balance;
	/** 已用额度 */
	public String usedcreditlimitamount;
	/** 未出单的大额专项分期余额 */
	public String largestagebalance;
	/** 剩余还款期数 */
	public String remainpaymentcyc;
	/** 结算/应还款日 */
	public String scheduledpaymentdate;
	/** 本月应还款 */
	public String scheduledpaymentamount;
	/** 本月实还款 */
	public String actualpaymentamount;
	/** 最近一次还款日期 */
	public String recentpaydate;
	/** 当前逾期期数 */
	public String curroverduecyc;
	/** 当前逾期总额 */
	public String curroverdueamount;
	/** 逾期31—60天未还本金 */
	public String overdue31to60amount;
	/** 逾期61－90天未还本金 */
	public String overdue61to90amount;
	/** 逾期91－180天未还本金 */
	public String overdue91to180amount;
	/** 逾期180天以上未还本金 */
	public String overdueover180amount;
	/** 透支180天以上未付余额 */
	public String overdraftover180amount;
	/** 最近6个月平均使用额度 */
	public String latest6monthusedavgamount;
	/** 最近6个月平均透支余额 */
	public String latest6monthoverdraftavgamount;
	/** 最大使用额度 */
	public String usedhighestamount;
	/** 最大透支余额 */
	public String overdrafthighestamount;
	/** 信息报告日期 */
	public String gettime;
	/** 标识 */
	public String seq;

}
