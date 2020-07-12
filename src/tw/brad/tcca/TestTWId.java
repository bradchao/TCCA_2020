package tw.brad.tcca;

import tw.brad.utils.TWId;

public class TestTWId {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(21);
		TWId id4 = new TWId(true, 1);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println("------");
		TWId id5 = TWId.createTWId("Brad");
		if (id5 != null) {
			if (TWId.isRightID(id5.getId())) {
				System.out.println("OK");
			}else {
				System.out.println("XX");
			}
		}else {
			System.out.println("xxxxxxx");
		}
	}

}
