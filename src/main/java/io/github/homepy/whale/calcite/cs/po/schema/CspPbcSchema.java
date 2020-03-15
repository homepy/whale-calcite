package io.github.homepy.whale.calcite.cs.po.schema;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
import io.github.homepy.whale.calcite.cs.po.pbc.CspPbcNewLateMonthQueRecSum;

/**
 * 数据库schema-CspPbcSchema.
 * <br/>public的成员变量即为Table,如CspPbcMain[] csp_pbc_main即为csp_pbc_main表
 * @author hongpai
 *
 */
public class CspPbcSchema {

	/** 人行报告主信息表(CSP_PBC_MAIN) */
	public CspPbcMain[] csp_pbc_main;
	/** 人行报告居住信息表(CSP_PBC_PERRISIDE) */
	public CspPbcPerRiside[] csp_pbc_perriside;
	/** 人行报告职业信息表(CSP_PBC_PEROCCUP) */
	public CspPbcPerOccup[] csp_pbc_peroccup;
	/** 人行报告评分表(CSP_PBC_SCORE) */
	public CspPbcScore[] csp_pbc_score;
	/** 人行报告贷款明细表(CSP_PBC_LOANLIST) */
	public CspPbcLoanList[] csp_pbc_loanlist;
	/** 人行报告信用卡明细表(CSP_PBC_CREDITLIST) */
	public CspPbcCreditList[] csp_pbc_creditlist;
	/** 人行报告住房公积金信息表(CSP_PBC_HOUSEFUND) */
	public CspPbcHouseFund[] csp_pbc_housefund;
	/** 人行报告查询记录表(CSP_PBC_QUERIEDRECORD) */
	public CspPbcQueriedRecord[] csp_pbc_queriedrecord;
	/** 个人声明信息(CSP_PBC_DECLARE) */
	public CspPbcDeclare[] csp_pbc_declare;
	/** 查询请求信息(CSP_PBC_QUERYINFO) */
	public CspPbcQueryInfo[] csp_pbc_queryinfo;
	/** 未销户贷记卡信息汇总(CSP_PBCNEW_UNDESTORYLOANCARD) */
	public CspPbcNewUndestoryLoanCard[] csp_pbcnew_undestoryloancard;
	/** 最近1个月内的查询次数(CSP_PBCNEW_LATEMONTHQUERECSUM) */
	public CspPbcNewLateMonthQueRecSum[] csp_pbcnew_latemonthquerecsum;
	/** 其他身份标识信息(CSP_PBC_OTHERCERT) */
	public CspPbcOtherCert[] csp_pbc_othercert;
	/** 防欺诈警示信息(CSP_PBC_PREFRAUDCUE) */
	public CspPbcPreFraudCue[] csp_pbc_prefraudcue;
	/** 异议提示信息(CSP_PBC_DISSENTCUE) */
	public CspPbcDissentCue[] csp_pbc_dissentcue;
	/** 手机号码信息(CSP_PBC_MOBILEPHONE) */
	public CspPbcMobilePhone[] csp_pbc_mobilephone;
	/** 信贷汇总提示信息(CSP_PBC_CREDITSUMCUE) */
	public CspPbcCreditSumCue[] csp_pbc_creditsumcue;
	/** 被追偿汇总信息(CSP_PBC_RECOURSEDSUM) */
	public CspPbcRecoursedSum[] csp_pbc_recoursedsum;
	/** 呆账汇总信息(CSP_PBC_BADDEBTSUM) */
	public CspPbcBadDebtSum[] csp_pbc_baddebtsum;
	/** 逾期（透支）汇总信息(CSP_PBC_OVERDUESUM) */
	public CspPbcOverDueSum[] csp_pbc_overduesum;
	/** 非循环贷账户汇总信息(CSP_PBC_NONCYCLOANSUM) */
	public CspPbcNonCycLoanSum[] csp_pbc_noncycloansum;
	/** 循环额度下分账户汇总信息(CSP_PBC_CYCLIMITLOANSUM) */
	public CspPbcCycLimitLoanSum[] csp_pbc_cyclimitloansum;
	/** 循环贷账户汇总信息(CSP_PBC_CYCLOANSUM) */
	public CspPbcCycLoanSum[] csp_pbc_cycloansum;
	/** 贷记卡账户汇总信息(CSP_PBC_LOANCARDSUM) */
	public CspPbcLoanCardSum[] csp_pbc_loancardsum;
	/** 准贷记卡账户汇总信息(CSP_PBC_STANLOANCARDSUM) */
	public CspPbcStanLoanCardSum[] csp_pbc_stanloancardsum;
	/** 相关还款责任汇总信息(CSP_PBC_REPAYRESPSUM) */
	public CspPbcRepayRespSum[] csp_pbc_repayrespsum;
	/** 后付费业务欠费汇总信息(CSP_PBC_POSTPAYSUM) */
	public CspPbcPostPaySum[] csp_pbc_postpaysum;
	/** 公共信息概要信息(CSP_PBC_PUBLICINFOSUM) */
	public CspPbcPublicInfoSum[] csp_pbc_publicinfosum;
	/** 上一次查询记录信息(CSP_PBC_LASTQUERYRECORD) */
	public CspPbcLastQueryRecord[] csp_pbc_lastqueryrecord;
	/** 查询记录汇总信息(CSP_PBC_QUERYRECORDSUM) */
	public CspPbcQueryRecordSum[] csp_pbc_queryrecordsum;
	/** 借贷账户基本信息(CSP_PBC_CREDITACCOUNT) */
	public CspPbcCreditAccount[] csp_pbc_creditaccount;
	/** 最新表现信息(CSP_PBC_CURRACCOUNT) */
	public CspPbcCurrAccount[] csp_pbc_curraccount;
	/** 最近一次月度表现信息(CSP_PBC_LATESTMONTHLYBEHAVIOR) */
	public CspPbcLatestMonthlyBehavior[] csp_pbc_latestmonthlybehavior;
	/** 最近24个月还款状态(CSP_PBC_LATEST24PAYSTATE) */
	public CspPbcLatest24PayState[] csp_pbc_latest24paystate;
	/** 最近5年历史表现信息(CSP_PBC_LATEST5YEARBEHAVIOR) */
	public CspPbcLatest5YearBehavior[] csp_pbc_latest5yearbehavior;
	/** 特殊交易信息(CSP_PBC_SPECIALTRADE) */
	public CspPbcSpecialTrade[] csp_pbc_specialtrade;
	/** 特殊事件说明信息(CSP_PBC_SPECIALEVENT) */
	public CspPbcSpecialEvent[] csp_pbc_specialevent;
	/** 大额专项分期信息(CSP_PBC_LARGESTAGE) */
	public CspPbcLargeStage[] csp_pbc_largestage;
	/** 授信协议基本信息(CSP_PBC_AWARDCREDIT) */
	public CspPbcAwardCredit[] csp_pbc_awardcredit;
	/** 相关还款责任信息(CSP_PBC_REPAYRESP) */
	public CspPbcRepayResp[] csp_pbc_repayresp;
	/** 后付费业务信息(CSP_PBC_POSTPAYMENT) */
	public CspPbcPostPayment[] csp_pbc_postpayment;
	/** 欠税记录信息(CSP_PBC_TAXARREAR) */
	public CspPbcTaxArrear[] csp_pbc_taxarrear;
	/** 民事判决信息(CSP_PBC_CIVILJUDGEMENT) */
	public CspPbcCivilJudgement[] csp_pbc_civiljudgement;
	/** 强制执行记录信息(CSP_PBC_FORCEEXECUTION) */
	public CspPbcForceExecution[] csp_pbc_forceexecution;
	/** 行政处罚记录信息(CSP_PBC_ADMINPUNISHMENT) */
	public CspPbcAdminPunishment[] csp_pbc_adminpunishment;
	/** 低保救助记录信息(CSP_PBC_SALVATION) */
	public CspPbcSalvation[] csp_pbc_salvation;
	/** 执业资格记录信息(CSP_PBC_COMPETENCE) */
	public CspPbcCompetence[] csp_pbc_competence;
	/** 行政奖励记录信息(CSP_PBC_ADMINAWARD) */
	public CspPbcAdminAward[] csp_pbc_adminaward;
	/** 其他标注及声明信息汇总(CSP_PBC_DISSENTANNOUNCESUM) */
	public CspPbcDissentAnnounceSum[] csp_pbc_dissentannouncesum;
	
	@Override
	public String toString() {
		return "CspPbcSchema";
	}
	
	public CspPbcSchema() {
		checkAndInit();
	}

	@SuppressWarnings("unchecked")
	private <T> T[] toArray(Class<T> clazz, Object item) {
		List<T> list = null;
		if (item instanceof JSONObject) {
			list = Arrays.asList(((JSONObject) item).toJavaObject(clazz));
		} else if (item instanceof JSONArray) {
			list = ((JSONArray) item).toJavaList(clazz);
		}
		T[] arr = (T[]) Array.newInstance(clazz, list.size());
		return list.toArray(arr);
	}

	public CspPbcSchema(JSONObject jsonObj) {
		JSONArray segments = jsonObj.getJSONArray("SEGMENT");
		for (int i = 0; i < segments.size(); i++) {
			JSONObject segment = segments.getJSONObject(i);
			String id = Objects.toString(segment.get("ID"));
			Object item = segment.get("ITEM");

			switch (id) {
			case "CSP_PBC_MAIN":
				csp_pbc_main = toArray(CspPbcMain.class, item);
				break;
			case "CSP_PBC_PERRISIDE":
				csp_pbc_perriside = toArray(CspPbcPerRiside.class, item);
				break;
			case "CSP_PBC_PEROCCUP":
				csp_pbc_peroccup = toArray(CspPbcPerOccup.class, item);
				break;
			case "CSP_PBC_SCORE":
				csp_pbc_score = toArray(CspPbcScore.class, item);
				break;
			case "CSP_PBC_LOANLIST":
				csp_pbc_loanlist = toArray(CspPbcLoanList.class, item);
				break;
			case "CSP_PBC_CREDITLIST":
				csp_pbc_creditlist = toArray(CspPbcCreditList.class, item);
				break;
			case "CSP_PBC_HOUSEFUND":
				csp_pbc_housefund = toArray(CspPbcHouseFund.class, item);
				break;
			case "CSP_PBC_QUERIEDRECORD":
				csp_pbc_queriedrecord = toArray(CspPbcQueriedRecord.class, item);
				break;
			case "CSP_PBC_DECLARE":
				csp_pbc_declare = toArray(CspPbcDeclare.class, item);
				break;
			case "CSP_PBC_QUERYINFO":
				csp_pbc_queryinfo = toArray(CspPbcQueryInfo.class, item);
				break;
			case "CSP_PBCNEW_UNDESTORYLOANCARD":
				csp_pbcnew_undestoryloancard = toArray(CspPbcNewUndestoryLoanCard.class, item);
				break;
			case "CSP_PBCNEW_LATEMONTHQUERECSUM":
				csp_pbcnew_latemonthquerecsum = toArray(CspPbcNewLateMonthQueRecSum.class, item);
				break;
			case "CSP_PBC_OTHERCERT":
				csp_pbc_othercert = toArray(CspPbcOtherCert.class, item);
				break;
			case "CSP_PBC_PREFRAUDCUE":
				csp_pbc_prefraudcue = toArray(CspPbcPreFraudCue.class, item);
				break;
			case "CSP_PBC_DISSENTCUE":
				csp_pbc_dissentcue = toArray(CspPbcDissentCue.class, item);
				break;
			case "CSP_PBC_MOBILEPHONE":
				csp_pbc_mobilephone = toArray(CspPbcMobilePhone.class, item);
				break;
			case "CSP_PBC_CREDITSUMCUE":
				csp_pbc_creditsumcue = toArray(CspPbcCreditSumCue.class, item);
				break;
			case "CSP_PBC_RECOURSEDSUM":
				csp_pbc_recoursedsum = toArray(CspPbcRecoursedSum.class, item);
				break;
			case "CSP_PBC_BADDEBTSUM":
				csp_pbc_baddebtsum = toArray(CspPbcBadDebtSum.class, item);
				break;
			case "CSP_PBC_OVERDUESUM":
				csp_pbc_overduesum = toArray(CspPbcOverDueSum.class, item);
				break;
			case "CSP_PBC_NONCYCLOANSUM":
				csp_pbc_noncycloansum = toArray(CspPbcNonCycLoanSum.class, item);
				break;
			case "CSP_PBC_CYCLIMITLOANSUM":
				csp_pbc_cyclimitloansum = toArray(CspPbcCycLimitLoanSum.class, item);
				break;
			case "CSP_PBC_CYCLOANSUM":
				csp_pbc_cycloansum = toArray(CspPbcCycLoanSum.class, item);
				break;
			case "CSP_PBC_LOANCARDSUM":
				csp_pbc_loancardsum = toArray(CspPbcLoanCardSum.class, item);
				break;
			case "CSP_PBC_STANLOANCARDSUM":
				csp_pbc_stanloancardsum = toArray(CspPbcStanLoanCardSum.class, item);
				break;
			case "CSP_PBC_REPAYRESPSUM":
				csp_pbc_repayrespsum = toArray(CspPbcRepayRespSum.class, item);
				break;
			case "CSP_PBC_POSTPAYSUM":
				csp_pbc_postpaysum = toArray(CspPbcPostPaySum.class, item);
				break;
			case "CSP_PBC_PUBLICINFOSUM":
				csp_pbc_publicinfosum = toArray(CspPbcPublicInfoSum.class, item);
				break;
			case "CSP_PBC_LASTQUERYRECORD":
				csp_pbc_lastqueryrecord = toArray(CspPbcLastQueryRecord.class, item);
				break;
			case "CSP_PBC_QUERYRECORDSUM":
				csp_pbc_queryrecordsum = toArray(CspPbcQueryRecordSum.class, item);
				break;
			case "CSP_PBC_CREDITACCOUNT":
				csp_pbc_creditaccount = toArray(CspPbcCreditAccount.class, item);
				break;
			case "CSP_PBC_CURRACCOUNT":
				csp_pbc_curraccount = toArray(CspPbcCurrAccount.class, item);
				break;
			case "CSP_PBC_LATESTMONTHLYBEHAVIOR":
				csp_pbc_latestmonthlybehavior = toArray(CspPbcLatestMonthlyBehavior.class, item);
				break;
			case "CSP_PBC_LATEST24PAYSTATE":
				csp_pbc_latest24paystate = toArray(CspPbcLatest24PayState.class, item);
				break;
			case "CSP_PBC_LATEST5YEARBEHAVIOR":
				csp_pbc_latest5yearbehavior = toArray(CspPbcLatest5YearBehavior.class, item);
				break;
			case "CSP_PBC_SPECIALTRADE":
				csp_pbc_specialtrade = toArray(CspPbcSpecialTrade.class, item);
				break;
			case "CSP_PBC_SPECIALEVENT":
				csp_pbc_specialevent = toArray(CspPbcSpecialEvent.class, item);
				break;
			case "CSP_PBC_LARGESTAGE":
				csp_pbc_largestage = toArray(CspPbcLargeStage.class, item);
				break;
			case "CSP_PBC_AWARDCREDIT":
				csp_pbc_awardcredit = toArray(CspPbcAwardCredit.class, item);
				break;
			case "CSP_PBC_REPAYRESP":
				csp_pbc_repayresp = toArray(CspPbcRepayResp.class, item);
				break;
			case "CSP_PBC_POSTPAYMENT":
				csp_pbc_postpayment = toArray(CspPbcPostPayment.class, item);
				break;
			case "CSP_PBC_TAXARREAR":
				csp_pbc_taxarrear = toArray(CspPbcTaxArrear.class, item);
				break;
			case "CSP_PBC_CIVILJUDGEMENT":
				csp_pbc_civiljudgement = toArray(CspPbcCivilJudgement.class, item);
				break;
			case "CSP_PBC_FORCEEXECUTION":
				csp_pbc_forceexecution = toArray(CspPbcForceExecution.class, item);
				break;
			case "CSP_PBC_ADMINPUNISHMENT":
				csp_pbc_adminpunishment = toArray(CspPbcAdminPunishment.class, item);
				break;
			case "CSP_PBC_SALVATION":
				csp_pbc_salvation = toArray(CspPbcSalvation.class, item);
				break;
			case "CSP_PBC_COMPETENCE":
				csp_pbc_competence = toArray(CspPbcCompetence.class, item);
				break;
			case "CSP_PBC_ADMINAWARD":
				csp_pbc_adminaward = toArray(CspPbcAdminAward.class, item);
				break;
			case "CSP_PBC_DISSENTANNOUNCESUM":
				csp_pbc_dissentannouncesum = toArray(CspPbcDissentAnnounceSum.class, item);
				break;
			default:
				break;
			}
		}
		checkAndInit();
	}
	private void checkAndInit() {
		csp_pbc_main = (csp_pbc_main == null) ? new CspPbcMain[0] : csp_pbc_main;
		csp_pbc_perriside = (csp_pbc_perriside == null) ? new CspPbcPerRiside[0] : csp_pbc_perriside;
		csp_pbc_peroccup = (csp_pbc_peroccup == null) ? new CspPbcPerOccup[0] : csp_pbc_peroccup;
		csp_pbc_score = (csp_pbc_score == null) ? new CspPbcScore[0] : csp_pbc_score;
		csp_pbc_loanlist = (csp_pbc_loanlist == null) ? new CspPbcLoanList[0] : csp_pbc_loanlist;
		csp_pbc_creditlist = (csp_pbc_creditlist == null) ? new CspPbcCreditList[0] : csp_pbc_creditlist;
		csp_pbc_housefund = (csp_pbc_housefund == null) ? new CspPbcHouseFund[0] : csp_pbc_housefund;
		csp_pbc_queriedrecord = (csp_pbc_queriedrecord == null) ? new CspPbcQueriedRecord[0] : csp_pbc_queriedrecord;
		csp_pbc_declare = (csp_pbc_declare == null) ? new CspPbcDeclare[0] : csp_pbc_declare;
		csp_pbc_queryinfo = (csp_pbc_queryinfo == null) ? new CspPbcQueryInfo[0] : csp_pbc_queryinfo;
		csp_pbcnew_undestoryloancard = (csp_pbcnew_undestoryloancard == null) ? new CspPbcNewUndestoryLoanCard[0]
				: csp_pbcnew_undestoryloancard;
		csp_pbcnew_latemonthquerecsum = (csp_pbcnew_latemonthquerecsum == null) ? new CspPbcNewLateMonthQueRecSum[0]
				: csp_pbcnew_latemonthquerecsum;
		csp_pbc_othercert = (csp_pbc_othercert == null) ? new CspPbcOtherCert[0] : csp_pbc_othercert;
		csp_pbc_prefraudcue = (csp_pbc_prefraudcue == null) ? new CspPbcPreFraudCue[0] : csp_pbc_prefraudcue;
		csp_pbc_dissentcue = (csp_pbc_dissentcue == null) ? new CspPbcDissentCue[0] : csp_pbc_dissentcue;
		csp_pbc_mobilephone = (csp_pbc_mobilephone == null) ? new CspPbcMobilePhone[0] : csp_pbc_mobilephone;
		csp_pbc_creditsumcue = (csp_pbc_creditsumcue == null) ? new CspPbcCreditSumCue[0] : csp_pbc_creditsumcue;
		csp_pbc_recoursedsum = (csp_pbc_recoursedsum == null) ? new CspPbcRecoursedSum[0] : csp_pbc_recoursedsum;
		csp_pbc_baddebtsum = (csp_pbc_baddebtsum == null) ? new CspPbcBadDebtSum[0] : csp_pbc_baddebtsum;
		csp_pbc_overduesum = (csp_pbc_overduesum == null) ? new CspPbcOverDueSum[0] : csp_pbc_overduesum;
		csp_pbc_noncycloansum = (csp_pbc_noncycloansum == null) ? new CspPbcNonCycLoanSum[0] : csp_pbc_noncycloansum;
		csp_pbc_cyclimitloansum = (csp_pbc_cyclimitloansum == null) ? new CspPbcCycLimitLoanSum[0]
				: csp_pbc_cyclimitloansum;
		csp_pbc_cycloansum = (csp_pbc_cycloansum == null) ? new CspPbcCycLoanSum[0] : csp_pbc_cycloansum;
		csp_pbc_loancardsum = (csp_pbc_loancardsum == null) ? new CspPbcLoanCardSum[0] : csp_pbc_loancardsum;
		csp_pbc_stanloancardsum = (csp_pbc_stanloancardsum == null) ? new CspPbcStanLoanCardSum[0]
				: csp_pbc_stanloancardsum;
		csp_pbc_repayrespsum = (csp_pbc_repayrespsum == null) ? new CspPbcRepayRespSum[0] : csp_pbc_repayrespsum;
		csp_pbc_postpaysum = (csp_pbc_postpaysum == null) ? new CspPbcPostPaySum[0] : csp_pbc_postpaysum;
		csp_pbc_publicinfosum = (csp_pbc_publicinfosum == null) ? new CspPbcPublicInfoSum[0] : csp_pbc_publicinfosum;
		csp_pbc_lastqueryrecord = (csp_pbc_lastqueryrecord == null) ? new CspPbcLastQueryRecord[0]
				: csp_pbc_lastqueryrecord;
		csp_pbc_queryrecordsum = (csp_pbc_queryrecordsum == null) ? new CspPbcQueryRecordSum[0]
				: csp_pbc_queryrecordsum;
		csp_pbc_creditaccount = (csp_pbc_creditaccount == null) ? new CspPbcCreditAccount[0] : csp_pbc_creditaccount;
		csp_pbc_curraccount = (csp_pbc_curraccount == null) ? new CspPbcCurrAccount[0] : csp_pbc_curraccount;
		csp_pbc_latestmonthlybehavior = (csp_pbc_latestmonthlybehavior == null) ? new CspPbcLatestMonthlyBehavior[0]
				: csp_pbc_latestmonthlybehavior;
		csp_pbc_latest24paystate = (csp_pbc_latest24paystate == null) ? new CspPbcLatest24PayState[0]
				: csp_pbc_latest24paystate;
		csp_pbc_latest5yearbehavior = (csp_pbc_latest5yearbehavior == null) ? new CspPbcLatest5YearBehavior[0]
				: csp_pbc_latest5yearbehavior;
		csp_pbc_specialtrade = (csp_pbc_specialtrade == null) ? new CspPbcSpecialTrade[0] : csp_pbc_specialtrade;
		csp_pbc_specialevent = (csp_pbc_specialevent == null) ? new CspPbcSpecialEvent[0] : csp_pbc_specialevent;
		csp_pbc_largestage = (csp_pbc_largestage == null) ? new CspPbcLargeStage[0] : csp_pbc_largestage;
		csp_pbc_awardcredit = (csp_pbc_awardcredit == null) ? new CspPbcAwardCredit[0] : csp_pbc_awardcredit;
		csp_pbc_repayresp = (csp_pbc_repayresp == null) ? new CspPbcRepayResp[0] : csp_pbc_repayresp;
		csp_pbc_postpayment = (csp_pbc_postpayment == null) ? new CspPbcPostPayment[0] : csp_pbc_postpayment;
		csp_pbc_taxarrear = (csp_pbc_taxarrear == null) ? new CspPbcTaxArrear[0] : csp_pbc_taxarrear;
		csp_pbc_civiljudgement = (csp_pbc_civiljudgement == null) ? new CspPbcCivilJudgement[0]
				: csp_pbc_civiljudgement;
		csp_pbc_forceexecution = (csp_pbc_forceexecution == null) ? new CspPbcForceExecution[0]
				: csp_pbc_forceexecution;
		csp_pbc_adminpunishment = (csp_pbc_adminpunishment == null) ? new CspPbcAdminPunishment[0]
				: csp_pbc_adminpunishment;
		csp_pbc_salvation = (csp_pbc_salvation == null) ? new CspPbcSalvation[0] : csp_pbc_salvation;
		csp_pbc_competence = (csp_pbc_competence == null) ? new CspPbcCompetence[0] : csp_pbc_competence;
		csp_pbc_adminaward = (csp_pbc_adminaward == null) ? new CspPbcAdminAward[0] : csp_pbc_adminaward;
		csp_pbc_dissentannouncesum = (csp_pbc_dissentannouncesum == null) ? new CspPbcDissentAnnounceSum[0]
				: csp_pbc_dissentannouncesum;
	}

}
