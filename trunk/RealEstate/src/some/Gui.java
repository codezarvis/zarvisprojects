package some;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class Gui extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JPanel pnlMap, pnlInput;
	JButton btnEnter;
	JTextField txtInput;
	JLabel lblInput, lblMapHolder;
	String postcode, location;
	URL map;
	BufferedImage mapImage;
	
	public Gui() {
		
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();} 
		catch (IllegalAccessException e) {
			e.printStackTrace();}
		
		loadMap("m12ar");
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		
		pnlInput = new JPanel();
		pnlInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlInput.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(pnlInput, c);
		
		lblInput = new JLabel("Enter postcode or town:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		pnlInput.add(lblInput,c);
		
		txtInput = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		pnlInput.add(txtInput,c);
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionEnter());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		pnlInput.add(btnEnter,c);
		
		pnlMap = new JPanel();
		pnlMap.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlMap.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		add(pnlMap, c);
		
		lblMapHolder = new JLabel();
		lblMapHolder.setIcon(new ImageIcon(mapImage));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		pnlMap.add(lblMapHolder, c);
	}
	
	private BufferedImage loadMap(String location) {
		try {
			map = new URL("http://maps.googleapis.com/maps/api/staticmap?center="+location+"&zoom=15&size=400x300&key=AIzaSyCoT-UdzKQ_tDJITN2ZLmTzD7IR2MQ0lBo&sensor=false&markers=color:blue|"+location);
			mapImage = ImageIO.read(map);
		} catch (MalformedURLException e) {			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Could not load map");
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Could not load map");
		}
		return mapImage;
	}
	
	public class ActionEnter implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			lblMapHolder.setIcon(new ImageIcon(loadMap(txtInput.getText().replace(" ", ""))));
		}
	}
}
