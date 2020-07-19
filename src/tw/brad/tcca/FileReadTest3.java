package tw.brad.tcca;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadTest3 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/file3.txt");
			int c;
			while ( (c = reader.read()) != -1) {
				System.out.println((char)c);
			}
			reader.close();
		} catch (Exception e) {
			
		}
	}

}
