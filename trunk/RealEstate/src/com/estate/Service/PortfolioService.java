package com.estate.Service;

import java.util.List;

import com.estate.domain.Portfolio;

public interface PortfolioService {
	
	void create(Portfolio portfolio);
	
	List<Portfolio> getAll();
	

}
