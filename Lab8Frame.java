//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

import java.awt.*;
import javax.swing.*;


public class Lab8Frame extends JFrame {

	private JLabel message;
	private int buttonCount;
	private DiamondButton[] buttons;
	private Color[] buttonColors = {Color.RED, Color.YELLOW, Color.BLUE};
	private DiamondButton selectedShape = null;
	public void init() {

		// Exit when window is closed
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container ct = getContentPane();
	
		// set the layout manager to a grid 0 rows by 3 columns 
		// (0 means however many you need)
		ct.setLayout(new GridLayout(4,0));
		
		TheGame game1 = new TheGame(7);
		
		buttonCount = game1.howManyButtons();
		
		//GoodSpotHandler hand = new GoodSpotHandler(game1,this);
		//BadSpotHandler lh = new BadSpotHandler(game1, this);

		DisplayPanel panel = new DisplayPanel();
		
		buttons = new DiamondButton[buttonCount];
		
		for (int i=0; i< buttonCount; i++) {
			
			// create a button  (DiamondButton is part of Lab 8)
			//
			Color c = randomColor(); //generates one of the predesignated colors

			DiamondButton jb = randomShape(c); //generates one of the three shapes
			ct.add(jb);

			// Adding an action listener -
			// when the button is pushed, the actionPerformed method of the
			// Listener is called
			//
			
			TileSelector selector = new TileSelector(game1, this);//new action listener replacing the two old ones
			selector.setJButton(jb);
			jb.addActionListener(selector);
			
			buttons[i] = jb;
		}
		message = new JLabel("Match Color & Shape");
		ct.add(message);
	
		DisplayPanel two = new DisplayPanel();
		ct.add(two);
	}

	private int randomColorCoord() {
		return (int) (Math.random()*256);
	}

	private Color randomColor () {
		return buttonColors[(int) (Math.random()*3)];
	}

	private DiamondButton randomShape(Color c) { //returns one of the three shapes
		int shape = (int) (Math.random() * 3);
		if (shape == 0) 
			return new DiamondButton(c);
		else if (shape == 1) 
			return new SquareButton(c);
		else 
			return new CircleButton(c);
	}
	
	public void setDoneMessage(String message1) {
		message.setText(message1);
		
		for (JButton b : buttons) {
			b.setEnabled(false);
		}
			
		
	}

	public void setMessage (String message1) {
		message.setText(message1);
	}

	public boolean matchingTiles (DiamondButton second) { //compares two diamond buttons
		if (selectedShape.equals(second)) {
			second.beenHere();
			selectedShape.beenHere();
			return true;
		}
		return false;
	}

	public void setSelectedShape (DiamondButton selected) { //a reference to the currently selected button
		selectedShape = selected;
	}

	public void deactivateButtons () { //sets all buttons selected boolean to false
		for (int i=0; i< buttonCount; i++) 
			buttons[i].setIsSelected(false);
	}

	public void colorButtons () { //colors the currently selected button (if there is one) with a green outline
 		Color lightGrey = new Color (234, 234, 234);
		Color darkGrey = new Color (120, 120, 120);
		for (int i=0; i< buttonCount; i++) {
			if (buttons[i].getIsSelected()) 
				buttons[i].setBackground(Color.GREEN);
			else buttons[i].setBackground(lightGrey);
			buttons[i].setOpaque(true);
		}
	}
}
