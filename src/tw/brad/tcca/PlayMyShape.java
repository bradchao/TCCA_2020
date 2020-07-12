package tw.brad.tcca;

import tw.brad.utils.Circle;
import tw.brad.utils.MyShape;
import tw.brad.utils.Triangle;

public class PlayMyShape {
	public static void main(String[] args) {
		Triangle triTriangle = new Triangle(10, 20, 33, 4);
		Circle circle = new Circle(10);
		
		System.out.println(getArea(triTriangle));
		System.out.println(getArea(circle));
	}
	
	static double getArea(MyShape myShape) {
		return myShape.calArea();
	}

}
