import java.awt.Graphics;

abstract class object {
	protected int xPos;
	protected int yPos;
	protected int width;
	protected int height;
	protected boolean isAlive;
	public int health;
	
	public object(int xPos, int yPos, int width, int height, boolean isAlive, int health) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
		this.health = health;
	}
	public void updateHealth() {
	
	}
	public abstract void draw(Graphics g);
	public abstract void move();
}
