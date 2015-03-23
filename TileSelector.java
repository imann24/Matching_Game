//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
public class TileSelector implements ActionListener {

	
	private TheGame g;
	private Lab8Frame frame;
	private DiamondButton myButton;
	public TileSelector(TheGame game1, Lab8Frame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
		if (g.getOneSelected()) { //if there is already a button selected
			if (!myButton.getIsSelected() && frame.matchingTiles(myButton)) { //if the two clicked buttons match
				g.increaseScore();
				frame.setMessage(g.getScore());
			} else frame.setMessage("Invalid Match"); //if they do not match
			g.setOneSelected(false);
			frame.setSelectedShape(null);
			frame.deactivateButtons();
		}
		else { //if there is currently no button selected
			g.setOneSelected(true);
			frame.setSelectedShape(myButton);
			frame.deactivateButtons();
			myButton.setIsSelected(true);
			frame.setMessage(g.getScore());
		}
		frame.colorButtons();
		frame.repaint();
	}

	public void setJButton (DiamondButton mine) { //provides the listener with a reference to its button
		myButton = mine;
	}

}
