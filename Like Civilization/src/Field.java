import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Field extends JPanel {

	private Unit[][] unitField;
	private Terrain[][] terrainField;
	private Square[][] squares;
	
	JLabel unitSelected;
	
	public Field() {
		
		setBounds(100,100,500,500);
		setLayout(null);
		
	 unitField = new Unit[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++)
			unitField[r][c] = null;
	
	 terrainField = new Terrain[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++)
			if(Math.random() * 6 + 1 == 1)
				terrainField[r][c] = new Mountain();
			else 
				terrainField[r][c] = new Plains();
	
	
	//Make an array of buttons
	
	unitSelected = new JLabel();
	
	
	squares = new Square[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++) {
			squares[r][c] = new Square();
			add(squares[r][c]);
			
			
			squares[r][c].addActionListener(new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					unitSelected.setText(toString());	
				}
			});
			
			
			
			squares[r][c].setLocation(r*(new Square().squaresize()),c*(new Square().squaresize()));
		//add actionListeners to buttons
			
			
		//Find a way to get a square to return its data to be displayed in a label
		
		
		}
			
	}
	

	public Square getSquare(int r, int c) {
		
		return squares[r][c];
	}
	
	
}
