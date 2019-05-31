import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class DayFrame extends JFrame {
	private String teamTurn;
	
	
	public DayFrame() {

		
		
		
		
		//End Turn
		teamTurn = "R";
		JMenuBar MenuBar = new JMenuBar();
		
		
		JMenuItem endturn = new JMenuItem("End Turn");
		
		MenuBar.add(endturn);
		this.setJMenuBar(MenuBar);
			endturn.addActionListener(new ActionListener() { 
				
				public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (teamTurn.equals("R"))
					teamTurn = "B";
					else if (teamTurn.equals("B"))
						teamTurn = "R";
			}
			});
		
	
	
	
		//End of End Turn
		
		//setting field	
		ArrayList<Square> teamB= new ArrayList<Square>();
		ArrayList<Square> teamR= new ArrayList<Square>();

		//If team R, append r coordinates, if B append B coordinates		
		
		for (int r = 0; r < 5; r++)
			for (int c = 0; c < 5; c++) 
			{}		
		//livingR
		//livingB
		
		
		//end of setting field
		
		//Start turn
		
		
		
		//Set living to units to move depending on team
		
		
		
		//End of start turn
	
	
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
