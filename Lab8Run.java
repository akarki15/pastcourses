import java.awt.*;


public class Lab8Run {
	
	public static void main(String[] args) {
		
		Lab8Frame frame = new Lab8Frame();
		frame.init();
		
		frame.pack();
		frame.setVisible(true);
		frame.setSize(new Dimension(600,600));
		frame.repaint();
		
	}
	
}
