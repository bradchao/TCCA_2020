package tw.brad.tcca;

public class PlayString {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {65,66,67,68};
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
		String s3 = "Brad";
		System.out.println("".length());
		System.out.println("Hello, World".length());
		String s4 = "Brad";
		System.out.println(s3 == s4);
		String s5 = new String("Brad");
		String s6 = new String("Brad");
		System.out.println(s5 == s6);
		
		String test1 = "abcsefg";
		System.out.println(test1.indexOf('x'));
		
		
		
	}

}
