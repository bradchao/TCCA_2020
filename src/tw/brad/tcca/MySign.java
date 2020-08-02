package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.utils.MyPainterV2;

public class MySign extends JFrame {
	private MyPainterV2 myPainter;
	private JButton clear, undo, redo, chColor, save;
	
	public MySign() {
		super("MySign");
		
		setLayout(new BorderLayout());
		myPainter = new MyPainterV2();
		add(myPainter, BorderLayout.CENTER);
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		save = new JButton("Save");
		JPanel topLine = new JPanel(new FlowLayout());
		topLine.add(clear);topLine.add(undo);topLine.add(redo);topLine.add(chColor);
		topLine.add(save);
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
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveImage();
			}
		});
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(this, "Change Color", myPainter.getColor());
		if (newColor != null) {
			myPainter.changeColor(newColor);
		}
	}
	
	public void saveImage() {
		BufferedImage im = new BufferedImage(myPainter.getWidth(), myPainter.getHeight(), BufferedImage.TYPE_INT_ARGB);
		myPainter.paint(im.getGraphics());
		try {
			ImageIO.write(im, "PNG", new File("dir1/test2.png"));
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
