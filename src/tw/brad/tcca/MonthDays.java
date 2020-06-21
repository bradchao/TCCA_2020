package tw.brad.tcca;

public class MonthDays {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1, days = -1;
		
		if (month == 1 || month == 3 || month == 5 || month == 7
				 || month == 8 || month == 10 || month == 12) {
			days = 31;
		}else if(month == 4 || month == 6 
				|| month == 9 || month == 11) {
			days = 30;
		}else if(month == 2) {
			days = 28;
		}else {
			days = 99;
		}
		
		System.out.printf("%d月有%d天", month, days);
		
	}

}
