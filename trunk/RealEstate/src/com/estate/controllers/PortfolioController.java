package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.estate.domain.Address;
import com.estate.domain.Portfolio;
import com.estate.serviceImpl.PortfolioServiceImpl;
import com.estate.serviceImpl.SendMessage;
import com.estate.views.PortfolioRegister;


public class PortfolioController {
	PortfolioRegister portfolioRegister;
	PortfolioServiceImpl portfolioServiceImpl;
	Portfolio portfolio;
	Address address;
	ActionListener actionListener;
	ItemListener itemListener;
	File file;
	
	
	public PortfolioController(PortfolioRegister portfolioRegister) {
		this.portfolioRegister = portfolioRegister;
	}
	
	public void controller() {
		
		actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(portfolioRegister.getSubmit())) {
					try {
						
						address = new Address();
						address.setLine1(portfolioRegister.getTxtLine1().getText());
						address.setLine2(portfolioRegister.getTxtLine2().getText());
						address.setLine3(portfolioRegister.getTxtLine3().getText());
						address.setPin(portfolioRegister.getTxtPin().getText());
						address.setPno(portfolioRegister.getTxtPno().getText());
						
						portfolio = new Portfolio();
						portfolio.setpId(portfolioRegister.getTxtPid().getText());
						portfolio.setPropertyType((String)portfolioRegister.getPType().getSelectedItem());
						portfolio.setPropertyCategory((String)portfolioRegister.getPCategory().getSelectedItem());
						portfolio.setAreaSize(portfolioRegister.getTxtSize().getText());
						portfolio.setAddress(address);
						
						
						InputStream inputStream = new FileInputStream(file);
						portfolio.setSitePic(inputStream);
						
						portfolioServiceImpl = new PortfolioServiceImpl();
						portfolioServiceImpl.setConnection();
						portfolioServiceImpl.create(portfolio);
						portfolioServiceImpl.close();
						
						JOptionPane.showMessageDialog(portfolioRegister, "Portfolio Created");
						
						SendMessage sendMessage = new SendMessage(address.getPno(), portfolio.getpId());

					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
				}
				if (e.getSource().equals(portfolioRegister.getReset())) {
					portfolioRegister.getTxtPid().setText("");
					portfolioRegister.getPType().setSelectedIndex(0);
					portfolioRegister.getPCategory().setSelectedIndex(0);
					portfolioRegister.getTxtSize().setText("");
					portfolioRegister.getTxtLine1().setText("");
					portfolioRegister.getTxtLine2().setText("");
					portfolioRegister.getTxtLine3().setText("");
					portfolioRegister.getTxtPin().setText("");
					portfolioRegister.getTxtPno().setText("");
					portfolioRegister.getTxtFile().setText("");
					portfolioRegister.getTxtPid().requestFocus();
				}
				
							
				if(e.getSource().equals(portfolioRegister.getBrowse())) {
					JFileChooser jfs = new JFileChooser();
					jfs.showOpenDialog(portfolioRegister);
					file = jfs.getSelectedFile();
					
					portfolioRegister.getTxtFile().setText(file.getPath());
				}
				
				if(e.getSource().equals(portfolioRegister.getCancel())) {
					portfolioRegister.setVisible(false);
				}
			}	
		};
		
		
		portfolioRegister.getBrowse().addActionListener(actionListener);
		portfolioRegister.getSubmit().addActionListener(actionListener);
		portfolioRegister.getReset().addActionListener(actionListener);
		portfolioRegister.getCancel().addActionListener(actionListener);
		
	}	
}
