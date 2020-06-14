package tw.brad.tcca;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		boolean isLeap;
		Scanner scanner = new Scanner(System.in);
		int year  = 0;

		try {
			year = scanner.nextInt();
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						// 29
						isLeap = true;
					}else {
						// 28
						isLeap = false;
					}
				}else {
					// 29
					isLeap = true;
				}
			}else {
				// 28
				isLeap = false;
			}
			
			System.out.printf("%d年是%s年", year, isLeap?"閏":"平");
		}catch(Exception e) {
			System.out.printf("別亂輸入:%s", year);
		}
		
		
		/*
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			// 29
		}else {
			// 28
		}
		*/
		
	}

}
