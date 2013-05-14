package com.estate.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.estate.domain.Agent;
import com.estate.serviceImpl.AgentServiceImpl;
import com.estate.views.AgentLogin;
import com.estate.views.AgentRegistration;



public class AgentController {

	private ActionListener actionListener = null;
	private AgentRegistration agentRegistration=null;
	private Agent agent=null;
	private AgentServiceImpl agentServiceImpl=null;
	
	public AgentController(AgentRegistration agentRegistration) {
		this.agentRegistration = agentRegistration;
	}
	
	public void controller() {
		
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(agentRegistration.getRegister())) {
					
					agent = new Agent();
					agent.setAid(agentRegistration.getTxtAId().getText());
					agent.setPassword1(agentRegistration.getTxtAPassword1().getText());
					agent.setPassword2(agentRegistration.getTxtAPassword2().getText());
					agent.setAname(agentRegistration.getTxtAName().getText());
					agent.setAddress1(agentRegistration.getTxtAddress1().getText());
					agent.setAddress2(agentRegistration.getTxtAddress2().getText());
					agent.setAddress3(agentRegistration.getTxtAddress3().getText());
					agent.setPno(agentRegistration.getTxtContactNumber().getText());
					
					if((agent.getPassword1()).equals(agent.getPassword2())&&(agent.getAid()!=null)) {
						agentServiceImpl = new AgentServiceImpl();
						agentServiceImpl.setConnection();
						agentServiceImpl.create(agent);
						agentServiceImpl.close();
						JOptionPane.showMessageDialog(agentRegistration, "Agent Created");

					}else {
						JOptionPane.showMessageDialog(agentRegistration, "AgentId must give/Password Misspatch/");
					}
				}
				
				if(e.getSource().equals(agentRegistration.getReset())) {
					agentRegistration.getTxtAId().setText("");
					agentRegistration.getTxtAPassword1().setText("");
					agentRegistration.getTxtAPassword2().setText("");
					agentRegistration.getTxtAName().setText("");
					agentRegistration.getTxtAddress1().setText("");
					agentRegistration.getTxtAddress2().setText("");
					agentRegistration.getTxtAddress3().setText("");
					agentRegistration.getTxtContactNumber().setText("");
					agentRegistration.getTxtAId().requestFocus();
				}
			}
		};

		agentRegistration.getRegister().addActionListener(actionListener);
		agentRegistration.getReset().addActionListener(actionListener);
	}
	
	
}
