package tw.brad.tcca;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 1. creaet answer
		String answer = createAnswer(5);
		System.out.println(answer);
		
		// 2. User input
//		Scanner scanner = new Scanner(System.in);
//		for (int i=0; i<3; i++) {
//			String guess = scanner.next();
//			// 3. check => ?A?B
//			String result = "1A2B";
//			System.out.println(result);
//		}
		
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		String temp = "";
		for(int i=0; i<d; i++) {
			temp += poker[i];
		}
		return temp;
	}
	
	

}
