package tw.brad.tcca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("10.30.3.96"), 7777);
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			socket.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
