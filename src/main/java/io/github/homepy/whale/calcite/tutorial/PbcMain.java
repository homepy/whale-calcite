package io.github.homepy.whale.calcite.tutorial;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import io.github.homepy.whale.calcite.cs.po.schema.CspPbcSchema;
import io.github.homepy.whale.calcite.tutorial.TestReadme.ResultSetFormatter;

public class PbcMain {

	public static void main(String[] args) throws SQLException, IOException {
		List<String> sqls = Arrays.asList(" select count(*) as csp_pbc_main_cnt from cspdb.csp_pbc_main ",
				" select count(*) as csp_pbc_perriside_cnt from cspdb.csp_pbc_perriside ",
				" select count(*) as csp_pbc_peroccup_cnt from cspdb.csp_pbc_peroccup ",
				" select count(*) as csp_pbc_score_cnt from cspdb.csp_pbc_score ",
				" select count(*) as csp_pbc_loanlist_cnt from cspdb.csp_pbc_loanlist ",
				" select count(*) as csp_pbc_creditlist_cnt from cspdb.csp_pbc_creditlist ",
				" select count(*) as csp_pbc_housefund_cnt from cspdb.csp_pbc_housefund ",
				" select count(*) as csp_pbc_queriedrecord_cnt from cspdb.csp_pbc_queriedrecord ",
				" select count(*) as csp_pbc_declare_cnt from cspdb.csp_pbc_declare ",
				" select count(*) as csp_pbc_queryinfo_cnt from cspdb.csp_pbc_queryinfo ",
				" select count(*) as csp_pbcnew_undestoryloancard_cnt from cspdb.csp_pbcnew_undestoryloancard ",
				" select count(*) as csp_pbcnew_latemonthquerecsum_cnt from cspdb.csp_pbcnew_latemonthquerecsum ",
				" select count(*) as csp_pbc_othercert_cnt from cspdb.csp_pbc_othercert ",
				" select count(*) as csp_pbc_prefraudcue_cnt from cspdb.csp_pbc_prefraudcue ",
				" select count(*) as csp_pbc_dissentcue_cnt from cspdb.csp_pbc_dissentcue ",
				" select count(*) as csp_pbc_mobilephone_cnt from cspdb.csp_pbc_mobilephone ",
				" select count(*) as csp_pbc_creditsumcue_cnt from cspdb.csp_pbc_creditsumcue ",
				" select count(*) as csp_pbc_recoursedsum_cnt from cspdb.csp_pbc_recoursedsum ",
				" select count(*) as csp_pbc_baddebtsum_cnt from cspdb.csp_pbc_baddebtsum ",
				" select count(*) as csp_pbc_overduesum_cnt from cspdb.csp_pbc_overduesum ",
				" select count(*) as csp_pbc_noncycloansum_cnt from cspdb.csp_pbc_noncycloansum ",
				" select count(*) as csp_pbc_cyclimitloansum_cnt from cspdb.csp_pbc_cyclimitloansum ",
				" select count(*) as csp_pbc_cycloansum_cnt from cspdb.csp_pbc_cycloansum ",
				" select count(*) as csp_pbc_loancardsum_cnt from cspdb.csp_pbc_loancardsum ",
				" select count(*) as csp_pbc_stanloancardsum_cnt from cspdb.csp_pbc_stanloancardsum ",
				" select count(*) as csp_pbc_repayrespsum_cnt from cspdb.csp_pbc_repayrespsum ",
				" select count(*) as csp_pbc_postpaysum_cnt from cspdb.csp_pbc_postpaysum ",
				" select count(*) as csp_pbc_publicinfosum_cnt from cspdb.csp_pbc_publicinfosum ",
				" select count(*) as csp_pbc_lastqueryrecord_cnt from cspdb.csp_pbc_lastqueryrecord ",
				" select count(*) as csp_pbc_queryrecordsum_cnt from cspdb.csp_pbc_queryrecordsum ",
				" select count(*) as csp_pbc_creditaccount_cnt from cspdb.csp_pbc_creditaccount ",
				" select count(*) as csp_pbc_curraccount_cnt from cspdb.csp_pbc_curraccount ",
				" select count(*) as csp_pbc_latestmonthlybehavior_cnt from cspdb.csp_pbc_latestmonthlybehavior ",
				" select count(*) as csp_pbc_latest24paystate_cnt from cspdb.csp_pbc_latest24paystate ",
				" select count(*) as csp_pbc_latest5yearbehavior_cnt from cspdb.csp_pbc_latest5yearbehavior ",
				" select count(*) as csp_pbc_specialtrade_cnt from cspdb.csp_pbc_specialtrade ",
				" select count(*) as csp_pbc_specialevent_cnt from cspdb.csp_pbc_specialevent ",
				" select count(*) as csp_pbc_largestage_cnt from cspdb.csp_pbc_largestage ",
				" select count(*) as csp_pbc_awardcredit_cnt from cspdb.csp_pbc_awardcredit ",
				" select count(*) as csp_pbc_repayresp_cnt from cspdb.csp_pbc_repayresp ",
				" select count(*) as csp_pbc_postpayment_cnt from cspdb.csp_pbc_postpayment ",
				" select count(*) as csp_pbc_taxarrear_cnt from cspdb.csp_pbc_taxarrear ",
				" select count(*) as csp_pbc_civiljudgement_cnt from cspdb.csp_pbc_civiljudgement ",
				" select count(*) as csp_pbc_forceexecution_cnt from cspdb.csp_pbc_forceexecution ",
				" select count(*) as csp_pbc_adminpunishment_cnt from cspdb.csp_pbc_adminpunishment ",
				" select count(*) as csp_pbc_salvation_cnt from cspdb.csp_pbc_salvation ",
				" select count(*) as csp_pbc_competence_cnt from cspdb.csp_pbc_competence ",
				" select count(*) as csp_pbc_adminaward_cnt from cspdb.csp_pbc_adminaward ",
				" select count(*) as csp_pbc_dissentannouncesum_cnt from cspdb.csp_pbc_dissentannouncesum ");

		String report = FileUtils.readFileToString(
				new File("/Users/hongpai/Desktop/github/whale-calcite/src/main/resources/request/pbc.json"),
				Charset.forName("UTF-8"));
		
		JSONObject root = JSON.parseObject(report);

		Properties info = new Properties();
		info.setProperty("lex", "MYSQL");
		Connection connection = DriverManager.getConnection("jdbc:calcite:", info);
		CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
		final SchemaPlus rootSchema = calciteConnection.getRootSchema();

		CspPbcSchema cspdb = new CspPbcSchema(root);

		rootSchema.add("cspdb", new ReflectiveSchema(cspdb));
		Statement statement = calciteConnection.createStatement();
		for (int i = 0; i < sqls.size(); i++) {
			long start = System.currentTimeMillis();
			String sql = sqls.get(i);
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.print("i=" + i + "; " + new ResultSetFormatter().resultSet(resultSet).string());
			resultSet.close();
			System.out.println(String.format("cost[%s]=%s",i, (System.currentTimeMillis() - start)));
		}
		statement.close();
		connection.close();
	}

	public static void main1(String[] args) throws SQLException, IOException {
		String report = FileUtils.readFileToString(new File("/Users/hongpai/Desktop/github/whale-calcite/src/main/resources/request/pbc.json"), Charset.forName("UTF-8"));
		
		JSONObject root = JSON.parseObject(report);
		JSONArray segments = root.getJSONArray("SEGMENT");
		
		for (int i=0; i< segments.size(); i++) {
			JSONObject segment = segments.getJSONObject(i);
			String id = Objects.toString(segment.get("ID"));
			Object name = segment.get("NAME");
			Object item = segment.get("ITEM");
			System.out.println(String.format("id =%s; name =%s; item =%s; ", id, name, item.getClass()));
			
		}
		
	}
	
	/**
	 * 
id =CSP_PBC_MAIN; name =基本信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_SCORE; name =评分信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_PERRISIDE; name =居住信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_PEROCCUP; name =职业信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LOANLIST; name =贷款明细信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_CREDITLIST; name =信用卡明细信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_HOUSEFUND; name =住房公积金信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_QUERIEDRECORD; name =查询记录信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_DECLARE; name =标注声明信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_QUERYINFO; name =查询请求信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_DISSENTCUE; name =异议提示信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_MOBILEPHONE; name =手机号码信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_CREDITSUMCUE; name =信贷汇总提示信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_RECOURSEDSUM; name =被追偿汇总信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_BADDEBTSUM; name =呆账汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_OVERDUESUM; name =逾期（透支）汇总信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_NONCYCLOANSUM; name =非循环贷账户汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_CYCLIMITLOANSUM; name =循环额度下分账户汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_CYCLOANSUM; name =循环贷账户汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_LOANCARDSUM; name =贷记卡账户汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_STANLOANCARDSUM; name =准贷记卡账户汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_REPAYRESPSUM; name =相关还款责任汇总信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_POSTPAYSUM; name =后付费业务欠费汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_PUBLICINFOSUM; name =公共信息概要信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LASTQUERYRECORD; name =上一次查询记录信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_QUERYRECORDSUM; name =查询记录汇总信息; item =class com.alibaba.fastjson.JSONObject; 
id =CSP_PBC_CREDITACCOUNT; name =借贷账户基本信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_CURRACCOUNT; name =最新表现信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LATESTMONTHLYBEHAVIOR; name =最近一次月度表现信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LATEST24PAYSTATE; name =最近24个月还款状态; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LATEST5YEARBEHAVIOR; name =最近5年历史表现信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_SPECIALTRADE; name =特殊交易信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_SPECIALEVENT; name =特殊事件说明信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_LARGESTAGE; name =大额专项分期信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_AWARDCREDIT; name =授信协议基本信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_REPAYRESP; name =相关还款责任信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_POSTPAYMENT; name =后付费业务信息; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_TAXARREAR; name =欠税记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_CIVILJUDGEMENT; name =民事判决记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_FORCEEXECUTION; name =强制执行记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_ADMINPUNISHMENT; name =行政处罚记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_SALVATION; name =低保救助记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_COMPETENCE; name =执业资格记录; item =class com.alibaba.fastjson.JSONArray; 
id =CSP_PBC_ADMINAWARD; name =行政奖励记录; item =class com.alibaba.fastjson.JSONArray; 



	 */
	
	
}
