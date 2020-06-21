package tw.brad.tcca;

public class MonthDays {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1, days = -1;
		
		if (month == 1 || month == 3) {
			days = 31;
		}else if(month == 2) {
			days = 28;
		}else if(month == 4) {
			days = 30;
		}
		
		System.out.printf("%d月有%d天", month, days);
		
	}

}
