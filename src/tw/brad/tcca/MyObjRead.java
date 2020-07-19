package tw.brad.tcca;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyObjRead {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/s1.brad");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			oin.close();
			System.out.println(s1.score());
			System.out.println(s1.avg());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
