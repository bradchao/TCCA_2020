package tw.brad.tcca;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeapYearV2 {

	public static void main(String[] args) {
		boolean isLeap;
		
		String strYear = JOptionPane.showInputDialog("Year?");
		int year = Integer.parseInt(strYear);
		
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
		JOptionPane.showMessageDialog(null, String.format("%d年是%s年", year, isLeap?"閏":"平"));
		
		
		/*
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			// 29
		}else {
			// 28
		}
		*/
		
	}

}
