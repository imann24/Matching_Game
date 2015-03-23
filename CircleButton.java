//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//makes a circle
public class CircleButton extends DiamondButton implements ActionListener {
	public CircleButton(Color c) {
		super(c, false);
		setShape("Circle");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getColor());
		g.fillOval(25, 25, 100, 100);		
	}
}