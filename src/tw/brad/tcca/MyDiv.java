package tw.brad.tcca;

import java.util.Scanner;

public class MyDiv {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("Y = ");
		int y = scanner.nextInt();
		int result1 = x / y;
		int result2 = x % y;
		System.out.printf("%d / %d = %d ...... %d\n", x, y, result1, result2);
	}

}
