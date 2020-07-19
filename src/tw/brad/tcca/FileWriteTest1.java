package tw.brad.tcca;

import java.io.FileOutputStream;

public class FileWriteTest1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file4.txt");
			fout.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
