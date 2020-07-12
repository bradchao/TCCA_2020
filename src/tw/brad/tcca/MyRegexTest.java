package tw.brad.tcca;

import tw.brad.utils.TWId;

public class MyRegexTest {
	
	
	
	public static void main(String[] args) {
		String a = "A123456789";
		if (a.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		if(TWId.isRightID("B123460300")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
	}

}
