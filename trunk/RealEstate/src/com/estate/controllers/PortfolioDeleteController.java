package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.estate.service.impl.PortfolioServiceImpl;
import com.estate.views.PortfolioDeleteView;

public class PortfolioDeleteController {

	private PortfolioDeleteView portfolioDeleteView = null;
	private ActionListener actionListener = null;
	public PortfolioDeleteController(PortfolioDeleteView portfolioDeleteView) {
		
		this.portfolioDeleteView = portfolioDeleteView;
	}
	
	public void controller() {
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(portfolioDeleteView.getDelete())) {
					PortfolioServiceImpl portfolioServiceImpl = new PortfolioServiceImpl();
					portfolioServiceImpl.setConnection();
					int flag = portfolioServiceImpl.deletePortfolio(portfolioDeleteView.getTxtPid().getText());
					if(flag==1) {
						JOptionPane.showMessageDialog(portfolioDeleteView, "Porfolio Deleted");
					}else {
						JOptionPane.showMessageDialog(portfolioDeleteView, "Porfolio Id Not Exist");
					}	
				}
				
				if(e.getSource().equals(portfolioDeleteView.getCancel())) {
					portfolioDeleteView.setVisible(false);
				}
			}
		};
		
		portfolioDeleteView.getDelete().addActionListener(actionListener);
		portfolioDeleteView.getCancel().addActionListener(actionListener);
	}
}