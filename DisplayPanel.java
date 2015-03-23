//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

//
// JPanels are useful as components to draw on
//

public class DisplayPanel extends JPanel {
	
    private Color col;
    private Color col2;
   

	public DisplayPanel() {
		// set size, otherwise Java will assume 0 x 0 and component may disappear
		setPreferredSize(new Dimension(300,300));
	    col2 = makeRandomColor();

	}


	public void randomSet() {
	    
	    col = makeRandomColor();
	    
	}
/*
 * Called when java wants to draw the panel
 * 
 */
	public void paintComponent(Graphics g) {


		g.setColor(col);
		
		g.drawString("Matching Game",50,50);
		
		g.setColor(col2);

		g.fillOval(10,10,60,20);

	}

// Math.random() returns a number between 0 and 1
	
	private Color makeRandomColor() {
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);

		Color col = new Color(red,green,blue);
		return col;
	}

	

}
