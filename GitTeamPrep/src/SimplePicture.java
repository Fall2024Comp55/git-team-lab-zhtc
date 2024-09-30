import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

// I'm annoyed
// yasNalsmwlykuncgweygu
// something else
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static String NAME = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(NAME, 200, 400);
		add(robot);
		GLabel label = new GLabel("How I feel when using github hackslash zach, teran.", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}