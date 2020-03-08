package io.github.homepy.whale.calcite.cs.po.pbc;

/** 未销户贷记卡信息汇总(CSP_PBCNEW_UNDESTORYLOANCARD) */
public class CspPbcNewUndestoryLoanCard {

	/** 报告编号 */
	private String reportsn;
	/** 发卡法人机构数 */
	private String financecorpcount;
	/** 发卡机构数 */
	private String financeorgcount;
	/** 账户数 */
	private String accountcount;
	/** 授信总额 */
	private String creditlimit;
	/** 单家行最高授信额度 */
	private String maxcreditlimitperorg;
	/** 单家行最低授信额度 */
	private String mincreditlimitperorg;
	/** 已用额度 */
	private String usedcreditlimit;
	/** 最近6个月平均使用额度 */
	private String latest6monthusedavgamount;

}
