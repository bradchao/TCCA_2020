package tw.brad.tcca;

import java.net.DatagramSocket;

public class UDPSender {

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			socket.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
