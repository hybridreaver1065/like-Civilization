import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Order extends JPanel{
	private JComboBox orders;
	
	private String command;
	
	private JButton confirm;
	private JTextField unit;
	private JButton left = new JButton(),right= new JButton(),up= new JButton(),down= new JButton(), dead= new JButton();
	private JButton leftDown= new JButton(),leftUp= new JButton(), rightDown= new JButton(), rightUp= new JButton();
	private ArrayList<JButton> Dbuttons;
	
	public Order() {
	setSize(200,150);
	setLayout(null);
	
	Dbuttons = new ArrayList<JButton>();
	
	Dbuttons.add(leftUp);
	Dbuttons.add(up);
	Dbuttons.add(rightUp);
	
	Dbuttons.add(left);
	Dbuttons.add(dead);
	Dbuttons.add(right);
	
	Dbuttons.add(leftDown);
	Dbuttons.add(down);
	Dbuttons.add(rightDown);
	
	for (JButton button:Dbuttons) {
		button.setSize(10,5);
		add(button);
		button.setVisible(true);
		}
	for(int r = 0; r< 2;r++)
		for(int c = 0; c< 1;r++) 
			Dbuttons.get(r+c).setLocation(r*10, c*10);
		
			

	
	
	}

}
