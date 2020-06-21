package tw.brad.tcca;

public class MonthDaysV2 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1, days = -1;

		switch (month) {
			case 1:
				days = 31;
				break;
			case 2:
				days = 28;
				break;
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			default:
				days = 99;
		}
		
		
		System.out.printf("%d月有%d天", month, days);
		
	}

}
