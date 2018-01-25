import java.awt.*;
import java.util.Random;

public class asteroid extends object{
	private int speed = randomOneOrMinusOne() * (1+(int)(Math.random()*2));
	
	public asteroid(int xPos, int yPos, int width, int height, boolean isAlive, int health) {
		super(xPos, yPos, width, height, isAlive, health);
		
	}
	public void draw(Graphics g) {
		if(isAlive == true) {
			g.setColor(Color.black);
			g.drawOval(xPos, yPos, width, height);
		}
	}
	public int randomOneOrMinusOne() {
		Random rand = new Random();
		if(rand.nextBoolean()) return 1;
		else return -1;
		
		
	}
	public void move() {
		xPos += speed;
		yPos += speed;
		System.out.println(speed);
		
	}
	
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos = y;
	}
}
