package tw.brad.utils;

public class Triangle implements MyShape{
	private double side1, side2, side3, height;
	
	public Triangle(double side1,double side2,double side3,double height) {
		this.side1 = side1;this.side2 = side2;this.side3 = side3;
		this.height = height;
	}
	
	@Override
	public double calLength() {
		return side1 + side2 + side3;
	}

	@Override
	public double calArea() {
		return side1*height/2;
	}

}
