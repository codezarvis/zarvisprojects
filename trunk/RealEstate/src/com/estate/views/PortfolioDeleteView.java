package com.estate.views;

import java.awt.BorderLayout;
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

public class PortfolioDeleteView extends JFrame{

	
	BufferedImage bufferedImage=null;
	Image img;
	JLabel imglbl;
	
	JPanel deletePanel, imgPanel;
	
	JLabel lblPid;
	JTextField txtPid;
	JButton delete, cancel;
	
	Font font;
	
	public PortfolioDeleteView() throws IOException {
		bufferedImage = ImageIO.read(new File("src/images/delete.jpg"));
		img = bufferedImage.getScaledInstance(500, 200, BufferedImage.SCALE_SMOOTH);
		Icon icon= new ImageIcon(img);
		imglbl = new JLabel(icon);
		imgPanel = new JPanel();
		imgPanel.add(imglbl);
		
		font = new Font("Times new roman", Font.BOLD, 20); 
		
		
		lblPid = new JLabel("Enter PortfolioId");
		
		txtPid = new JTextField(20);
		
		delete = new JButton("Delete");
		cancel = new JButton("Cancel");
		
		lblPid.setBounds(100, 40, 100, 35);
		txtPid.setBounds(250, 40, 120, 35);
		
		
		delete.setBounds(120, 100, 80, 35);
		cancel.setBounds(250, 100, 80, 35);
		
		deletePanel = new JPanel();
		deletePanel.setLayout(null);
				
		deletePanel.add(lblPid);
		deletePanel.add(txtPid);
		deletePanel.add(delete);
		deletePanel.add(cancel);
		
		add(imgPanel, BorderLayout.NORTH);
		add(deletePanel, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(new Dimension(500, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getTxtPid() {
		return txtPid;
	}

	public JButton getDelete() {
		return delete;
	}

	public JButton getCancel() {
		return cancel;
	}
}
