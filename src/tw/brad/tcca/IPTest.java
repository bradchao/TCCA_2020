package tw.brad.tcca;

import java.net.InetAddress;

public class IPTest {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.tcca.org.tw");
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
