import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {

		mittF�nster f = new mittF�nster();
	}

}
class mittF�nster extends JFrame{
	minPanel p;
	int width = 600;
	int height = 600;
	public mittF�nster() {
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
