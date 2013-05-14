package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.estate.views.AllPortfoliosView;

public class APViewController {
	
	private AllPortfoliosView allPortfoliosView;
	private ActionListener actionListener;
	
	public APViewController(AllPortfoliosView allPortfoliosView) {
		this.allPortfoliosView = allPortfoliosView;
	}
	
	public void controller() {
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(allPortfoliosView.getOk())) {
					int count = allPortfoliosView.getjTable().getSelectedRow();
					if(count==-1) {
						JOptionPane.showMessageDialog(allPortfoliosView, "Please Select Row");
					}else {
						JOptionPane.showMessageDialog(allPortfoliosView, "SEE "+count+" IMAGE");
					}
						
					
					
				}
				
				if(e.getSource().equals(allPortfoliosView.getCancel())) {
					allPortfoliosView.setVisible(false);
				}
			}
		};
		
		allPortfoliosView.getOk().addActionListener(actionListener);
		allPortfoliosView.getCancel().addActionListener(actionListener);
	}

}
