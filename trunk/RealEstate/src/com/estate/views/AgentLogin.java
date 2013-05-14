package com.estate.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgentLogin extends JFrame{
	BufferedImage bufferedImage=null;
	Image img;
	JLabel imglbl;
	
	JPanel imgPanel, logPanel;
	
	JLabel lbllogin, lblid, lblpassword;
	JTextField txtid, txtpassword;
	JButton login, reset;
	
	Font font;
	
	public AgentLogin() throws IOException {
		bufferedImage = ImageIO.read(new File("src/images/login.jpg"));
		img = bufferedImage.getScaledInstance(500, 200, BufferedImage.SCALE_SMOOTH);
		Icon icon= new ImageIcon(img);
		imglbl = new JLabel(icon);
		imgPanel = new JPanel();
		imgPanel.add(imglbl);
		
		font = new Font("Times new roman", Font.BOLD, 20); 
		
		logPanel = new JPanel();
		logPanel.setLayout(null);
		
		lblid = new JLabel("Agent Id");
		lblpassword = new JLabel("Password");
		lbllogin = new JLabel("Login Hear");
		lbllogin.setFont(font);
		lbllogin.setForeground(Color.MAGENTA);
		
		txtid = new JTextField(20);
		txtpassword = new JTextField(20);
		
		login = new JButton("Login");
		reset = new JButton("Reset");
		
		lbllogin.setBounds(190, 10, 100, 35);
		lblid.setBounds(100, 60, 100, 35);
		txtid.setBounds(250, 60, 120, 35);
		
		lblpassword.setBounds(100, 120, 100, 35);
		txtpassword.setBounds(250, 120, 120, 35);
		
		login.setBounds(120, 180, 80, 35);
		reset.setBounds(250, 180, 80, 35);
		
		logPanel.add(lbllogin);
		logPanel.add(lblid);
		logPanel.add(txtid);
		logPanel.add(lblpassword);
		logPanel.add(txtpassword);
		logPanel.add(login);
		logPanel.add(reset);
		
		add(imgPanel, BorderLayout.NORTH);
		add(logPanel, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getTxtid() {
		return txtid;
	}

	public JTextField getTxtpassword() {
		return txtpassword;
	}

	public JButton getLogin() {
		return login;
	}

	public JButton getReset() {
		return reset;
	}
}
