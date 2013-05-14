package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import com.estate.domain.Portfolio;
import com.estate.serviceImpl.PortfolioServiceImpl;
import com.estate.views.AgentOptions;
import com.estate.views.AllPortfoliosView;
import com.estate.views.PortfolioDeleteView;
import com.estate.views.PortfolioRegister;

public class AgentOptionController {

	ActionListener actionListener = null;
	AgentOptions agentOptions = null;

	public AgentOptionController(AgentOptions agentOptions) {
		this.agentOptions = agentOptions;
	}

	public void controller() {
		actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource().equals(agentOptions.getCreate())) {
					PortfolioRegister portfolioRegister;
					try {
						portfolioRegister = new PortfolioRegister();
						PortfolioController portfolioController = new PortfolioController(
								portfolioRegister);
						portfolioController.controller();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

				if (e.getSource().equals(agentOptions.getView())) {
					PortfolioServiceImpl portfolioServiceImpl = new PortfolioServiceImpl();
					portfolioServiceImpl.setConnection();

					List<Portfolio> portfoliosList = portfolioServiceImpl
							.getAllPrortfolios();
					AllPortfoliosView allPortfoliosView = new AllPortfoliosView(
							portfoliosList);
					
					APViewController apViewController= new APViewController(allPortfoliosView);
					apViewController.controller();

				}

				if (e.getSource().equals(agentOptions.getDelete())) {

					try {
						PortfolioDeleteView portfolioDeleteView = new PortfolioDeleteView();
						PortfolioDeleteController portfolioDeleteController = new PortfolioDeleteController(
								portfolioDeleteView);
						portfolioDeleteController.controller();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}

				if (e.getSource().equals(agentOptions.getCancel())) {

					agentOptions.setVisible(false);
					agentOptions.dispose();
				}
			}
		};

		agentOptions.getCreate().addActionListener(actionListener);
		agentOptions.getView().addActionListener(actionListener);
		agentOptions.getDelete().addActionListener(actionListener);
		agentOptions.getCancel().addActionListener(actionListener);
	}
}
