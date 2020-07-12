package tw.brad.tcca;

public class MyRegexTest {

	public static void main(String[] args) {
		String a = "A12345678";
		if (a.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
