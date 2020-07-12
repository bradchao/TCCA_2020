package tw.brad.tcca;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberV2 extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public GuessNumberV2(String title) {
		// super()
		super(title);
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GuessNumberV2("猜數字遊戲");
	}

}
