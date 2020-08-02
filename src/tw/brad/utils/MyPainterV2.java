package tw.brad.utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPainterV2 extends JPanel{
	private MyMouseListener myMouseListener;
	private LinkedList<MyLine> lines, recycler;
	private Color nowColor;
	
	public MyPainterV2() {
		nowColor = Color.BLUE;
		
		lines = new LinkedList<>();
		recycler = new LinkedList<>();
		myMouseListener = new MyMouseListener();
		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		
		for (MyLine line: lines) {
			g2d.setColor(line.getColor());
			for (int i=1; i<line.size(); i++) {
				MyPoint p0 = line.getMyPoint(i-1);
				MyPoint p1 = line.getMyPoint(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
		
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			MyLine line = new MyLine(nowColor);
			line.addMyPoint(e.getX(), e.getY());
			
			lines.add(line);
			repaint();
			
			recycler.clear();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			lines.getLast().addMyPoint(e.getX(), e.getY());
			
			repaint();
		}
	}

	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycler.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycler.size()>0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public Color getColor() {
		return nowColor;
	}
	
	public void changeColor(Color color) {
		nowColor = color;
		repaint();
	}
	
}
