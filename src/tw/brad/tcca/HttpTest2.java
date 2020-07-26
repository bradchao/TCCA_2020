package tw.brad.tcca;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.sun.net.ssl.HttpsURLConnection;

public class HttpTest2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/uu/api/res/1.2/1zoUqvjBPihslQETqf2sFg--~B/Zmk9dWxjcm9wO2N3PTExNTI7ZHg9MjtjaD02NDc7ZHk9MjAzO3c9MzkyO2g9MzA4O2NyPTE7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/ko/udn.com/4ca53e851a72f56b28fd0226052d690e");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();

			FileOutputStream fout = new FileOutputStream("dir1/test.jpg");
			byte[] buf = new byte[4*1024];
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			int len;
			while ( (len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			bin.close();
			fout.flush();
			fout.close();
			
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	
	}

}
