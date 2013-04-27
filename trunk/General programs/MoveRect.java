import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;


public class MoveRect extends JApplet implements MouseListener{
	
	int x = 0;
	int y = 0;
	int width;
	int height;
	

	
	
	public void init(){
		addMouseListener(this);
	}
	
	public void paint(Graphics graphics){
		
		super.paint(graphics);
		
		graphics.drawRect(x, y, width, height);
		//graphics.clearRect(x, y, width, height);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		x = 0;
		y = 0;
		width = 0;
		height = 0;
		this.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		width = 50;
		height = 30;
		this.repaint();
	}
	

}
