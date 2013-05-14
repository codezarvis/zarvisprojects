package com.estate.service;

import java.util.List;

import com.estate.domain.Portfolio;

public interface ProtfolioService {

	void setConnection();

	void create(Portfolio portfolio);
	
	int deletePortfolio(String pid);

	List<Portfolio> getAllPrortfolios();

	void close();

}