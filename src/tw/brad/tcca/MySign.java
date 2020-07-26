package tw.brad.tcca;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.brad.utils.MyPainter;

public class MySign extends JFrame {
	private MyPainter myPainter;
	
	public MySign() {
		super("MySign");
		
		setLayout(new BorderLayout());
		myPainter = new MyPainter();
		add(myPainter, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
