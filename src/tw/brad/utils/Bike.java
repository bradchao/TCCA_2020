package tw.brad.utils;

public class Bike {
	protected double speed;
	private String name;
	
	public Bike() {
		name = "nobody";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
}
