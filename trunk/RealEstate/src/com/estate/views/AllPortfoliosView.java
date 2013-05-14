package com.estate.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.estate.domain.Portfolio;

public class AllPortfoliosView extends JFrame {

	JTable jTable = new JTable();
	DefaultTableModel model;
	JPanel tablePanel, btnPanel;
	//JScrollPane jScrollPane;
	
	//JScrollBar jScrollBar;
	
	JButton ok, cancel;
	
	
	public AllPortfoliosView(List<Portfolio> plist) {
		setLayout(new BorderLayout());
		tablePanel = new JPanel();
		
		String[] columnNames = {"Pid","PorpertyType","ProperyCategory","AreaSize","Address1", "Address2", "Address3","Pin","PhoneNo"}; 
		model = new DefaultTableModel(columnNames, 0);
		
		
		jTable.setModel(model);
		jTable.setAutoCreateColumnsFromModel(true);
		
		//model.addColumn(columnNames);
		
		for(int i=0;i<plist.size();i++) {
			Portfolio portfolio = plist.get(i);
			Vector vector = new Vector();
			vector.add(portfolio.getpId());
			vector.add(portfolio.getPropertyType());
			vector.add(portfolio.getPropertyCategory());
			vector.add(portfolio.getAreaSize());
			vector.add(portfolio.getAddress().getLine1());
			vector.add(portfolio.getAddress().getLine2());
			vector.add(portfolio.getAddress().getLine3());
			vector.add(portfolio.getAddress().getPin());
			vector.add(portfolio.getAddress().getPno());
			model.addRow(vector);			
			
		}
				
		jTable.getColumnModel().getColumn(0).setPreferredWidth(200);
		jTable.getColumnModel().getColumn(1).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(2).setPreferredWidth(200);
		jTable.getColumnModel().getColumn(3).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(4).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(5).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(6).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(7).setPreferredWidth(70);
		jTable.getColumnModel().getColumn(8).setPreferredWidth(70);
		
		
		JScrollPane jsp = new JScrollPane(jTable);
		jsp.setPreferredSize(jTable.getSize());
		
		tablePanel.add(jsp);
		
		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 8,10));
		
		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		
		btnPanel.add(new JLabel("Select Any Row to View Image of Property then Click"));
		btnPanel.add(ok);
		btnPanel.add(cancel);
		add(tablePanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		//pack();
		setSize(700,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public JTable getjTable() {
		return jTable;
	}


	public void setjTable(JTable jTable) {
		this.jTable = jTable;
	}


	public JButton getOk() {
		return ok;
	}
	
	public JButton getCancel() {
		return cancel;
	}
}
