package tw.brad.tcca;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyCopy1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("brad/coffee4.jpg");
			FileOutputStream fout = new FileOutputStream("dir1/brad.jpg");
			int r;
			while ((r = fin.read()) != -1) {
				fout.write(r);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("OK:" + (System.currentTimeMillis()-start));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	
	}

}
