package tw.brad.tcca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest1 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file3.txt");
			fin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
