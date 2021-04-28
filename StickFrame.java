import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class MovingStickFrame extends JFrame {
	private StickFigure figureDisplay;
	private JButton move;
	private Timer theTimer;
	
	public MovingStickFrame(){
		super();
		Container ctPane = getContentPane();
		figureDisplay = new StickFigure();
		
		ctPane.add(figureDisplay, BorderLayout.CENTER);
		move = new JButton("Jump");
		move.addActionListener(new Animate());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(move);
		
		ctPane.add(buttonPanel, BorderLayout.SOUTH);
	}
	private class Animate implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			figureDisplay.go();
			
		}

		
	}
	private class StartJump implements ActionListener {
		public void actionPerformed(ActionEvent e){
			theTimer.start();
		}
	}
	public MovingStickFrame (String title) {
		this();
		setTitle(title);
	}
	
	public static void main(String[] args) {
		MovingStickFrame frame = new MovingStickFrame("Jumping Jack Stick Figure");
		frame.setSize(400,450);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
