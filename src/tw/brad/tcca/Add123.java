package tw.brad.tcca;

public class Add123 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		// 0
		// 1 = 0 + 1
		// 3 = 1 + 2
		// 6 = 3 + 3
		int n = 1000;
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum += i++;
		}
		
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		System.out.println("===");
		
		sum = 0; i = 1;
		for (;i<=n;) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);
		
		
		
	}

}
