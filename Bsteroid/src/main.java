import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {

		mittFönster f = new mittFönster();
	}

}
class mittFönster extends JFrame{
	minPanel p;
	int width = 600;
	int height = 600;
	public mittFönster() {
		this.setTitle("Asteroids");
		this.setVisible(true);
		this.setSize(width, height);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		p = new minPanel(); add(p);
	}
	public int getW() {
		return width;
	}
	public int getH() {
		return height;
	}
	
}
