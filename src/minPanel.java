import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class minPanel extends JPanel implements ActionListener, KeyListener{
	player p;
	Timer t;
	mittFönster f;
	
	//A.add(new asteroid(x, y, d, d, true, 100));
	
	ArrayList<object> A;
	int currentAsteroids = 7;
	int n = 250;
	
	public minPanel() {
		this.setBackground(Color.yellow);
		p = new player(600/2, 600/2, 30, 30, true, 100);
		
		A = new ArrayList<object>();
		
        for(int i = 0; i < currentAsteroids; i++) {
            int d1 = 20 + (int)(Math.random()*50);
            int d2 = 20 + (int)(Math.random()*50);
            A.add(new asteroid(i * (int)(Math.random()*100), i * (int)(Math.random()*100), d1, d2, true, 100));
        }
		
		
		t = new Timer(10, this); t.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.requestFocus();
		
		p.draw(g);
		for(int i = 0; i<A.size(); i++) {
			A.get(i).draw(g);
		}
		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		p.move();
		
		for(int i = 0; i<A.size(); i++) {
			if(A.get(i)instanceof asteroid) {
				asteroid a = (asteroid)(A.get(i));
				a.move();
				for(int ii = 0; ii<A.size(); ii++) {
					if(A.get(ii)instanceof shot) {
						shot s = (shot)(A.get(ii));
						s.move();
						if(s.col(a.xPos, a.yPos, a.width, a.height)) {
							A.remove(s);
							A.remove(a);
						}else if(s.getY() < 0 || s.getY() > 600 || s.getX() < 0 || s.getX() > 600) {
							A.remove(s);
						}}else if(a.getY() < 0 || a.getY() > 600 || a.getX() < 0 || a.getX() > 600) {
							a.setX(100 + (int)(Math.random()*400));
							a.setY(100 + (int)(Math.random()*400));
							
						}
					}
				}
			}
		this.repaint();
		}
		

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			A.add(new shot(p.getX(), p.getY(), 3, 3, true, 100));
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
