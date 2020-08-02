package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.utils.MyPainter;

public class MySign extends JFrame {
	private MyPainter myPainter;
	private JButton clear, undo, redo, chColor;
	
	public MySign() {
		super("MySign");
		
		setLayout(new BorderLayout());
		myPainter = new MyPainter();
		add(myPainter, BorderLayout.CENTER);
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		JPanel topLine = new JPanel(new FlowLayout());
		topLine.add(clear);topLine.add(undo);topLine.add(redo);topLine.add(chColor);
		add(topLine, BorderLayout.NORTH);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initEvent();
	}
	
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPainter.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPainter.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPainter.redo();
			}
		});
		
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(this, "Change Color", myPainter.getColor());
		if (newColor != null) {
			myPainter.changeColor(newColor);
		}
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
