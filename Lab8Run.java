//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.*;


public class Lab8Run {
	
	public static void main(String[] args) {
		
		Lab8Frame frame = new Lab8Frame();
		frame.init();
		
		frame.pack();
		frame.setVisible(true);
		frame.setSize(new Dimension(600,600));
		frame.repaint();
		
		// this method must finish and return before GUI 
		// handling begins
	}
	
}
