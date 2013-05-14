package com.estate.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PortfolioRegister extends JFrame {

	JPanel p1, p2, propertyPanel, addressPanel, btnPanel, browsePanel, mainPanel, headPanle;

	JTextField txtPid, txtSize;

	JComboBox PType, PCategory;

	JTextField txtFile, txtLine1, txtLine2, txtLine3, txtPin, txtPno;

	JButton browse, submit, reset, cancel;
	JLabel headlbl, meterslbl;
	
	Font font1, font2;

	public PortfolioRegister() throws IOException{
		setTitle(":: Property Registration ::");
		setLayout(new BorderLayout());
		
		
		font1 = new Font("Calibri (Body)", Font.ITALIC, 12);
		font2 = new Font("Calibri (Body)", Font.ITALIC, 20);

		headPanle = new JPanel();
		headPanle.setLayout(new FlowLayout());
		headlbl = new JLabel("Property Restration");
		headlbl.setFont(font2);
		headlbl.setForeground(Color.MAGENTA);
		headPanle.add(headlbl);
		
		meterslbl = new JLabel("(In Square Meters)");
		meterslbl.setFont(font1);
		meterslbl.setForeground(Color.GRAY);
		
		// propertyPanel.setBorder(BorderFactory.createTitledBorder
		// (BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
		// "Portfolio Details",TitledBorder.RIGHT,TitledBorder.TOP,null,Color.red));

		propertyPanel = new JPanel();
		propertyPanel.setLayout(new GridLayout(6, 2, 4, 4));
		txtPid = new JTextField(25);
		txtSize = new JTextField(25);
		String[] ptype = { "<Select>", "Flot", "Plot", "Building",
				"Shoping Complex" };
		String[] pcategory = { "<Select>", "Rental", "Lease", "Sale" };

		PType = new JComboBox(ptype);
		PCategory = new JComboBox(pcategory);
		
		txtFile = new JTextField(20);
		browse = new JButton("Browse");
		
		
		browsePanel = new JPanel();
		
		browsePanel.setLayout(new FlowLayout());
		
		browsePanel.add(txtFile);
		browsePanel.add(browse);

		propertyPanel.add(new JLabel("Property Id"));
		propertyPanel.add(txtPid);
		propertyPanel.add(new JLabel("Property Type"));
		propertyPanel.add(PType);
		propertyPanel.add(new JLabel("Prpoerty Category"));
		propertyPanel.add(PCategory);
		propertyPanel.add(new JLabel("Area Size"));
		propertyPanel.add(txtSize);
		propertyPanel.add(new JLabel());
		propertyPanel.add(meterslbl);
		propertyPanel.add(new JLabel("Upload Image"));
		propertyPanel.add(browsePanel);
			
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(propertyPanel);
		p1.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"Portfolio Details", TitledBorder.LEFT, TitledBorder.TOP, font1,
				Color.red));

		addressPanel = new JPanel();
		addressPanel.setLayout(new GridLayout(5, 2, 4, 4));
		txtLine1 = new JTextField(20);
		txtLine2 = new JTextField(20);
		txtLine3 = new JTextField(20);
		txtPin = new JTextField(20);
		txtPno = new JTextField(20);

		addressPanel.add(new JLabel("Address Line1"));
		addressPanel.add(txtLine1);
		addressPanel.add(new JLabel("Address Line2"));
		addressPanel.add(txtLine2);
		addressPanel.add(new JLabel("Address Line3"));
		addressPanel.add(txtLine3);
		addressPanel.add(new JLabel("Pin"));
		addressPanel.add(txtPin);
		addressPanel.add(new JLabel("Contact No."));
		addressPanel.add(txtPno);
		
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(addressPanel);
		p2.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"Address Details", TitledBorder.LEFT, TitledBorder.TOP, font1,
				Color.red));

		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 10));
		submit = new JButton("Submit");
		reset = new JButton("Reset");
		cancel = new JButton("Cancel");
		
		btnPanel.add(submit);
		btnPanel.add(reset);
		btnPanel.add(cancel);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
		mainPanel.add(p1);
		mainPanel.add(p2);

		add(headPanle, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		setVisible(true);
		// setSize(500, 500);
		pack();
	}

	public JTextField getTxtPid() {
		return txtPid;
	}

	public JTextField getTxtSize() {
		return txtSize;
	}

	public JComboBox getPType() {
		return PType;
	}

	public JComboBox getPCategory() {
		return PCategory;
	}

	public JTextField getTxtFile() {
		return txtFile;
	}

	public JTextField getTxtLine1() {
		return txtLine1;
	}

	public JTextField getTxtLine2() {
		return txtLine2;
	}

	public JTextField getTxtLine3() {
		return txtLine3;
	}

	public JTextField getTxtPin() {
		return txtPin;
	}

	public JTextField getTxtPno() {
		return txtPno;
	}

	public JButton getBrowse() {
		return browse;
	}

	public JButton getSubmit() {
		return submit;
	}

	public JButton getReset() {
		return reset;
	}
	
	public JButton getCancel() {
		return cancel;
	}
	
}	