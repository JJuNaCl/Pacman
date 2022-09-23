package pacman2;

import javax.swing.JFrame;

public class Pacman2 extends JFrame{

// JFrame을 이용해서 컨테이너를 만들고, 각각의 구성(컴포넌트)를 추가한다	
	
	public Pacman2() {
		add(new Model());
	}

	public static void main(String[] args) {
		Pacman2 pac = new Pacman2();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
