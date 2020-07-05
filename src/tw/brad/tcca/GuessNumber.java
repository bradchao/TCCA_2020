package tw.brad.tcca;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 1. creaet answer
		String answer = "417";
		
		// 2. User input
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			String guess = scanner.next();
			// 3. check => ?A?B
			String result = "1A2B";
			System.out.println(result);
		}
		
	}

}
