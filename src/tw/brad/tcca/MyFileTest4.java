package tw.brad.tcca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyFileTest4 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/test1.csv");
			InputStreamReader inr = new InputStreamReader(fin);
			BufferedReader reader = new BufferedReader(inr);
			String line = reader.readLine();
			String[] data = line.split(",");
			for (String item : data) {
				System.out.println(item);
			}
			fin.close();
		}catch(Exception e) {
			
		}
		
				
	}

}
