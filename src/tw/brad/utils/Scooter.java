package tw.brad.utils;

public class Scooter extends Bike{
	private int gear;	// 0
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getGear() {return gear;}
	
	@Override
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*(gear)*1.5;		
	}
	
}
