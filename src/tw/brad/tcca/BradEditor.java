package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
	}

	private void saveFile() {
		
	}
	
	public static void main(String[] args) {
		new BradEditor();
	}

}
