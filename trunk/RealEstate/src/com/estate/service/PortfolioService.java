package com.estate.service;

import java.util.List;

import com.estate.domain.Portfolio;

public interface PortfolioService {
	
	void create(Portfolio portfolio);
	
	List<Portfolio> getAll();
	

}
