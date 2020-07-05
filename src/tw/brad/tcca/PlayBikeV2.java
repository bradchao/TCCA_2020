package tw.brad.tcca;

import tw.brad.utils.Bike;

public class PlayBikeV2 {

	public static void main(String[] args) {
		Bike myBike;
		myBike = new Bike();
		System.out.println(myBike.speed);
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		System.out.println(myBike.speed);
		
	}

}
