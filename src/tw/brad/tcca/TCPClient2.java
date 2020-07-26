package tw.brad.tcca;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient2 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("www.bradchao.com"), 80);
			BufferedInputStream bin = new BufferedInputStream(
					socket.getInputStream());
			
			byte[] buf = new byte[1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				System.out.println(new String(buf,0,len));
			}
			
			bin.close();
			socket.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
