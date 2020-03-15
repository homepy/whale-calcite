package io.github.homepy.whale.calcite.cs.po.pbc;

/** 后付费业务信息(CSP_PBC_POSTPAYMENT) */
public class CspPbcPostPayment {

	/** 报告编号 */
	public String reportid;
	/** 账户类型 */
	public String accounttype;
	/** 机构名称 */
	public String organname;
	/** 业务类型 */
	public String bustype;
	/** 业务开通日期 */
	public String registerdate;
	/** 当前缴费状态 */
	public String state;
	/** 当前欠费金额 */
	public String arrearmoney;
	/** 记账年月 */
	public String gettime;
	/** 最近24个月缴费记录 */
	public String status24;
	/** 标识 */
	public String seq;
}
