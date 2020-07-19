package tw.brad.tcca;

import java.io.FileOutputStream;

public class FileWriteTest1 {

	public static void main(String[] args) {
		String txt = "Hello, World\n1234567\n7654321";
		String txt2 = "\n電腦公會";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file4.txt", true);
			fout.write(txt2.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
