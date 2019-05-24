
public class Terrain {

	private boolean isMountain = false;
	private boolean isOccupied = false;
	private boolean isBase = false;
	private boolean impassable = false;
	
	
	void setisMountain(boolean b) {isMountain = b;}
	void setisOccupied(boolean b) {isOccupied = b;}
	void setisBase(boolean b) {isBase = b;}
	void setimpassable(boolean b) {impassable = b;}
	
	boolean getisMountain() {return isMountain;}
	boolean getisOccupied() {return isOccupied;}
	boolean getisBase() {return isBase;}
	boolean getimpassable() {return impassable;}
}