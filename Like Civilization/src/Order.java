import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Order extends JPanel{
	private JComboBox action;
	
	private String command;
	
	private JButton confirm;
	private JLabel selectedUnit;
	private JLabel act;
	private JLabel square;
	
	
	public Order() {
	setSize(200,150);
	//Use gridbag layout to keep it simple?
	
	setLayout(null);
	
	
	
	confirm = new JButton("Confirm");
		
		


	
	
	}
	
	public JButton getConfirm() {
		return confirm;
	}

}
