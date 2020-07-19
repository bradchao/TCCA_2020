package tw.brad.tcca;

public class MyTest1 {

	public static void main(String[] args) {
		MyTest11 obj1 = new MyTest11("Brad");
		MyTest11 obj2 = new MyTest11("Brad");
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
class MyTest11 {
	private String name;
	MyTest11(String name){this.name = name;}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(obj.toString());
	}
}
