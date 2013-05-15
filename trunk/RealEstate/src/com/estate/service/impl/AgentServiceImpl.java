package com.estate.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.estate.domain.Agent;



public class AgentServiceImpl {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	
	public void setConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redb", "root","root");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int create(Agent agent) {
		int flag=0;
		try {
			preparedStatement = connection
					.prepareStatement("INSERT INTO agent VALUES(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, agent.getAid());
			preparedStatement.setString(2, agent.getPassword1());
			preparedStatement.setString(3, agent.getAname());
			preparedStatement.setString(4, agent.getAddress1());
			preparedStatement.setString(5, agent.getAddress2());
			preparedStatement.setString(6, agent.getAddress3());
			preparedStatement.setString(7, agent.getPno());
			flag = preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public int authenticate(String aid, String password) throws SQLException {
		int flag=0;
		
		preparedStatement = connection.prepareStatement("SELECT * FROM AGENT WHERE AID = ? AND PASSWORD = ?");
		preparedStatement.setString(1, aid);
		preparedStatement.setString(2, password);
		
		resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			
			flag = 1;
		}
		return flag;
		
	}
	
	public void close() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
