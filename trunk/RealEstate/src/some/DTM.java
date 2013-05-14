package some;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DTM extends JFrame{

	public DTM() {

		 DefaultTableModel model = new DefaultTableModel(new Object[][] {
			      { "some", "text" }, { "any", "text" }, { "even", "more" },
			      { "text", "strings" }, { "and", "other" }, { "text", "values" } },
		  new Object[] { "Column 1", "Column 2" });

			  

			    JTable table = new JTable(model);
			    

			  
	
		
		add(table);
		
		setVisible(true);
		setSize(500, 500);
	}
	
	
	public static void main(String[] args) {

		new DTM();
	}

}
