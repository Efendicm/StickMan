import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;

public class Stickman extends JComponent
{
public void paintComponent(Graphics g)
 {
    Graphics2D g2 = (Graphics2D) g;
    
    g2.setStroke(new BasicStroke(10));

    Ellipse2D.Double head = new Ellipse2D.Double(100, 40, 60, 60);
    g2.draw(head);

    Line2D.Double body=new Line2D.Double(130, 100, 130,200);
    g2.draw(body);

    Line2D.Double arm1=new Line2D.Double(60,110,125,130);
    g2.draw(arm1);
    Line2D.Double arm2=new Line2D.Double(200,110,130,130);
    g2.draw(arm2);
    Line2D.Double leg1=new Line2D.Double(120,250,130,200);
    g2.draw(leg1);
    Line2D.Double leg2=new Line2D.Double(160,250,130,200);
    g2.draw(leg2);

    }
public static void main(String[] arg)
{
    JFrame frame = new JFrame();
    frame.setSize(1000,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Stickman fig1=new Stickman();
    frame.add(fig1);
    frame.setVisible(true);

    }
}
