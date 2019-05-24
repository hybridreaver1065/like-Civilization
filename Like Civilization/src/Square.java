import javax.swing.JButton;

public class Square extends JButton {
	
	private int squaresize = 50;
	
	private boolean occupied = false;
	
	public Square() {
	setSize(squaresize,squaresize);

	}
	
	public int squaresize() {return squaresize;} 
	
	public boolean isOccupied() {return occupied;}
	
	public void setOccupy(boolean is) {occupied = is;}
}
