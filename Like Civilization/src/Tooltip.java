import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tooltip extends JPanel {
	
	private JLabel health = new JLabel("Health: ");
	private JLabel moves = new JLabel("Moves: ");
	private JLabel team = new JLabel("Team: ");
	
	public Tooltip() {
		setSize(100, 100);
		health.setBounds(10, 10, 80, 30);
		moves.setBounds(10, 50, 80, 30);
		team.setBounds(10, 90, 80, 30);
		
	}
	
	public void setHealth(String h) {
		health.setText(health.getText().substring(0, 8) +h);
		
	}
	
	public void setMoves(String m) {
		moves.setText(moves.getText().substring(0, 6) +m);
		
	}

	public void setTeam(String t) {
		team.setText(team.getText().substring(0, 5) +t);
	}
	
}
