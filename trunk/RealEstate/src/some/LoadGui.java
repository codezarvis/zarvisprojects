package some;

import javax.swing.JFrame;


public class LoadGui {
	public static void main(String[]args) {
		Gui g = new Gui();
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.pack();
		g.setLocationRelativeTo(null);
		g.setTitle("Google Maps");
	}
}
