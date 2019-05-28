import javax.swing.JButton;

public class Square extends JButton {
	
	private int squaresize = 50;
	
	private boolean occupied = false;
	
	private Unit occupier;
	
	public Square() {
	setSize(squaresize,squaresize);

	}
	
	public int squaresize() {return squaresize;} 
	
	public boolean isOccupied() {return occupied;}
	
	public void Occupy() {occupied = true;}
	public void unOccupy() {occupied = true;}
	
	
	public String toString() {return "" +occupier+"\n"+ occupier.getHealth()+"\n"+ occupier.getMove() ;}

	public Unit getOccupier() {
		return occupier;
	}

	public void setOccupier(Unit occ) {
		occupier = occ;
	}
}
