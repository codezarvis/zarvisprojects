package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.estate.service.impl.AgentServiceImpl;
import com.estate.views.AgentLogin;
import com.estate.views.AgentOptions;

public class AgentLoginController {

	AgentLogin agentLogin = null;
	AgentServiceImpl agentServiceImpl = null;
	ActionListener actionListener = null;
	
	public AgentLoginController(AgentLogin agentLogin) {
		this.agentLogin = agentLogin;
	}
	
	public void controller() {
		
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(agentLogin.getLogin())) {
					
					agentServiceImpl = new AgentServiceImpl();
					agentServiceImpl.setConnection();
					int flag;
					try {
						flag = agentServiceImpl.authenticate(agentLogin.getTxtid().getText(), agentLogin.getTxtpassword().getText());
						if(flag==1) {
							agentLogin.setVisible(false);
							AgentOptions agentOptions = new AgentOptions();
							AgentOptionController agentOptionController= new AgentOptionController(agentOptions);
							agentOptionController.controller();							
							
						}else {
							JOptionPane.showMessageDialog(agentLogin, "Agent Not Exist");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				if(e.getSource().equals(agentLogin.getReset())) {
					agentLogin.getTxtid().setText("");
					agentLogin.getTxtpassword().setToolTipText("");
				}
			}
		};
		
		agentLogin.getLogin().addActionListener(actionListener);
		agentLogin.getReset().addActionListener(actionListener);
	}
}
