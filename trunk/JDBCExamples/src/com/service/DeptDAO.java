package com.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.model.Dept;

public class DeptDAO {

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private InputStream inputStream = null;
	private Properties properties = null;
	private String driverName = null;
	private String url = null;

	public DeptDAO() throws FileNotFoundException, IOException {
		inputStream = new FileInputStream(new File("jdbc.properties"));
		properties = new Properties();
		properties.load(inputStream);
		this.driverName = properties.getProperty("driver");
		this.url = properties.getProperty("url");
		inputStream.close();
	}

	public void connect() throws ClassNotFoundException, SQLException {

		Class.forName(driverName);
		connection = DriverManager.getConnection(url);
	}

	public List<Dept> getAll() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM DEPT");

		List<Dept> deptList = new ArrayList<Dept>();
		while (resultSet.next()) {
			int deptno = resultSet.getInt(1);
			String dname = resultSet.getString(2);
			String loc = resultSet.getString(3);
			double distance = resultSet.getDouble(4);

			Dept dept = new Dept();
			dept.setDeptno(deptno);
			dept.setDname(dname);
			dept.setLoc(loc);
			dept.setDistance(distance);

			deptList.add(dept);
		}

		return deptList;

	}

	public int update(Dept dept) throws SQLException {
		preparedStatement = connection
				.prepareStatement("UPDATE DEPT SET DEPTNAME=?, LOC=?, DISTANCE=? WHERE DEPTNO=?");
		preparedStatement.setString(1, dept.getDname());
		preparedStatement.setString(2, dept.getLoc());
		preparedStatement.setDouble(3, dept.getDistance());
		preparedStatement.setInt(4, dept.getDeptno());

		return preparedStatement.executeUpdate();

	}

	public int delete(int deptno) throws SQLException {
		preparedStatement = connection
				.prepareStatement("DELETE FROM DEPT WHERE DEPTNO = ?");
		preparedStatement.setInt(1, deptno);
		return preparedStatement.executeUpdate();

	}

	public void create(Dept dept) throws SQLException {
		preparedStatement = connection
				.prepareStatement("INSERT INTO DEPT VALUES(?,?,?,?)");
		preparedStatement.setInt(1, dept.getDeptno());
		preparedStatement.setString(2, dept.getDname());
		preparedStatement.setString(3, dept.getLoc());
		preparedStatement.setDouble(4, dept.getDistance());
		preparedStatement.executeUpdate();
	}

	public void close() throws SQLException {

		if (resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();
		}

		if (preparedStatement != null) {
			preparedStatement.close();
		}

		if (connection != null) {
			connection.close();
		}
	}
}
