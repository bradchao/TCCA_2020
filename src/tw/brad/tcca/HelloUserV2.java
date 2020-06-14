package tw.brad.tcca;

import java.util.Scanner;

public class HelloUserV2 {

	public static void main(String[] args) {
		System.out.print("Input Name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.printf("Hello, %s", name);
	}

}
