package io.github.homepy.whale.calcite.cs.po.pbc;

/** 查询请求信息(CSP_PBC_QUERYINFO) */
public class CspPbcQueryInfo {

	/** 报告编号 */
	public String reportid;
	/** 被查询者证件类型 */
	public String queried_zjtype;
	/** 被查询者证件号码 */
	public String queried_zjno;
	/** 被查询者姓名 */
	public String queried_name;
	/** 查询机构 */
	public String query_org;
	/** 查询原因 */
	public String query_reason;
}
