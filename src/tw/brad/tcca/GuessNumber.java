package tw.brad.tcca;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 1. creaet answer
		String answer = createAnswer(3);
		//System.out.println(answer);
		
		// 2. User input
		boolean isWinner = false;
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.printf("%d Guess = ", (i+1));
			String guess = scanner.next();
			// 3. check => ?A?B
			String result = checkAB(answer, guess);
			System.out.printf("%s => %s\n", guess, result);
			
			if (result.equals("3A0B")) {
				isWinner = true;
				break;
			}
		}
		
		if (isWinner) {
			System.out.println("WINNER!");
		}else {
			System.out.println("Answer = " + answer);
		}
		
	}

	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		
		return String.format("%dA%dB", A, B);
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
