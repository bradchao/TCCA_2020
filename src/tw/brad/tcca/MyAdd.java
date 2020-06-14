package tw.brad.tcca;

import java.util.Scanner;

public class MyAdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("Y = ");
		int y = scanner.nextInt();
		int result1 = x + y;
		int result2 = x - y;
		int result3 = x * y;
		int result4 = x / y;
		System.out.printf("%d + %d = %d\n", x, y, result1);
		System.out.printf("%d - %d = %d\n", x, y, result2);
		System.out.printf("%d x %d = %d\n", x, y, result3);
		System.out.printf("%d / %d = %d\n", x, y, result4);
	}

}
