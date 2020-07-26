package tw.brad.tcca;

import java.util.HashSet;

public class MySetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(11);
		set.add(123);	// int => auto-boxing => Integer Object
		set.add(123);
		System.out.println(set.size());
		System.out.println(set.toString());
	}

}
