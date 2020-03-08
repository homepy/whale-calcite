package io.github.homepy.whale.calcite.cs.po.pbc;

/** 查询请求信息(CSP_PBC_QUERYINFO) */
public class CspPbcQueryInfo {

	/** 报告编号 */
	private String reportid;
	/** 被查询者证件类型 */
	private String queried_zjtype;
	/** 被查询者证件号码 */
	private String queried_zjno;
	/** 被查询者姓名 */
	private String queried_name;
	/** 查询机构 */
	private String query_org;
	/** 查询原因 */
	private String query_reason;
}
