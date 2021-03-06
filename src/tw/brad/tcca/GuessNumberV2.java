package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberV2 extends JFrame 
	implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;	// 0
	
	public GuessNumberV2(String title) {
		// super()
		super(title);
		
		guess = new JButton("猜猜猜");
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
		
		initGame();
	}

	private void initGame() {
		answer = createAnswer(3);
		System.out.println(answer);
		counter = 0;
		log.setText("");
		JOptionPane.showMessageDialog(this, "開新局");
	}
	
	public static void main(String[] args) {
		new GuessNumberV2("猜數字遊戲");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		String strInput = input.getText();
		String result = checkAB(answer, strInput);
		String mesg = String.format("%d. %s => %s\n", counter,strInput, result); 
		JOptionPane.showMessageDialog(this, mesg);
		log.append(mesg);
		input.setText("");
		
		if (result.equals("3A0B")) {
			// WINNER
			JOptionPane.showMessageDialog(this, "WINNER");
			initGame();
		}else if(counter == 10) {
			// LOSER
			JOptionPane.showMessageDialog(this, "LOSER:" + answer);
			initGame();
		}
	}

	static String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		String temp = "";
		for(int i=0; i<d; i++) {
			temp += poker[i];
		}
		return temp;
	}
	
	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		
		return String.format("%dA%dB", A, B);
	}
}
