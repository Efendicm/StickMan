import java.awt.*;

import javax.swing.JComponent;
public class StickFigure extends JComponent {
	private int step = 0;
	
	public StickFigure(){
		super();
	}
	public void go(){
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setStroke(new BasicStroke(10));
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.white);
	if(step == 0) {
		g2D.drawOval(170,200,40,40);
		g2D.drawLine(190,245,190,300);
		g2D.drawLine(190,245,165,300);
		g2D.drawLine(190,245,215,300);
		g2D.drawLine(190,300,170,350);
		g2D.drawLine(190,300,205,350);
		step = 1;
		
	}	
	else if(step == 1){
		g2D.drawOval(170,180,40,40); //head
		g2D.drawLine(190,228,190,283); // Body
		g2D.drawLine(190,228,145,253); // left arm
		g2D.drawLine(190,228,235,253);// right arm
		g2D.drawLine(190,283,150,320);//left leg
		g2D.drawLine(190,283,230,320);//right leg
		step = 2;
	}
	else if(step == 2){
		g2D.drawOval(170,130,40,40);
		g2D.drawLine(190,175,190,230);
		g2D.drawLine(190,175,135,185);
		g2D.drawLine(190,175,245,185);
		g2D.drawLine(190,230,135,245);
		g2D.drawLine(190,230,245,245);
		step = 3;
	}
	else if(step == 3){
			g2D.drawOval(170,50,40,40);
			g2D.drawLine(190,95,190,150);
			g2D.drawLine(190,95,140,65);
			g2D.drawLine(190,95,240,65);
			g2D.drawLine(190,150,140,160);
			g2D.drawLine(190,150,240,160);
			step = 4;
	}
	else if(step == 4){
		g2D.drawOval(170,130,40,40);
		g2D.drawLine(190,175,190,230);
		g2D.drawLine(190,175,135,185);
		g2D.drawLine(190,175,245,185);
		g2D.drawLine(190,230,135,245);
		g2D.drawLine(190,230,245,245);
		step = 5;
	}
	else if(step == 5){
		g2D.drawOval(170,180,40,40);
		g2D.drawLine(190,228,190,283);
		g2D.drawLine(190,228,145,253);
		g2D.drawLine(190,228,235,253);
		g2D.drawLine(190,283,150,320);
		g2D.drawLine(190,283,230,320);
		step = 0;
	}
	}
}
