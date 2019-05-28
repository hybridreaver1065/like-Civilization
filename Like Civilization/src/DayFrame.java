import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class DayFrame extends JFrame {

	
	public DayFrame() {
		
		
		JMenuBar MenuBar = new JMenuBar();
	
	
	
	this.setJMenuBar(MenuBar);
		
	
	
	JPanel overall = new  JPanel();
		CardLayout cl = new CardLayout();
		
		overall.setLayout(cl);
		
		JPanel ellis = new Field();
		
		
		
		
		
		JPanel card2 = new JPanel();
		card2.add(new JLabel("This is The Unit Cheat Sheet"));
		JButton button2= new JButton("Button 2");
		card2.add(button2);
	
		
		JPanel card3 = new JPanel();
		card3.add(new JLabel("This is how the game's played"));
		JButton button3= new JButton("Button 3");
		card3.add(button3);
		
		overall.add(ellis,"panel 1");
		overall.add(card2,"panel 2");
		overall.add(card3,"panel 3");
		
		cl.show(overall, "panel 1");
		
		setBounds(100,100,600,500);
		add(overall);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
		
		
button2.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			cl.show(overall, "panel 3");	
			}
		});


button3.addActionListener(new ActionListener() {
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	cl.show(overall, "panel 1");	
	
	
	}
});




	}
	public static void main(String[] args) {
		new DayFrame();
	}
}
