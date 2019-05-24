
public abstract class Unit {

	private String team = "neutral";
	
	
	private boolean isDead = false;
	
	private int health;
	private int armor;
	private int move;
	private int range1;
	private int range2;
	private int damage1;
	private int damage2;
	private int size;
	private int attacks1 = 1;
	private int attacks2 = 1;
	
public abstract boolean canClimb();

//write getters and setters
 public int getHealth() {return health;}
 public int getArmor() {return armor;}
 public int getMove() {return move;}
 public int getRange1() {return range1;}
 public int getRange2() {return range2;}
 public int getDamage1() {return damage1;}
 public int getDamage2() {return damage2;}
 public int getSize() {return size;}

 public void setHealth(int amt) {
	 health = amt;
 }
 public void setArmor(int amt) {
	 armor = amt;
 }
 public void setMove(int amt) {
	 move = amt;
 }
 public void setRange1(int amt) {
	  range1= amt;
 }
 public void setRange2(int amt) {
	  range2= amt;
 }
 public void setDamage1(int amt) {
	  damage1= amt;
 }
 public void setDamage2(int amt) {
	  damage2= amt;
 }
 public void setSize(int amt) {
	  size = amt;
 }
 
 public void setAttacks1(int amt){ attacks1 = amt;}
 public void setAttacks2(int amt){ attacks2 = amt;}
 
 public int getAttacks1(){return  attacks1;}
 public int getAttacks2(){return attacks2;}
 
 public String getTeam() {return team;}
 public void setTeam(String t) {team = t;} 
 
 
 //Gameplay elements
 
 public boolean takeDamage(int damage) {
	 
	 health -= damage;
	 
	 if (health> 0) 
		 return isDead();
	 else 
		 return false;
	 }
 
 public String attack1(Unit A, Unit B) {
	 
	B.takeDamage( (B.getHealth() - (B.getArmor() - A.getDamage1()) * A.getAttacks1()));
	
	return ""+B.getHealth()+B.isDead();
	 
 }

public boolean isDead() {
	return isDead;
}

public void setDead(boolean isDead) {
	this.isDead = isDead;
}
 
}
