package io.github.homepy.whale.calcite.cs.po.pbc;

/** 贷记卡账户汇总信息(CSP_PBC_LOANCARDSUM) */
public class CspPbcLoanCardSum {

	/** 报告编号 */
	public String reportid;
	/** 发卡机构（法人）数 */
	public String financeorgcount;
	/** 账户数 */
	public String accountcount;
	/** 授信总额 */
	public String creditlimit;
	/** 单家行最高授信额 */
	public String maxcreditlimitperorg;
	/** 单家行最低授信额 */
	public String mincreditlimitperorg;
	/** 已用额度 */
	public String usedcreditlimit;
	/** 最近6个月平均使用额度 */
	public String latest6monthusedavgamount;

}
