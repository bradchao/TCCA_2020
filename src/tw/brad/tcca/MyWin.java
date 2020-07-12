package tw.brad.tcca;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame{
	private JButton b1, b2, b3;

	public MyWin() {
		//
		b1 = new JButton("Click1");
		b2 = new JButton("Click2");
		b3 = new JButton("Click3");
		
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		
		add(b1); add(b2); add(b3);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}

}
