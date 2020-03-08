package io.github.homepy.whale.calcite.cs.po.schema;

import java.util.ArrayList;
import java.util.List;

import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcAdminAward;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcAdminPunishment;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcAwardCredit;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcBadDebtSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCivilJudgement;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCompetence;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCreditAccount;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCreditList;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCreditSumCue;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCurrAccount;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCycLimitLoanSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcCycLoanSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcDeclare;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcDissentAnnounceSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcDissentCue;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcForceExecution;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcHouseFund;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLargeStage;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLastQueryRecord;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLatest24PayState;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLatest5YearBehavior;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLatestMonthlyBehavior;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLoanCardSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcLoanList;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcMain;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcMobilePhone;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcNewUndestoryLoanCard;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcNonCycLoanSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcOtherCert;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcOverDueSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPerOccup;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPerRiside;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPostPaySum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPostPayment;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPreFraudCue;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcPublicInfoSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcQueriedRecord;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcQueryInfo;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcQueryRecordSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcRecoursedSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcRepayResp;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcRepayRespSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcSalvation;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcScore;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcSpecialEvent;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcSpecialTrade;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcStanLoanCardSum;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcTaxArrear;
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcnewLateMonthQueRecSum;

public class CspPbcSchema {
	
	@Override
	public String toString() {
		return "CspPbcSchema";
	}

	/** 人行报告主信息表(CSP_PBC_MAIN) */
	public CspPbcMain[] csp_pbc_main = {new CspPbcMain("1"), new CspPbcMain("2")};
	/** 人行报告居住信息表(CSP_PBC_PERRISIDE) */
	public CspPbcPerRiside[] csp_pbc_perriside = {};
	/** 人行报告职业信息表(CSP_PBC_PEROCCUP) */
	public CspPbcPerOccup[] csp_pbc_peroccup = {};
	/** 人行报告评分表(CSP_PBC_SCORE) */
	public CspPbcScore[] csp_pbc_score = {};
	/** 人行报告贷款明细表(CSP_PBC_LOANLIST) */
	public CspPbcLoanList[] csp_pbc_loanlist = {};
	/** 人行报告信用卡明细表(CSP_PBC_CREDITLIST) */
	public CspPbcCreditList[] csp_pbc_creditlist = {};
	/** 人行报告住房公积金信息表(CSP_PBC_HOUSEFUND) */
	public CspPbcHouseFund[] csp_pbc_housefund = {};
	/** 人行报告查询记录表(CSP_PBC_QUERIEDRECORD) */
	public CspPbcQueriedRecord[] csp_pbc_queriedrecord = {};
	/** 个人声明信息(CSP_PBC_DECLARE) */
	public CspPbcDeclare[] csp_pbc_declare = {};
	/** 查询请求信息(CSP_PBC_QUERYINFO) */
	public CspPbcQueryInfo[] csp_pbc_queryinfo = {};
	/** 未销户贷记卡信息汇总(CSP_PBCNEW_UNDESTORYLOANCARD) */
	public CspPbcNewUndestoryLoanCard[] csp_pbcnew_undestoryloancard = {};
	/** 最近1个月内的查询次数(CSP_PBCNEW_LATEMONTHQUERECSUM) */
	public CspPbcnewLateMonthQueRecSum[] csp_pbcnew_latemonthquerecsum = {};
	/** 其他身份标识信息(CSP_PBC_OTHERCERT) */
	public CspPbcOtherCert[] csp_pbc_othercert = {};
	/** 防欺诈警示信息(CSP_PBC_PREFRAUDCUE) */
	public CspPbcPreFraudCue[] csp_pbc_prefraudcue = {};
	/** 异议提示信息(CSP_PBC_DISSENTCUE) */
	public CspPbcDissentCue[] csp_pbc_dissentcue = {};
	/** 手机号码信息(CSP_PBC_MOBILEPHONE) */
	public CspPbcMobilePhone[] csp_pbc_mobilephone = {};
	/** 信贷汇总提示信息(CSP_PBC_CREDITSUMCUE) */
	public CspPbcCreditSumCue[] csp_pbc_creditsumcue = {};
	/** 被追偿汇总信息(CSP_PBC_RECOURSEDSUM) */
	public CspPbcRecoursedSum[] csp_pbc_recoursedsum = {};
	/** 呆账汇总信息(CSP_PBC_BADDEBTSUM) */
	public CspPbcBadDebtSum[] csp_pbc_baddebtsum = {};
	/** 逾期（透支）汇总信息(CSP_PBC_OVERDUESUM) */
	public CspPbcOverDueSum[] csp_pbc_overduesum = {};
	/** 非循环贷账户汇总信息(CSP_PBC_NONCYCLOANSUM) */
	public CspPbcNonCycLoanSum[] csp_pbc_noncycloansum = {};
	/** 循环额度下分账户汇总信息(CSP_PBC_CYCLIMITLOANSUM) */
	public CspPbcCycLimitLoanSum[] csp_pbc_cyclimitloansum = {};
	/** 循环贷账户汇总信息(CSP_PBC_CYCLOANSUM) */
	public CspPbcCycLoanSum[] csp_pbc_cycloansum = {};
	/** 贷记卡账户汇总信息(CSP_PBC_LOANCARDSUM) */
	public CspPbcLoanCardSum[] csp_pbc_loancardsum = {};
	/** 准贷记卡账户汇总信息(CSP_PBC_STANLOANCARDSUM) */
	public CspPbcStanLoanCardSum[] csp_pbc_stanloancardsum = {};
	/** 相关还款责任汇总信息(CSP_PBC_REPAYRESPSUM) */
	public CspPbcRepayRespSum[] csp_pbc_repayrespsum = {};
	/** 后付费业务欠费汇总信息(CSP_PBC_POSTPAYSUM) */
	public CspPbcPostPaySum[] csp_pbc_postpaysum = {};
	/** 公共信息概要信息(CSP_PBC_PUBLICINFOSUM) */
	public CspPbcPublicInfoSum[] csp_pbc_publicinfosum = {};
	/** 上一次查询记录信息(CSP_PBC_LASTQUERYRECORD) */
	public CspPbcLastQueryRecord[] csp_pbc_lastqueryrecord = {};
	/** 查询记录汇总信息(CSP_PBC_QUERYRECORDSUM) */
	public CspPbcQueryRecordSum[] csp_pbc_queryrecordsum = {};
	/** 借贷账户基本信息(CSP_PBC_CREDITACCOUNT) */
	public CspPbcCreditAccount[] csp_pbc_creditaccount = {};
	/** 最新表现信息(CSP_PBC_CURRACCOUNT) */
	public CspPbcCurrAccount[] csp_pbc_curraccount = {};
	/** 最近一次月度表现信息(CSP_PBC_LATESTMONTHLYBEHAVIOR) */
	public CspPbcLatestMonthlyBehavior[] csp_pbc_latestmonthlybehavior = {};
	/** 最近24个月还款状态(CSP_PBC_LATEST24PAYSTATE) */
	public CspPbcLatest24PayState[] csp_pbc_latest24paystate = {};
	/** 最近5年历史表现信息(CSP_PBC_LATEST5YEARBEHAVIOR) */
	public CspPbcLatest5YearBehavior[] csp_pbc_latest5yearbehavior = {};
	/** 特殊交易信息(CSP_PBC_SPECIALTRADE) */
	public CspPbcSpecialTrade[] csp_pbc_specialtrade = {};
	/** 特殊事件说明信息(CSP_PBC_SPECIALEVENT) */
	public CspPbcSpecialEvent[] csp_pbc_specialevent = {};
	/** 大额专项分期信息(CSP_PBC_LARGESTAGE) */
	public CspPbcLargeStage[] csp_pbc_largestage = {};
	/** 授信协议基本信息(CSP_PBC_AWARDCREDIT) */
	public CspPbcAwardCredit[] csp_pbc_awardcredit = {};
	/** 相关还款责任信息(CSP_PBC_REPAYRESP) */
	public CspPbcRepayResp[] csp_pbc_repayresp = {};
	/** 后付费业务信息(CSP_PBC_POSTPAYMENT) */
	public CspPbcPostPayment[] csp_pbc_postpayment = {};
	/** 欠税记录信息(CSP_PBC_TAXARREAR) */
	public CspPbcTaxArrear[] csp_pbc_taxarrear = {};
	/** 民事判决信息(CSP_PBC_CIVILJUDGEMENT) */
	public CspPbcCivilJudgement[] csp_pbc_civiljudgement = {};
	/** 强制执行记录信息(CSP_PBC_FORCEEXECUTION) */
	public CspPbcForceExecution[] csp_pbc_forceexecution = {};
	/** 行政处罚记录信息(CSP_PBC_ADMINPUNISHMENT) */
	public CspPbcAdminPunishment[] csp_pbc_adminpunishment = {};
	/** 低保救助记录信息(CSP_PBC_SALVATION) */
	public CspPbcSalvation[] csp_pbc_salvation = {};
	/** 执业资格记录信息(CSP_PBC_COMPETENCE) */
	public CspPbcCompetence[] csp_pbc_competence = {};
	/** 行政奖励记录信息(CSP_PBC_ADMINAWARD) */
	public CspPbcAdminAward[] csp_pbc_adminaward = {};
	/** 其他标注及声明信息汇总(CSP_PBC_DISSENTANNOUNCESUM) */
	public CspPbcDissentAnnounceSum[] csp_pbc_dissentannouncesum = {};
	
	

	
	
	
	
}
