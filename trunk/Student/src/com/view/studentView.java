package com.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class studentView extends JFrame implements ActionListener
{


	
	private  JLabel lbl1,
	    lbl2,
	    lbl3,
	    lbl4,
	    lbl5;
	private JTextField txt1,
	    txt2,
	    txt3,
	    txt4,
	    txt5;
	private JButton  btnCreate,
	    btnReset,
	    btnList;
	
	public studentView() {
		
		setLayout(null);
		
		lbl1 = new JLabel("Enter studentNo");
		
		lbl2 = new JLabel("Enter strdentname");
		lbl3 = new JLabel("Enter 1st subject marks");
		lbl4 = new JLabel("Enter 2nd subject marks");
		lbl5 = new JLabel("total on the marks");
		
		
		lbl1.setBounds(100, 100, 150, 40);
		lbl2.setBounds(100, 150, 150, 40);
		lbl3.setBounds(100, 200, 150, 40);
		lbl4.setBounds(100, 250, 150, 40);
		lbl5.setBounds(100, 300, 150, 40);
		
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		txt4 = new JTextField();
		txt5 = new JTextField();
		
		txt1.setBounds(250, 100, 150, 30);
		txt2.setBounds(250, 150, 150, 30);
		txt3.setBounds(250, 200, 150, 30);
		txt4.setBounds(250, 250, 150, 30);
		txt5.setBounds(250, 300, 150, 30);
		
		
		btnCreate = new JButton("Submit");
		btnReset = new JButton("ReSet");
		btnList = new JButton("Student list");
		
		btnCreate.setBounds(100, 450, 150, 40);
		btnReset.setBounds(250, 450, 150, 40);
		btnList.setBounds(400,450, 150, 40);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(btnCreate);
		add(btnReset);
		add(btnList);
		
		setVisible(true);
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public JTextField getTxt1() {
		return txt1;
	}

	public JTextField getTxt2() {
		return txt2;
	}

	public JTextField getTxt3() {
		return txt3;
	}

	public JTextField getTxt4() {
		return txt4;
	}

	public JTextField getTxt5() {
		return txt5;
	}

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public JButton getBtnReset() {
		return btnReset;
	}

	public JButton getBtnList() {
		return btnList;
	}

	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	public void setBtnReset(JButton btnReset) {
		this.btnReset = btnReset;
	}

	public void setBtnList(JButton btnList) {
		this.btnList = btnList;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
	}
}



