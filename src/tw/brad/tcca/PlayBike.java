package tw.brad.tcca;

public class PlayBike {

	public static void main(String[] args) {
		String myBikeName = "Brad";
		double myBikeSpeed = 0.0;
		
		String urBikeName = "Andy";
		double urBikeSpeed = 0.0;
		
		myBikeSpeed = upSpeed(myBikeSpeed);
		myBikeSpeed = upSpeed(myBikeSpeed);
		myBikeSpeed = upSpeed(myBikeSpeed);
		myBikeSpeed = upSpeed(myBikeSpeed);
		myBikeSpeed = downSpeed(myBikeSpeed);
		System.out.printf("%s's bike = %f\n", myBikeName, myBikeSpeed);
		
		urBikeSpeed = upSpeed(urBikeSpeed);
		urBikeSpeed = downSpeed(urBikeSpeed);
		urBikeSpeed = upSpeed(urBikeSpeed);
		urBikeSpeed = downSpeed(urBikeSpeed);
		urBikeSpeed = downSpeed(urBikeSpeed);
		System.out.printf("%s's bike = %f\n", urBikeName, urBikeSpeed);
		
		
		
	}
	// function => method, f(x) = 2X + 1
	static double upSpeed(double speed) {
		speed = speed < 1 ? 1 : speed*1.2;
		return speed;
	}
	static double downSpeed(double speed) {
		speed = speed < 1 ? 0 : speed*0.7;
		return speed;
	}

}
