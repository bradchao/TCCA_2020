package tw.brad.tcca;

public class PokerV2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];
		boolean isRepeat;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*52);
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == temp) {
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);

			poker[i] = temp;
			//System.out.println(poker[i]);

		}
		System.out.println("===");
		//System.out.println(System.currentTimeMillis()-start);
		
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		for (int[] player : players) {
			for (int card : player) {
				System.out.print(card + "  ");
			}
			System.out.println();
		}
		
		
		
	}

}
