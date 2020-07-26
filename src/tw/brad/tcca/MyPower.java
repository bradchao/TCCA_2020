package tw.brad.tcca;

import java.util.HashSet;
import java.util.Iterator;

public class MyPower {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*38+1));
		}
		
		for (Integer i: set) {
			System.out.println(i);
		}
		
		
		System.out.println((int)(Math.random()*8+1));
	}

}
