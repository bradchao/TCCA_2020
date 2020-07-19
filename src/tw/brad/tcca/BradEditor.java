package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		editor.setFont(new Font("", Font.PLAIN, 18));
		editor.setTabSize(4);
		
		JScrollPane jsp = new JScrollPane(editor);
		
		add(jsp, BorderLayout.CENTER);
		
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
		
		saveAs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveAsFile();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void saveAsFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			saveFile();
		}
	}

	private File openFile = null;
	
	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(openFile));
				String line;
				while ( (line = reader.readLine()) != null) {
					editor.append(line + "\n");
				}
				reader.close();
			}catch(Exception e) {
				
			}
		}
	}

	private void saveFile() {
		if (openFile == null) return;
		
		try {
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(openFile));
			bWriter.write(editor.getText());
			bWriter.flush();
			bWriter.close();
			JOptionPane.showMessageDialog(this, "Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		new BradEditor();
	}

}
