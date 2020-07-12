package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberV2 extends JFrame 
	implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public GuessNumberV2(String title) {
		// super()
		super(title);
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		guess.addActionListener(this);
		
		setLayout(new BorderLayout());
		add(log, BorderLayout.CENTER);
		
		JPanel topLine = new JPanel(new BorderLayout());
		add(topLine, BorderLayout.NORTH);
		
		topLine.add(guess, BorderLayout.EAST);
		topLine.add(input, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GuessNumberV2("猜數字遊戲");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}

}
