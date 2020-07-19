package tw.brad.tcca;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyCopy2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("brad/coffee4.jpg");
			FileOutputStream fout = new FileOutputStream("dir1/brad.jpg");
			int len; byte[] buf = new byte[4*1024];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
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
