import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Field extends JPanel {

	private Unit[][] unitField;
	private Terrain[][] terrainField;
	private Square[][] squares;
	private JLabel unitSelected;
	
	private JComboBox order;
	private JButton confirm;
	
	
	
	public Field() {
		
		
		order = new JComboBox();
		
		order.addItem("Attack");
		order.addItem("Wait");
		order.addItem("Move");
		
		confirm = new JButton("Confirm");
		
		
		
		confirm.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(order.getSelectedItem().equals("Move")) {
					//(selected occupier) to (selected occupier)
				}
				else if(order.getSelectedItem().equals("Attack")) {
					
				}
				else if(order.getSelectedItem().equals("Wait")) {
					
				}
				
			}
		});
		
		
		
		
		
		
		
		setBounds(100,100,500,500);
		setLayout(null);
		
		
		
		unitSelected = new JLabel();
		unitSelected.setBounds((new Square().squaresize()) *3, 6* (new Square().squaresize()), 100, 100);
		add(unitSelected);
		setVisible(true);
		
		
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
	
	
	
	
	squares = new Square[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++) {
			squares[r][c] = new Square();
			add(squares[r][c]);
			
			
			squares[r][c].addActionListener(new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					//?? unitSelected.setText(squares[r][c].toString());	
				}
			});
			
			
			
			squares[r][c].setLocation(r*(new Square().squaresize()),c*(new Square().squaresize()));
		//add actionListeners to buttons
			
			
		//Find a way to get a square to return its data to be displayed in a label
		
		
		}
			
	
	
	}
	
	
	public boolean move(int r, int c, int x, int y) {
		if (squares[r + x][c+y].isOccupied())
			return false;
		else if (!squares[r][c].getOccupier().canClimb() && terrainField[r+x][c+y].getisMountain())
			return false;
		
			squares[r+x][c+y].setOccupier(squares[r][c].getOccupier()); 
			squares[r][c].setOccupier(null);
			squares[r+x][c+y].Occupy();
			squares[r][c].unOccupy();
		
		return true;
	}
	

	public Square getSquare(int r, int c) {
		
		return squares[r][c];
	}
	
	
}
