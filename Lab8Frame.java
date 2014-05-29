import java.awt.*;
import javax.swing.*;


public class Lab8Frame extends JFrame {

	private JLabel message;
	private int buttonCount = 11;
	private JButton[] buttons;
	
	public void init() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container ct = getContentPane();
	
		ct.setLayout(new GridLayout(4,0));//(Rows, Columns)
		
		DisplayPanel panel = new DisplayPanel();
		DisplayPanel two = new DisplayPanel();
		
		TheGame game1 = new TheGame(7,this,panel,two);
		
		GameHandler hand = new GameHandler(game1);
		LossHandler lh = new LossHandler(game1);

		ChangeHandler ch=new ChangeHandler(game1);
	
		
	

		buttons = new JButton[buttonCount];
		
		for (int i=0; i< buttonCount; i++) {
			Color c = new Color(randomColorCoord(),randomColorCoord(),randomColorCoord());
			JButton jb = new DiamondButton(c);

			ct.add(jb);
			jb.addActionListener(ch);
			if (i==1 || i==3) {
				jb.addActionListener(lh);
			}
			/////////

			JLabel msg=new JLabel(makeMessage("#00FF00", ""+i));
			jb.add(msg);
			/////////
			jb.addActionListener(hand);

			if (i==2) {
				panel.randomSet(); //Changes color to random 
				ct.add(panel);
			}
	
			buttons[i] = jb;
		}
		message = new JLabel(makeMessage("#FF0000","Keep pressing buttons"));
		ct.add(two);
		ct.add(message);
	
		
	}

	private int randomColorCoord() {
		return (int) (Math.random()*256);
	}

	public String makeMessage(String color, String text) {
		String answer = "<html><FONT COLOR=\"";
		answer = answer +color+"\">"+text+"</FONT></html>";
		return answer;
	}
	
	public void setDoneMessage(String message1) {
		message.setText(makeMessage("#800000",message1));
		
		for (JButton b : buttons) {
			b.setEnabled(false);
		}
			
		
	}
}
