package io.github.homepy.whale.calcite.cs.po.pbc;

/** 准贷记卡账户汇总信息(CSP_PBC_STANLOANCARDSUM) */
public class CspPbcStanLoanCardSum {

	/** 报告编号 */
	private String reportid;
	/** 发卡机构（法人）数 */
	private String financeorgcount;
	/** 账户数 */
	private String accountcount;
	/** 授信总额 */
	private String creditlimit;
	/** 单家行最高授信额 */
	private String maxcreditlimitperorg;
	/** 单家行最低授信额 */
	private String mincreditlimitperorg;
	/** 透支余额 */
	private String usedcreditlimit;
	/** 最近6个月平均透支余额 */
	private String latest6monthusedavgamount;
}
