package io.github.homepy.whale.calcite.cs.po.pbc;

/** 行政奖励记录信息(CSP_PBC_ADMINAWARD) */
public class CspPbcAdminAward implements Comparable {

	/** 报告编号 */
	private String reportid;
	/** 奖励机构 */
	private String organname;
	/** 奖励内容 */
	private String content;
	/** 生效年月 */
	private String begindate;
	/** 截止年月 */
	private String enddate;
	/** 标识 */
	private String seq;
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
