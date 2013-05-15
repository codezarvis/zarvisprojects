package com.estate.service.impl;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.estate.domain.Address;
import com.estate.domain.Portfolio;
import com.estate.service.ProtfolioService;

public class PortfolioServiceImpl implements ProtfolioService {

	
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private List<Portfolio> portfolioList=null;
	
	
	@Override
	public void setConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redb", "root","root");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void create(Portfolio portfolio) {
		try {
			preparedStatement = connection
					.prepareStatement("INSERT INTO portfolio VALUES(?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, portfolio.getpId());
			preparedStatement.setString(2, portfolio.getPropertyType());
			preparedStatement.setString(3, portfolio.getPropertyCategory());
			preparedStatement.setString(4, portfolio.getAreaSize());
			preparedStatement.setString(5, portfolio.getAddress().getLine1());
			preparedStatement.setString(6, portfolio.getAddress().getLine2());
			preparedStatement.setString(7, portfolio.getAddress().getLine3());
			preparedStatement.setString(8, portfolio.getAddress().getPin());
			preparedStatement.setString(9, portfolio.getAddress().getPno());
			preparedStatement.setBinaryStream(10, portfolio.getSitePic(), portfolio.getSitePic().available());
			preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int deletePortfolio(String pid) {
		int flag=-1;
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM PORTFOLIO WHERE PID = ?");
			preparedStatement.setString(1, pid);
			flag = preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	@Override
	public List<Portfolio> getAllPrortfolios() {
		portfolioList = new ArrayList<Portfolio>();
		
		try {
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM PORTFOLIO ORDER BY PID");
			
			while(resultSet.next()) {
				String pid = resultSet.getString(1);
				String ptype = resultSet.getString(2);
				String pcategory = resultSet.getString(3);
				String size = resultSet.getString(4);
				String line1 = resultSet.getString(5);
				String line2 = resultSet.getString(6);
				String line3 = resultSet.getString(7);
				String pin = resultSet.getString(8);
				String pno = resultSet.getString(9);
				InputStream inputStream = resultSet.getBinaryStream(10);
				
				Address address = new Address();
				address.setLine1(line1);
				address.setLine2(line2);
				address.setLine3(line3);
				address.setPin(pin);
				address.setPno(pno);
				
				Portfolio portfolio = new Portfolio();
				portfolio.setpId(pid);
				portfolio.setPropertyType(ptype);
				portfolio.setPropertyCategory(pcategory);
				portfolio.setAreaSize(size);
				portfolio.setAddress(address);
				portfolio.setSitePic(inputStream);
				portfolioList.add(portfolio);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return portfolioList;
	}

	@Override
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
