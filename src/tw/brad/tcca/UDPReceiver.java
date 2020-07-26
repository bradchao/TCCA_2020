package tw.brad.tcca;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			String urip = packet.getAddress().getHostAddress();
			System.out.println("Receive OK:" + urip);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
