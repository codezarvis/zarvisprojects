package com.estate.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.estate.Service.PortfolioService;
import com.estate.domain.Portfolio;

public class PortfolioServiceImpl implements PortfolioService {

	List<Portfolio> portfolioList =  new ArrayList<Portfolio>();
	
	@Override
	public void create(Portfolio portfolio) {
		portfolioList.add(portfolio);		
		
	}

	@Override
	public List<Portfolio> getAll() {
		return portfolioList;
	}

}
