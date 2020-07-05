package tw.brad.tcca;

import tw.brad.utils.Scooter;

public class PlayScooter {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.upSpeed();
		s1.upSpeed();
		s1.downSpeed();
		System.out.println(s1.getSpeed());
		s1.setGear(4);
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(s1.getSpeed());
	}

}
