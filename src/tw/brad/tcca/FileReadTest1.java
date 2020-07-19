package tw.brad.tcca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest1 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file3.txt");

			int temp;
			while ( (temp = fin.read()) != -1) {
				System.out.print((char)temp);
			}
			
			fin.close();
			//System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
