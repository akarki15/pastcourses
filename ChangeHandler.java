import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeHandler implements ActionListener{

    Lab8Frame fr;
    TheGame g;

    public ChangeHandler (TheGame game1){
	g=game1;}

    public void actionPerformed(ActionEvent e){
	g.everyTime();
    }
}