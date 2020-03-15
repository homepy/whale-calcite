package io.github.homepy.whale.calcite.cs.po.pbc;

/** 查询记录汇总信息(CSP_PBC_QUERYRECORDSUM) */
public class CspPbcQueryRecordSum {

	/** 报告编号 */
	public String reportid;
	/** 最近1个月内的查询机构数（贷款审批） */
	public String latemonthqueorgsum_02;
	/** 最近1个月内的查询机构数（信用卡审批） */
	public String latemonthqueorgsum_03;
	/** 最近1个月内的查询次数（贷款审批） */
	public String latemonthquerecsum_02;
	/** 最近1个月内的查询次数（信用卡审批） */
	public String latemonthquerecsum_03;
	/** 最近1个月内的查询次数（本人查询） */
	public String latemonthquerecsum_04;
	/** 最近2年内的查询次数（贷后管理） */
	public String twoyearqueryrecsum_01;
	/** 最近2年内的查询次数（担保资格审查） */
	public String twoyearqueryrecsum_08;
	/** 最近2年内的查询次数（特约商户实名审查） */
	public String twoyearqueryrecsum_19;

}
