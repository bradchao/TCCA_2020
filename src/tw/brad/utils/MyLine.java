package tw.brad.utils;

import java.awt.Color;
import java.util.LinkedList;

public class MyLine {
	private Color color;
	private LinkedList<MyPoint> line;
	
	public MyLine(Color color) {
		this.color = color;
		line = new LinkedList<>();
	}
	
	public void addMyPoint(int x, int y) {
		MyPoint myPoint = new MyPoint(x, y);
		line.add(myPoint);
	}
	
	public Color getColor() {return this.color;}
	public MyPoint getMyPoint(int index) {return line.get(index);}
	public int size() {return line.size();}
	
	
}
