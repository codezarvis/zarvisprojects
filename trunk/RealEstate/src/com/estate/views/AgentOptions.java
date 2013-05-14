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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AgentOptions extends JFrame{
	
	BufferedImage bufferedImage=null;
	Image img;
	JLabel imglbl;
	
	JButton create, view, delete, cancel;
	JLabel heading;
	JPanel btnPanel, imgPanel, mainPanel;
	public AgentOptions() throws IOException{
		setTitle(":: Agent Options ::");
		setLayout(new BorderLayout());
		
		bufferedImage = ImageIO.read(new File("src/images/option.jpg"));
		img = bufferedImage.getScaledInstance(500, 200, BufferedImage.SCALE_SMOOTH);
		Icon icon= new ImageIcon(img);
		imglbl = new JLabel(icon);
		imgPanel = new JPanel();
		imgPanel.add(imglbl);
		
		
		
		btnPanel = new JPanel();
		btnPanel.setLayout(null);
		
		create = new JButton("Create Portfolio");
		view = new JButton("View Portfolios");
		delete = new JButton("Delete Portfolio");
		cancel = new JButton("Cancel");
		
		create.setBounds(40, 30, 130, 35);
		view.setBounds(180, 30, 130, 35);
		delete.setBounds(320, 30, 130, 35);
		cancel.setBounds(180, 80, 130, 35);
		
		btnPanel.add(create);
		btnPanel.add(view);
		btnPanel.add(delete);
		btnPanel.add(cancel);
	//	btnPanel.setBackground(Color.LIGHT_GRAY);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1));
		
		mainPanel.add(imgPanel);
		mainPanel.add(btnPanel);
		
		//add(imgPanel, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		setVisible(true);
		//setSize(500,500);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JButton getCreate() {
		return create;
	}
	public JButton getView() {
		return view;
	}
	public JButton getCancel() {
		return cancel;
	}
	
	public JButton getDelete() {
		return delete;
	}
}
