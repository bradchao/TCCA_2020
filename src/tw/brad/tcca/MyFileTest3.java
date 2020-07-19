package tw.brad.tcca;

import java.io.File;

public class MyFileTest3 {

	public static void main(String[] args) {
		File file1 = new File("brad/file1.txt");
		File file2 = new File("brad/file1.txt");
		System.out.println(file1.equals(file2));
		System.out.println(file1 == file2);
		File file3 = new File("brad/file3.txt");
		System.out.println(file1.renameTo(file3));
		
	}

}
