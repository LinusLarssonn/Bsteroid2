import java.awt.*;
import java.awt.geom.*;

public class shot extends player{

	public shot(int xPos, int yPos, int width, int height, boolean isAlive, int health) {
		super(xPos, yPos, width, height, isAlive, health);
		
	}
	public boolean col(int x, int y, int w, int h) {
		Shape oval = new Ellipse2D.Double(x, y, w, h);
		Shape circ = new Ellipse2D.Double(x, y, w, h);
				
		if(oval.intersects(circ.getBounds())) {
			return true;
		}else {
			return false;
		}
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}

}
