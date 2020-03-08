package io.github.homepy.whale.calcite.cs.po.schema;

import java.util.ArrayList;
import java.util.Arrays;
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

public class PbcSchema {
	
	@Override
	public String toString() {
		return "CspPbcSchema";
	}

	/** 人行报告主信息表(CSP_PBC_MAIN) */
	public List<CspPbcMain> csp_pbc_main = new ArrayList<>(Arrays.asList(new CspPbcMain("1"), new CspPbcMain("2"))) ;
	/** 人行报告居住信息表(CSP_PBC_PERRISIDE) */
	public List<CspPbcPerRiside> csp_pbc_perriside = new ArrayList<>();
	/** 人行报告职业信息表(CSP_PBC_PEROCCUP) */
	public List<CspPbcPerOccup> csp_pbc_peroccup = new ArrayList<>();
	/** 人行报告评分表(CSP_PBC_SCORE) */
	public List<CspPbcScore> csp_pbc_score = new ArrayList<>();
	/** 人行报告贷款明细表(CSP_PBC_LOANLIST) */
	public List<CspPbcLoanList> csp_pbc_loanlist = new ArrayList<>();
	/** 人行报告信用卡明细表(CSP_PBC_CREDITLIST) */
	public List<CspPbcCreditList> csp_pbc_creditlist = new ArrayList<>();
	/** 人行报告住房公积金信息表(CSP_PBC_HOUSEFUND) */
	public List<CspPbcHouseFund> csp_pbc_housefund = new ArrayList<>();
	/** 人行报告查询记录表(CSP_PBC_QUERIEDRECORD) */
	public List<CspPbcQueriedRecord> csp_pbc_queriedrecord = new ArrayList<>();
	/** 个人声明信息(CSP_PBC_DECLARE) */
	public List<CspPbcDeclare> csp_pbc_declare = new ArrayList<>();
	/** 查询请求信息(CSP_PBC_QUERYINFO) */
	public List<CspPbcQueryInfo> csp_pbc_queryinfo = new ArrayList<>();
	/** 未销户贷记卡信息汇总(CSP_PBCNEW_UNDESTORYLOANCARD) */
	public List<CspPbcNewUndestoryLoanCard> csp_pbcnew_undestoryloancard = new ArrayList<>();
	/** 最近1个月内的查询次数(CSP_PBCNEW_LATEMONTHQUERECSUM) */
	public List<CspPbcnewLateMonthQueRecSum> csp_pbcnew_latemonthquerecsum = new ArrayList<>();
	/** 其他身份标识信息(CSP_PBC_OTHERCERT) */
	public List<CspPbcOtherCert> csp_pbc_othercert = new ArrayList<>();
	/** 防欺诈警示信息(CSP_PBC_PREFRAUDCUE) */
	public List<CspPbcPreFraudCue> csp_pbc_prefraudcue = new ArrayList<>();
	/** 异议提示信息(CSP_PBC_DISSENTCUE) */
	public List<CspPbcDissentCue> csp_pbc_dissentcue = new ArrayList<>();
	/** 手机号码信息(CSP_PBC_MOBILEPHONE) */
	public List<CspPbcMobilePhone> csp_pbc_mobilephone = new ArrayList<>();
	/** 信贷汇总提示信息(CSP_PBC_CREDITSUMCUE) */
	public List<CspPbcCreditSumCue> csp_pbc_creditsumcue = new ArrayList<>();
	/** 被追偿汇总信息(CSP_PBC_RECOURSEDSUM) */
	public List<CspPbcRecoursedSum> csp_pbc_recoursedsum = new ArrayList<>();
	/** 呆账汇总信息(CSP_PBC_BADDEBTSUM) */
	public List<CspPbcBadDebtSum> csp_pbc_baddebtsum = new ArrayList<>();
	/** 逾期（透支）汇总信息(CSP_PBC_OVERDUESUM) */
	public List<CspPbcOverDueSum> csp_pbc_overduesum = new ArrayList<>();
	/** 非循环贷账户汇总信息(CSP_PBC_NONCYCLOANSUM) */
	public List<CspPbcNonCycLoanSum> csp_pbc_noncycloansum = new ArrayList<>();
	/** 循环额度下分账户汇总信息(CSP_PBC_CYCLIMITLOANSUM) */
	public List<CspPbcCycLimitLoanSum> csp_pbc_cyclimitloansum = new ArrayList<>();
	/** 循环贷账户汇总信息(CSP_PBC_CYCLOANSUM) */
	public List<CspPbcCycLoanSum> csp_pbc_cycloansum = new ArrayList<>();
	/** 贷记卡账户汇总信息(CSP_PBC_LOANCARDSUM) */
	public List<CspPbcLoanCardSum> csp_pbc_loancardsum = new ArrayList<>();
	/** 准贷记卡账户汇总信息(CSP_PBC_STANLOANCARDSUM) */
	public List<CspPbcStanLoanCardSum> csp_pbc_stanloancardsum = new ArrayList<>();
	/** 相关还款责任汇总信息(CSP_PBC_REPAYRESPSUM) */
	public List<CspPbcRepayRespSum> csp_pbc_repayrespsum = new ArrayList<>();
	/** 后付费业务欠费汇总信息(CSP_PBC_POSTPAYSUM) */
	public List<CspPbcPostPaySum> csp_pbc_postpaysum = new ArrayList<>();
	/** 公共信息概要信息(CSP_PBC_PUBLICINFOSUM) */
	public List<CspPbcPublicInfoSum> csp_pbc_publicinfosum = new ArrayList<>();
	/** 上一次查询记录信息(CSP_PBC_LASTQUERYRECORD) */
	public List<CspPbcLastQueryRecord> csp_pbc_lastqueryrecord = new ArrayList<>();
	/** 查询记录汇总信息(CSP_PBC_QUERYRECORDSUM) */
	public List<CspPbcQueryRecordSum> csp_pbc_queryrecordsum = new ArrayList<>();
	/** 借贷账户基本信息(CSP_PBC_CREDITACCOUNT) */
	public List<CspPbcCreditAccount> csp_pbc_creditaccount = new ArrayList<>();
	/** 最新表现信息(CSP_PBC_CURRACCOUNT) */
	public List<CspPbcCurrAccount> csp_pbc_curraccount = new ArrayList<>();
	/** 最近一次月度表现信息(CSP_PBC_LATESTMONTHLYBEHAVIOR) */
	public List<CspPbcLatestMonthlyBehavior> csp_pbc_latestmonthlybehavior = new ArrayList<>();
	/** 最近24个月还款状态(CSP_PBC_LATEST24PAYSTATE) */
	public List<CspPbcLatest24PayState> csp_pbc_latest24paystate = new ArrayList<>();
	/** 最近5年历史表现信息(CSP_PBC_LATEST5YEARBEHAVIOR) */
	public List<CspPbcLatest5YearBehavior> csp_pbc_latest5yearbehavior = new ArrayList<>();
	/** 特殊交易信息(CSP_PBC_SPECIALTRADE) */
	public List<CspPbcSpecialTrade> csp_pbc_specialtrade = new ArrayList<>();
	/** 特殊事件说明信息(CSP_PBC_SPECIALEVENT) */
	public List<CspPbcSpecialEvent> csp_pbc_specialevent = new ArrayList<>();
	/** 大额专项分期信息(CSP_PBC_LARGESTAGE) */
	public List<CspPbcLargeStage> csp_pbc_largestage = new ArrayList<>();
	/** 授信协议基本信息(CSP_PBC_AWARDCREDIT) */
	public List<CspPbcAwardCredit> csp_pbc_awardcredit = new ArrayList<>();
	/** 相关还款责任信息(CSP_PBC_REPAYRESP) */
	public List<CspPbcRepayResp> csp_pbc_repayresp = new ArrayList<>();
	/** 后付费业务信息(CSP_PBC_POSTPAYMENT) */
	public List<CspPbcPostPayment> csp_pbc_postpayment = new ArrayList<>();
	/** 欠税记录信息(CSP_PBC_TAXARREAR) */
	public List<CspPbcTaxArrear> csp_pbc_taxarrear = new ArrayList<>();
	/** 民事判决信息(CSP_PBC_CIVILJUDGEMENT) */
	public List<CspPbcCivilJudgement> csp_pbc_civiljudgement = new ArrayList<>();
	/** 强制执行记录信息(CSP_PBC_FORCEEXECUTION) */
	public List<CspPbcForceExecution> csp_pbc_forceexecution = new ArrayList<>();
	/** 行政处罚记录信息(CSP_PBC_ADMINPUNISHMENT) */
	public List<CspPbcAdminPunishment> csp_pbc_adminpunishment = new ArrayList<>();
	/** 低保救助记录信息(CSP_PBC_SALVATION) */
	public List<CspPbcSalvation> csp_pbc_salvation = new ArrayList<>();
	/** 执业资格记录信息(CSP_PBC_COMPETENCE) */
	public List<CspPbcCompetence> csp_pbc_competence = new ArrayList<>();
	/** 行政奖励记录信息(CSP_PBC_ADMINAWARD) */
	public List<CspPbcAdminAward> csp_pbc_adminaward = new ArrayList<>();
	/** 其他标注及声明信息汇总(CSP_PBC_DISSENTANNOUNCESUM) */
	public List<CspPbcDissentAnnounceSum> csp_pbc_dissentannouncesum = new ArrayList<>();

	
	
	
	
}
