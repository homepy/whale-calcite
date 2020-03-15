package io.github.homepy.whale.calcite.cs.po.pbc;

/** 民事判决信息(CSP_PBC_CIVILJUDGEMENT) */
public class CspPbcCivilJudgement {

	/** 报告编号 */
	public String reportid;
	/** 立案法院 */
	public String court;
	/** 案由 */
	public String casereason;
	/** 立案日期 */
	public String registerdate;
	/** 结案方式 */
	public String closedtype;
	/** 判决/调解结果 */
	public String caseresult;
	/** 判决/调解生效日期 */
	public String casevalidatedate;
	/** 诉讼标的 */
	public String suitobject;
	/** 诉讼标的金额 */
	public String suitobjectmoney;
	/** 标识 */
	public String seq;
}
