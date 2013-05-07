package com.tests;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetadataExample {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbctest", "root", "root");

			DatabaseMetaData metaData = connection.getMetaData();

			System.out.println("Vendor Name : "
					+ metaData.getDatabaseProductName());
			System.out.println("Version of the DB : "
					+ metaData.getDatabaseProductVersion());

			System.out.println("User Name :" + metaData.getUserName());
			System.out.println("URL :" + metaData.getURL());

			System.out.println("SQL KEY WORDS : ");
			System.out.println("===============================");
			System.out.println(metaData.getSQLKeywords());

			resultSet = metaData.getCatalogs();

			System.out.println("======================================");

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}

			System.out.println("======================================");
			ResultSet resultSet2 = metaData.getPrimaryKeys("dbtest", "dbtest",
					"dept");

			while (resultSet2.next()) {
				System.out.println(resultSet2.getString(1) + "\t"
						+ resultSet2.getString(2) + "\t"
						+ resultSet2.getString(3) + "\t"
						+ resultSet2.getString(4) + "\t"
						+ resultSet2.getString(5) + "\t"
						+ resultSet2.getString(6) + "\t");
			}

			System.out.println("================================");

			// ResultSet resultSet3 = metaData.getTableTypes();
			//
			//
			// while(resultSet3.next()) {
			// System.out.println(resultSet3.getString(1));
			// }

			ResultSet resultSet3 = metaData.getTables("dbtest", null, "",
					new String[] { "TABLE" });

			while (resultSet3.next()) {
				System.out.println(resultSet3.getString(1) + "\t"
						+ resultSet3.getString(2) + "\t"
						+ resultSet3.getString(3)+"\t"+resultSet3.getString(4));
			}

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
