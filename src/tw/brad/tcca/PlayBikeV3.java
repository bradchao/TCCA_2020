package tw.brad.tcca;

import tw.brad.utils.Bike;

public class PlayBikeV3 {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		Bike bike3 = new Bike();
		bike1.setName("Bike 1");
		bike2.setName("Bike 2");
		bike1.upSpeed();bike1.upSpeed();bike1.upSpeed();bike1.upSpeed();
		bike2.upSpeed();bike2.downSpeed();bike2.upSpeed();bike2.downSpeed();
		System.out.printf("%s's bike = %f\n", bike1.getName(), bike1.getSpeed());
		System.out.printf("%s's bike = %f\n", bike2.getName(), bike2.getSpeed());

		
	}

}
