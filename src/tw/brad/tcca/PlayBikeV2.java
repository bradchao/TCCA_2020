package tw.brad.tcca;

import tw.brad.utils.Bike;

public class PlayBikeV2 {

	public static void main(String[] args) {
		Bike myBike;
		myBike = new Bike();
		System.out.printf("%s's bike = %f\n", myBike.getName(), myBike.getSpeed());
		myBike.setName("Brad");
		for (int i=0; i<14; i++) myBike.upSpeed();
		System.out.printf("%s's bike = %f\n", myBike.getName(), myBike.getSpeed());
		
	}

}
