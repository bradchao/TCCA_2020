package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BradEditor extends JFrame {
	private JButton open, save, saveAs;
	private JTextArea editor;
	
	public BradEditor() {
		super("Brad Editor");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		open = new JButton("Open");
		save = new JButton("Save");
		saveAs = new JButton("Save As");
		top.add(open); top.add(save); top.add(saveAs);
		
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		add(editor, BorderLayout.CENTER);
		
		
		
		
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BradEditor();
	}

}
