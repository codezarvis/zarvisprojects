package com.estate.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class AgentRegistration extends JFrame {

	JLabel personallbl, imglbl;

	JPanel detailsPanel, imgPanel, dPanel, btnPanel;

	JTextField txtAId, txtAPassword1, txtAPassword2;

	JTextField txtAName, txtAddress1, txtAddress2, txtAddress3,
			txtContactNumber;

	JButton register, reset;

	Font hfont;

	BufferedImage bufferedImage = null;
	Image img = null;

	public AgentRegistration() throws IOException {
		
		setLayout(new BorderLayout());
		hfont = new Font("Times new Roman", Font.BOLD, 20);

		bufferedImage = ImageIO.read(new File("src/images/head.jpg"));
		img = bufferedImage.getScaledInstance(500, 250, BufferedImage.SCALE_SMOOTH);
		Icon icon= new ImageIcon(img);
		imglbl = new JLabel(icon);
		
		imgPanel = new JPanel();
		imgPanel.add(imglbl);
		
		detailsPanel = new JPanel();
		detailsPanel.setLayout(new GridLayout(11,2,4,4));
		
		
		personallbl = new JLabel("Personal Details");
		personallbl.setForeground(Color.gray);
		
		txtAId = new JTextField(20);
		txtAPassword1 = new JTextField(20);
		txtAPassword2 = new JTextField(20);
		txtAName = new JTextField(20);
		txtAddress1 = new JTextField(20);
		txtAddress2 = new JTextField(20);
		txtAddress3 = new JTextField(20);
		txtContactNumber = new JTextField(20);
		
		detailsPanel.add(new JLabel());
		detailsPanel.add(new JLabel());
		detailsPanel.add(new JLabel("Agent ID"));
		detailsPanel.add(txtAId);
		detailsPanel.add(new JLabel("Password"));
		detailsPanel.add(txtAPassword1);
		detailsPanel.add(new JLabel("Re-Enter Password"));
		detailsPanel.add(txtAPassword2);
		detailsPanel.add(new JLabel());
		detailsPanel.add(new JLabel());
		detailsPanel.add(personallbl);
		detailsPanel.add(new JLabel());
		detailsPanel.add(new JLabel("Agent Name"));
		detailsPanel.add(txtAName);
		detailsPanel.add(new JLabel("Address Line1 "));
		detailsPanel.add(txtAddress1);
		detailsPanel.add(new JLabel("Address Line2 "));
		detailsPanel.add(txtAddress2);
		detailsPanel.add(new JLabel("Address Line3 "));
		detailsPanel.add(txtAddress3);
		detailsPanel.add(new JLabel("Contact Number"));
		detailsPanel.add(txtContactNumber);
		
		detailsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Agent Registration Form",TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		
		dPanel = new JPanel();
		dPanel.setLayout(new FlowLayout());
		dPanel.add(detailsPanel);
		
		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		register = new JButton("Register");
		reset = new JButton("Reset");
		btnPanel.add(register);
		btnPanel.add(reset);
		
		add(imgPanel, BorderLayout.NORTH);
		add(dPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public JTextField getTxtAId() {
		return txtAId;
	}

	public JTextField getTxtAPassword1() {
		return txtAPassword1;
	}

	public JTextField getTxtAPassword2() {
		return txtAPassword2;
	}

	public JTextField getTxtAName() {
		return txtAName;
	}

	public JTextField getTxtAddress1() {
		return txtAddress1;
	}

	public JTextField getTxtAddress2() {
		return txtAddress2;
	}

	public JTextField getTxtAddress3() {
		return txtAddress3;
	}

	public JTextField getTxtContactNumber() {
		return txtContactNumber;
	}

	public JButton getRegister() {
		return register;
	}

	public JButton getReset() {
		return reset;
	}
}
