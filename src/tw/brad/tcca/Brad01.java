package tw.brad.tcca;

import tw.brad.utils.MySuper;

public class Brad01 {
	public static void main(String[] args) {
		double a = 12;
		MySuper mySuper = new MySuper(12);	// 12 => 12.0
		mySuper.m1();
		
		MySub1 mySub1 = new MySub1();
		mySub1.m1();
		
	}
}

class MySub1 extends MySuper {
	MySub1(){
		// super();
		super(12);
		System.out.println("MySub1()");
	}
}
