package tw.brad.tcca;

public class MyOOTest {

	public static void main(String[] args) {
		//MyAbs obj1 = new MyAbs();
		MyAbs obj2 = new MySub2();
		MyAbs obj3 = new MySub3();
		obj2.m3();
		obj3.m3();
	}

}

abstract class MyAbs {
	void m1() {}
	int m2() {return 1;}
	abstract void m3();
}
class MySub2 extends MyAbs {
	void m3() {System.out.println("m3(A)");}
}
class MySub3 extends MyAbs {
	void m3() {System.out.println("m3(B)");}
}

class Super1 {
	private int m1() {
		System.out.println("Super1:m1()");
		return 1;
	}
	Object m2() {
		return "";
	}
	
	int m3() {
		return 1;
	}
	String m4(){
		return ""; //new Object();
	}
}

class Sub1 extends Super1 {
	protected byte m1() {
		System.out.println("Sub:m1()");
		return 1;
	}
	private int m1(int a) {
		System.out.println("Sub:m1()");
		return 1;
	}
	String m2() {
		return "";
	}
}



