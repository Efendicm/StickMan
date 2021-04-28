import java.awt.*;
import javax.swing.*;
public class ShapeComponent extends JComponent {
	private Polygon tree;
	private int MID_X = 300;
	private int TOP_Y;
	private	int[] xArr = {MID_X, MID_X+60, MID_X+30,MID_X+120, MID_X+80, MID_X+180, 

			MID_X-180, MID_X-80, MID_X-120, MID_X-30, MID_X-60};

	private int[] yArr = {TOP_Y, TOP_Y+80, TOP_Y+80, TOP_Y+160, TOP_Y+160, TOP_Y+240, 

			TOP_Y+240, TOP_Y+160, TOP_Y+160, TOP_Y+80, TOP_Y+80};
public ShapeComponent() {
	tree = new Polygon(xArr, yArr, xArr.length);
}
public static void main(String[] args) {
	JFrame frame = new JFrame ("Christmas Tree");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.getContentPane().add (new ShapeComponent());

	

	frame.pack();

	frame.setVisible(true);
}
public void paintComponent (Graphics g) {

	

	super.paintComponent(g);

	

	g.setColor (Color.green);

	g.fillPolygon(tree); //draw tree 

	g.setColor (Color.black);

	g.fillRect(MID_X-20, TOP_Y+240, 40, 100); //draw tree trunk


}
}
