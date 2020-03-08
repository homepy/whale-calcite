package io.github.homepy.whale.calcite.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.adapter.jdbc.JdbcConvention;
import org.apache.calcite.adapter.jdbc.JdbcSchema;
import org.apache.calcite.avatica.AvaticaStatement;
import org.apache.calcite.avatica.Handler;
import org.apache.calcite.avatica.HandlerImpl;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelOptTable;
import org.apache.calcite.prepare.Prepare;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.core.TableModify;
import org.apache.calcite.rel.logical.LogicalTableModify;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.runtime.FlatLists;
import org.apache.calcite.runtime.SqlFunctions;
import org.apache.calcite.schema.ModifiableTable;
import org.apache.calcite.schema.ModifiableView;
import org.apache.calcite.schema.Schema;
import org.apache.calcite.schema.SchemaFactory;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.impl.AbstractTable;
import org.apache.calcite.sql.SqlDialect;
import org.apache.calcite.util.TryThreadLocal;

import com.google.common.collect.ImmutableList;

public class TestReadme {
	/**
	 * The example in the README.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Properties info = new Properties();
		info.setProperty("lex", "JAVA");
		Connection connection = DriverManager.getConnection("jdbc:calcite:", info);
		CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
		final SchemaPlus rootSchema = calciteConnection.getRootSchema();
		rootSchema.add("hr", new ReflectiveSchema(new HrSchema()));
		Statement statement = calciteConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(
				"select d.deptno, min(e.empid) from hr.emps as e join hr.depts as d on e.deptno = d.deptno group by d.deptno having count(*) > 1");
		System.out.println(new ResultSetFormatter().resultSet(resultSet).string());
		resultSet.close();
		statement.close();
		connection.close();
	}

	// Disable checkstyle, so it doesn't complain about fields like "customer_id".
	// CHECKSTYLE: OFF

	/**
	 * A schema that contains two tables by reflection.
	 *
	 * <p>
	 * Here is the SQL to create equivalent tables in Oracle:
	 *
	 * <blockquote>
	 * 
	 * <pre>
	 * CREATE TABLE "emps" (
	 *   "empid" INTEGER NOT NULL,
	 *   "deptno" INTEGER NOT NULL,
	 *   "name" VARCHAR2(10) NOT NULL,
	 *   "salary" NUMBER(6, 2) NOT NULL,
	 *   "commission" INTEGER);
	 * INSERT INTO "emps" VALUES (100, 10, 'Bill', 10000, 1000);
	 * INSERT INTO "emps" VALUES (200, 20, 'Eric', 8000, 500);
	 * INSERT INTO "emps" VALUES (150, 10, 'Sebastian', 7000, null);
	 * INSERT INTO "emps" VALUES (110, 10, 'Theodore', 11500, 250);
	 *
	 * CREATE TABLE "depts" (
	 *   "deptno" INTEGER NOT NULL,
	 *   "name" VARCHAR2(10) NOT NULL,
	 *   "employees" ARRAY OF "Employee",
	 *   "location" "Location");
	 * INSERT INTO "depts" VALUES (10, 'Sales', null, (-122, 38));
	 * INSERT INTO "depts" VALUES (30, 'Marketing', null, (0, 52));
	 * INSERT INTO "depts" VALUES (40, 'HR', null, null);
	 * </pre>
	 * 
	 * </blockquote>
	 */
	public static class HrSchema {
		@Override
		public String toString() {
			return "HrSchema";
		}

		public final Employee[] emps = { new Employee(100, 10, "Bill", 10000, 1000),
				new Employee(200, 20, "Eric", 8000, 500), new Employee(150, 10, "Sebastian", 7000, null),
				new Employee(110, 10, "Theodore", 11500, 250), };
		public final Department[] depts = {
				new Department(10, "Sales", Arrays.asList(emps[0], emps[2]), new Location(-122, 38)),
				new Department(30, "Marketing", ImmutableList.of(), new Location(0, 52)),
				new Department(40, "HR", Collections.singletonList(emps[1]), null), };
		public final Dependent[] dependents = { new Dependent(10, "Michael"), new Dependent(10, "Jane"), };
		public final Dependent[] locations = { new Dependent(10, "San Francisco"), new Dependent(20, "San Diego"), };

//	    public QueryableTable foo(int count) {
//	      return Smalls.generateStrings(count);
//	    }
//
//	    public TranslatableTable view(String s) {
//	      return Smalls.view(s);
//	    }
	}

	public static class HrSchemaBig {
		@Override
		public String toString() {
			return "HrSchema";
		}

		public final Employee[] emps = { new Employee(1, 10, "Bill", 10000, 1000),
				new Employee(2, 20, "Eric", 8000, 500), new Employee(3, 10, "Sebastian", 7000, null),
				new Employee(4, 10, "Theodore", 11500, 250), new Employee(5, 10, "Marjorie", 10000, 1000),
				new Employee(6, 20, "Guy", 8000, 500), new Employee(7, 10, "Dieudonne", 7000, null),
				new Employee(8, 10, "Haroun", 11500, 250), new Employee(9, 10, "Sarah", 10000, 1000),
				new Employee(10, 20, "Gabriel", 8000, 500), new Employee(11, 10, "Pierre", 7000, null),
				new Employee(12, 10, "Paul", 11500, 250), new Employee(13, 10, "Jacques", 100, 1000),
				new Employee(14, 20, "Khawla", 8000, 500), new Employee(15, 10, "Brielle", 7000, null),
				new Employee(16, 10, "Hyuna", 11500, 250), new Employee(17, 10, "Ahmed", 10000, 1000),
				new Employee(18, 20, "Lara", 8000, 500), new Employee(19, 10, "Capucine", 7000, null),
				new Employee(20, 10, "Michelle", 11500, 250), new Employee(21, 10, "Cerise", 10000, 1000),
				new Employee(22, 80, "Travis", 8000, 500), new Employee(23, 10, "Taylor", 7000, null),
				new Employee(24, 10, "Seohyun", 11500, 250), new Employee(25, 70, "Helen", 10000, 1000),
				new Employee(26, 50, "Patric", 8000, 500), new Employee(27, 10, "Clara", 7000, null),
				new Employee(28, 10, "Catherine", 11500, 250), new Employee(29, 10, "Anibal", 10000, 1000),
				new Employee(30, 30, "Ursula", 8000, 500), new Employee(31, 10, "Arturito", 7000, null),
				new Employee(32, 70, "Diane", 11500, 250), new Employee(33, 10, "Phoebe", 10000, 1000),
				new Employee(34, 20, "Maria", 8000, 500), new Employee(35, 10, "Edouard", 7000, null),
				new Employee(36, 110, "Isabelle", 11500, 250), new Employee(37, 120, "Olivier", 10000, 1000),
				new Employee(38, 20, "Yann", 8000, 500), new Employee(39, 60, "Ralf", 7000, null),
				new Employee(40, 60, "Emmanuel", 11500, 250), new Employee(41, 10, "Berenice", 10000, 1000),
				new Employee(42, 20, "Kylie", 8000, 500), new Employee(43, 80, "Natacha", 7000, null),
				new Employee(44, 100, "Henri", 11500, 250), new Employee(45, 90, "Pascal", 10000, 1000),
				new Employee(46, 90, "Sabrina", 8000, 500), new Employee(47, 8, "Riyad", 7000, null),
				new Employee(48, 5, "Andy", 11500, 250), };
		public final Department[] depts = {
				new Department(10, "Sales", Arrays.asList(emps[0], emps[2]), new Location(-122, 38)),
				new Department(20, "Marketing", ImmutableList.of(), new Location(0, 52)),
				new Department(30, "HR", Collections.singletonList(emps[1]), null),
				new Department(40, "Administration", Arrays.asList(emps[0], emps[2]), new Location(-122, 38)),
				new Department(50, "Design", ImmutableList.of(), new Location(0, 52)),
				new Department(60, "IT", Collections.singletonList(emps[1]), null),
				new Department(70, "Production", Arrays.asList(emps[0], emps[2]), new Location(-122, 38)),
				new Department(80, "Finance", ImmutableList.of(), new Location(0, 52)),
				new Department(90, "Accounting", Collections.singletonList(emps[1]), null),
				new Department(100, "Research", Arrays.asList(emps[0], emps[2]), new Location(-122, 38)),
				new Department(110, "Maintenance", ImmutableList.of(), new Location(0, 52)),
				new Department(120, "Client Support", Collections.singletonList(emps[1]), null), };
	}

	public static class Employee {
		public final int empid;
		public final int deptno;
		public final String name;
		public final float salary;
		public final Integer commission;

		public Employee(int empid, int deptno, String name, float salary, Integer commission) {
			this.empid = empid;
			this.deptno = deptno;
			this.name = name;
			this.salary = salary;
			this.commission = commission;
		}

		@Override
		public String toString() {
			return "Employee [empid: " + empid + ", deptno: " + deptno + ", name: " + name + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Employee && empid == ((Employee) obj).empid;
		}
	}

	public static class Department {
		public final int deptno;
		public final String name;

		@org.apache.calcite.adapter.java.Array(component = Employee.class)
		public final List<Employee> employees;
		public final Location location;

		public Department(int deptno, String name, List<Employee> employees, Location location) {
			this.deptno = deptno;
			this.name = name;
			this.employees = employees;
			this.location = location;
		}

		@Override
		public String toString() {
			return "Department [deptno: " + deptno + ", name: " + name + ", employees: " + employees + ", location: "
					+ location + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Department && deptno == ((Department) obj).deptno;
		}
	}

	public static class Location {
		public final int x;
		public final int y;

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Location [x: " + x + ", y: " + y + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Location && x == ((Location) obj).x && y == ((Location) obj).y;
		}
	}

	public static class Dependent {
		public final int empid;
		public final String name;

		public Dependent(int empid, String name) {
			this.empid = empid;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Dependent [empid: " + empid + ", name: " + name + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Dependent && empid == ((Dependent) obj).empid
					&& Objects.equals(name, ((Dependent) obj).name);
		}
	}

	public static class Event {
		public final int eventid;
		public final Timestamp ts;

		public Event(int eventid, Timestamp ts) {
			this.eventid = eventid;
			this.ts = ts;
		}

		@Override
		public String toString() {
			return "Event [eventid: " + eventid + ", ts: " + ts + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Event && eventid == ((Event) obj).eventid;
		}
	}

	public static class FoodmartSchema {
		public final SalesFact[] sales_fact_1997 = { new SalesFact(100, 10), new SalesFact(150, 20), };
	}

	public static class LingualSchema {
		public final LingualEmp[] EMPS = { new LingualEmp(1, 10), new LingualEmp(2, 30) };
	}

	public static class LingualEmp {
		public final int EMPNO;
		public final int DEPTNO;

		public LingualEmp(int EMPNO, int DEPTNO) {
			this.EMPNO = EMPNO;
			this.DEPTNO = DEPTNO;
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof LingualEmp && EMPNO == ((LingualEmp) obj).EMPNO;
		}
	}

	public static class FoodmartJdbcSchema extends JdbcSchema {
		public FoodmartJdbcSchema(DataSource dataSource, SqlDialect dialect, JdbcConvention convention, String catalog,
				String schema) {
			super(dataSource, dialect, convention, catalog, schema);
		}

		public final Table customer = getTable("customer");
	}

	public static class Customer {
		public final int customer_id;

		public Customer(int customer_id) {
			this.customer_id = customer_id;
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof Customer && customer_id == ((Customer) obj).customer_id;
		}
	}

	public static class SalesFact {
		public final int cust_id;
		public final int prod_id;

		public SalesFact(int cust_id, int prod_id) {
			this.cust_id = cust_id;
			this.prod_id = prod_id;
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj instanceof SalesFact && cust_id == ((SalesFact) obj).cust_id
					&& prod_id == ((SalesFact) obj).prod_id;
		}
	}

	// CHECKSTYLE: ON

	/** Abstract base class for implementations of {@link ModifiableTable}. */
	public abstract static class AbstractModifiableTable extends AbstractTable implements ModifiableTable {
		protected AbstractModifiableTable(String tableName) {
			super();
		}

		public TableModify toModificationRel(RelOptCluster cluster, RelOptTable table,
				Prepare.CatalogReader catalogReader, RelNode child, TableModify.Operation operation,
				List<String> updateColumnList, List<RexNode> sourceExpressionList, boolean flattened) {
			return LogicalTableModify.create(table, catalogReader, child, operation, updateColumnList,
					sourceExpressionList, flattened);
		}
	}

	/** Abstract base class for implementations of {@link ModifiableView}. */
	public abstract static class AbstractModifiableView extends AbstractTable implements ModifiableView {
		protected AbstractModifiableView() {
			super();
		}
	}

	/** Schema factory that creates {@link MySchema} objects. */
	public static class MySchemaFactory implements SchemaFactory {
		public Schema create(SchemaPlus parentSchema, String name, final Map<String, Object> operand) {
			final boolean mutable = SqlFunctions.isNotFalse((Boolean) operand.get("mutable"));
			return new ReflectiveSchema(new HrSchema()) {
				@Override
				protected Map<String, Table> getTableMap() {
					// Mine the EMPS table and add it under another name e.g. ELVIS
					final Map<String, Table> tableMap = super.getTableMap();
					final Table table = tableMap.get("emps");
					final String tableName = (String) operand.get("tableName");
					return FlatLists.append(tableMap, tableName, table);
				}

				@Override
				public boolean isMutable() {
					return mutable;
				}
			};
		}
	}

	/**
	 * Mock driver that has a handler that stores the results of each query in a
	 * temporary table.
	 */
	public static class AutoTempDriver extends org.apache.calcite.jdbc.Driver {
		private final List<Object> results;

		AutoTempDriver(List<Object> results) {
			super();
			this.results = results;
		}

		@Override
		protected Handler createHandler() {
			return new HandlerImpl() {
				@Override
				public void onStatementExecute(AvaticaStatement statement, ResultSink resultSink) {
					super.onStatementExecute(statement, resultSink);
					results.add(resultSink);
				}
			};
		}
	}

	/** Mock driver that a given {@link Handler}. */
	public static class HandlerDriver extends org.apache.calcite.jdbc.Driver {
		private static final TryThreadLocal<Handler> HANDLERS = TryThreadLocal.of(null);

		public HandlerDriver() {
		}

		@Override
		protected Handler createHandler() {
			return HANDLERS.get();
		}
	}

	/** Mock driver that can execute a trivial DDL statement. */
	public static class MockDdlDriver extends org.apache.calcite.jdbc.Driver {
	}

	/** Dummy table. */
	public static class MyTable {
		public String mykey = "foo";
		public Integer myvalue = 1;
	}

	/** Another dummy table. */
	public static class MyTable2 {
		public String mykey = "foo";
		public Integer myvalue = 2;
	}

	/** Schema containing dummy tables. */
	public static class MySchema {
		public MyTable[] mytable = { new MyTable() };
		public MyTable2[] mytable2 = { new MyTable2() };
	}

	/**
	 * Locales for which to test DAYNAME and MONTHNAME functions, and expected
	 * results of those functions.
	 */

	/** Converts a {@link ResultSet} to string. */
	static class ResultSetFormatter {
		final StringBuilder buf = new StringBuilder();

		public ResultSetFormatter resultSet(ResultSet resultSet) throws SQLException {
			final ResultSetMetaData metaData = resultSet.getMetaData();
			while (resultSet.next()) {
				rowToString(resultSet, metaData);
				buf.append("\n");
			}
			return this;
		}

		/** Converts one row to a string. */
		ResultSetFormatter rowToString(ResultSet resultSet, ResultSetMetaData metaData) throws SQLException {
			int n = metaData.getColumnCount();
			if (n > 0) {
				for (int i = 1;; i++) {
					buf.append(metaData.getColumnLabel(i)).append("=").append(adjustValue(resultSet.getString(i)));
					if (i == n) {
						break;
					}
					buf.append("; ");
				}
			}
			return this;
		}

		protected String adjustValue(String string) {
			return string;
		}

		public Collection<String> toStringList(ResultSet resultSet, Collection<String> list) throws SQLException {
			final ResultSetMetaData metaData = resultSet.getMetaData();
			while (resultSet.next()) {
				rowToString(resultSet, metaData);
				list.add(buf.toString());
				buf.setLength(0);
			}
			return list;
		}

		/** Flushes the buffer and returns its previous contents. */
		public String string() {
			String s = buf.toString();
			buf.setLength(0);
			return s;
		}
	}
}
