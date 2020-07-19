package tw.brad.tcca;

import java.io.File;
import java.io.IOException;

public class MyFileTest2 {

	public static void main(String[] args) {
		File brad = new File("brad");
		if (!brad.exists()) {
			brad.mkdir();
		}else {
			System.out.println("Exist");
		}
		
		File subBrad = new File("brad/dir1/dir2/dir3");
		System.out.println(subBrad.mkdirs());
		
		File file1 = new File("brad/file1.txt");
		if (!file1.exists()) {
			try {
				System.out.println(file1.createNewFile());
				System.out.println("OK");
			}catch (IOException e) {
				System.out.println("XXXXXX");
			}
		}
		
		
		
		
		
		
	}

}
