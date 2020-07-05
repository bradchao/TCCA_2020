package tw.brad.tcca;

public class PrimeTable {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			
			boolean isPrime = true;
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			System.out.printf("%d%s\t", i, isPrime?"*":" ");
			if (i %10 ==0)System.out.println();
		}
	}

}
