package io.github.homepy.whale.calcite.cs.po.pbc;

/** 特殊交易信息(CSP_PBC_SPECIALTRADE) */
public class CspPbcSpecialTrade {

	/** 报告编号 */
	public String reportid;
	/** 账户编号 */
	public String accountno;
	/** 特殊交易个数 */
	public String count;
	/** 特殊交易类型 */
	public String type;
	/** 特殊交易发生日期 */
	public String gettime;
	/** 到期日期变更月数 */
	public String changingmonths;
	/** 特殊交易发生金额 */
	public String changingamount;
	/** 特殊交易明细记录 */
	public String content;
	/** 标识 */
	public String seq;
	/** 二级标识 */
	public String seq2;

}
