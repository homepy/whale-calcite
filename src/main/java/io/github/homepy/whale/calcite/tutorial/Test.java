package io.github.homepy.whale.calcite.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.schema.SchemaPlus;

import io.github.homepy.whale.calcite.cs.po.schema.CspPbcSchema;
import io.github.homepy.whale.calcite.cs.po.schema.PbcSchema;
import io.github.homepy.whale.calcite.tutorial.TestReadme.ResultSetFormatter;

public class Test {

	public static void main(String[] args) throws SQLException {

		Properties info = new Properties();
		info.setProperty("lex", "MYSQL");
		Connection connection = DriverManager.getConnection("jdbc:calcite:", info);
		CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
		final SchemaPlus rootSchema = calciteConnection.getRootSchema();
		
		CspPbcSchema cspdb = new CspPbcSchema();
		
		rootSchema.add("cspdb", new ReflectiveSchema(cspdb));
		Statement statement = calciteConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(
				"select count(*) as cnt from cspdb.csp_pbc_main");
		System.out.println(new ResultSetFormatter().resultSet(resultSet).string());
		resultSet.close();
		statement.close();
		connection.close();

	}

}
