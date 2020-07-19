package tw.brad.tcca;

import java.io.File;

public class MyFileTest {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
		
		File test1 = new File("C:/test1");
		if (test1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}
}
