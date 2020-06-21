package tw.brad.tcca;

public class CubeV2 {

	public static void main(String[] args) {
		int[] p = new int[7];
		for (int i = 0; i < 100; i++) {
			int point = (int) (Math.random() * 6) + 1;	// 1 - 6
			p[point]++;
		}
		
		for (int i=1; i<=6; i++) {
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}
		
	}

}
