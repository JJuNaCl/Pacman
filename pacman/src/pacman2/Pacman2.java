package pacman2;

import javax.swing.JFrame;

public class Pacman2 extends JFrame{

	public Pacman2() {
		add(new Model());
	}

	public static void main(String[] args) {
		Pacman2 pac = new Pacman2();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(240,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
