//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DiamondButton extends JButton implements ActionListener {
	private Color c = Color.BLUE;
	private boolean isDiamond = false;
	private boolean isSelected = false;
	private String shape = "Diamond";
	public DiamondButton(Color c) { //default constructor to make a diamond
		this(c, true);
	}

	public DiamondButton(Color c, boolean isDiamond) {
		this.c = c;
		this.addActionListener(this);
		this.isDiamond = isDiamond;
	}
	
	/*  
	 * The method paintComponent(Graphics g) is called when
	 * java needs to draw the component
	 */
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    if (isDiamond) { //added conditional so that non-diamonds shapes can still use this constructor
			int[] xPoints = new int[4];
			int[] yPoints = new int[4];
			
			xPoints[0] = 30;
			yPoints[0] = 60;
			xPoints[1] = 75;
			yPoints[1] = 10;
			xPoints[2] = 120;
			yPoints[2] = 60;
			xPoints[3] = 75;
			yPoints[3] = 110;
			g.setColor(c);
			g.fillPolygon(xPoints, yPoints, xPoints.length);
		}
	}

	public void beenHere() {
		c = Color.gray;
		ImageIcon x = new ImageIcon("X.gif");
		// setIcon adds an image to a button
		this.setIcon(x);
		this.setEnabled(false);		
	}
	
	public void actionPerformed(ActionEvent e) { //no longer needed

	}

	//getter and setter methods for new private variables
	public Color getColor() {
		return c;
	}

	public void setShape (String s) {
		shape = s;
	}

	public String getShape () {
		return shape;
	}

	public Boolean equals (DiamondButton otherButton) {
		if (shape.equals(otherButton.getShape()) && c.equals(otherButton.getColor()))
			return true;
		return false;
	}
	
	public String toString() {
		return "Shape: " + getShape() + " Color: " + getColor();
	}

	public boolean getIsSelected () {
		return isSelected;
	}

	public void setIsSelected (boolean i) {
		isSelected = i;
	}
}
