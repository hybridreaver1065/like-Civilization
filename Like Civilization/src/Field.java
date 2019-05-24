import javax.swing.JPanel;

public class Field extends JPanel {

	public Field() {
		
		setBounds(100,100,500,500);
		setLayout(null);
		
	Unit[][] unitField = new Unit[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++)
			unitField[r][c] = null;
	
	Terrain[][] terrainField = new Terrain[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++)
			if(Math.random() * 6 + 1 == 1)
				terrainField[r][c] = new Mountain();
			else 
				terrainField[r][c] = new Plains();
	
	
	//Make an array of buttons
	Square[][] squares = new Square[5][5];
	for (int r = 0; r < 5; r++)
		for (int c = 0; c < 5; c++) {
			squares[r][c] = new Square();
			add(squares[r][c]);
			squares[r][c].setLocation(r*(new Square().squaresize()),c*(new Square().squaresize()));
		//add actionListeners to buttons
			
		}
			
	}
	

	
	
	
}
