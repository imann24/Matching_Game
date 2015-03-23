//original code by John Rager
//modified code by Jeanne Lee and Isaiah Mann

public class TheGame {

	// Notice that the Game does not know about the GUI interface to the game
	
	private int howManyPushed = 0;
	private int limit;
	private String doneMessage = null;
	private int howMany = 12;
	private int score;
	private int scoreIncrement = 5;
	private boolean oneSelected = false;

	public TheGame(int i) {
		limit = i;
	}

	
	public String getDoneMessage() {
		return "Game Over";
	}

	public String getScore() { //new message that it prints to the screen
		return "Score: " + score;
	}

	public int howManyButtons() {
		return howMany;
	}

	//getter and setter method for selected button
	public void setOneSelected (boolean i) { 
		oneSelected = i;
	}

	public boolean getOneSelected () {
		return oneSelected;
	}

	//increases score by designated amount
	public void increaseScore () {
		score+= scoreIncrement;
	}
}
