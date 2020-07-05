package tw.brad.tcca;

import javax.swing.JFrame;

public class MyWin extends JFrame{

	public MyWin() {
		//System.out.println("OK");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}

}
