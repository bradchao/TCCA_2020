package tw.brad.tcca;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) {
		while (true) {
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				String urip = packet.getAddress().getHostAddress();
				byte[] row = packet.getData();
				int len = packet.getLength();
				String mesg = new String(row,0,len);
				System.out.println(urip + ":" + mesg);
				if (mesg.equals("exit")) {
					break;
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
