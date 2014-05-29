import java.awt.*;
import javax.swing.*;

public class TheGame {

    int howManyPushed = 0;
    int limit;
    int badLimit;
    Lab8Frame frame;
    DisplayPanel panel;
    DisplayPanel two;
    public TheGame(int i, Lab8Frame frame2, DisplayPanel p, DisplayPanel t) {
		limit = i;
		frame = frame2;
		panel=p;
		two=t;
		badLimit=0;
	}

	public void badSpot() {
	    badLimit++;
	    if( badLimit>1)
		frame.setDoneMessage("You Lose - Good!");
	    else {
		two.add(new JLabel(" Bad spot! But you get one more chance!!"));}
	}
	
	public void spot() {
		howManyPushed++;
	       
		if (howManyPushed == limit)
			frame.setDoneMessage("Curses, you win");
	}
    public void everyTime(){
	
	panel.add(new JLabel(""+howManyPushed));
    }


}
