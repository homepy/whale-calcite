package io.github.homepy.whale.calcite.cs.po.pbc;

/** 行政奖励记录信息(CSP_PBC_ADMINAWARD) */
public class CspPbcAdminAward implements Comparable<Object> {

	/** 报告编号 */
	public String reportid;
	/** 奖励机构 */
	public String organname;
	/** 奖励内容 */
	public String content;
	/** 生效年月 */
	public String begindate;
	/** 截止年月 */
	public String enddate;
	/** 标识 */
	public String seq;
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
