package tw.brad.tcca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.utils.MyLine;
import tw.brad.utils.MyPainterV2;

public class MySign extends JFrame {
	private MyPainterV2 myPainter;
	private JButton clear, undo, redo, chColor, save, saveObj, loadObj;
	
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
		saveObj = new JButton("Save Obj.");
		loadObj = new JButton("Load Obj.");
		JPanel topLine = new JPanel(new FlowLayout());
		topLine.add(clear);topLine.add(undo);topLine.add(redo);topLine.add(chColor);
		topLine.add(save);topLine.add(saveObj);topLine.add(loadObj);
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
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObj();
			}
		});
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObj();
			}
		});
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(this, "Change Color", myPainter.getColor());
		if (newColor != null) {
			myPainter.changeColor(newColor);
		}
	}
	
	private void saveImage() {
		BufferedImage im = new BufferedImage(myPainter.getWidth(), myPainter.getHeight(), BufferedImage.TYPE_INT_ARGB);
		myPainter.paint(im.getGraphics());
		try {
			ImageIO.write(im, "PNG", new File("dir1/test2.png"));
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}
	
	private void saveObj() {
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("dir1/brad.object"));
			oout.writeObject(myPainter.getLines());
			oout.flush();
			oout.close();
			System.out.println("save ok");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	private void loadObj() {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("dir1/brad.object"));
			LinkedList<MyLine> lines = (LinkedList<MyLine>)(oin.readObject());
			oin.close();
			myPainter.setLines(lines);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
