package tw.brad.utils;

public class Circle implements MyShape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double calLength() {
		return 2*Math.PI*r;
	}

	@Override
	public double calArea() {
		return Math.PI*r*r;
	}
	

}
