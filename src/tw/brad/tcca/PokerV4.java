package tw.brad.tcca;

import java.util.Collections;
import java.util.LinkedList;

public class PokerV4 {

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<>();
		for (int i=0; i<52; i++) poker.add(i);
		Collections.shuffle(poker);
		int[] newpoker = new int[52];
		for (int i=0; i<52; i++) {
			newpoker[i] = poker.get(i);
		}
		
	}

}
