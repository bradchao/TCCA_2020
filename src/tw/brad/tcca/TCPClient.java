package tw.brad.tcca;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("10.30.3.96"), 7777);
			BufferedInputStream bin = new BufferedInputStream(
					socket.getInputStream());
			BufferedOutputStream bout = new BufferedOutputStream(
					new FileOutputStream("dir1/brad.jpg"));
			byte[] buf = new byte[4*1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			bout.flush();
			bout.close();
			
			bin.close();
			socket.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
