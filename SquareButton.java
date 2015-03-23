//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//makes a square
public class SquareButton extends DiamondButton implements ActionListener {
	public SquareButton(Color c) {
		super(c, false);
		setShape("Square");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getColor());
		g.fillRect(25, 25, 100, 100);		
	}
}