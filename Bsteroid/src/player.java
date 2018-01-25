import java.awt.*;
public class player extends object{
	mittFönster f;
	public player(int xPos, int yPos, int width, int height, boolean isAlive, int health) {
		super(xPos, yPos, width, height, isAlive, health);
		
	}
	public void draw(Graphics g) {
		if(isAlive == true) {
			g.setColor(Color.black);
			g.fillRect(xPos, yPos, width, height);
		}
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
