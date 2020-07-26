package tw.brad.tcca;

import java.io.BufferedOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			BufferedOutputStream bout = new BufferedOutputStream(
					socket.getOutputStream());
			OutputStreamWriter bwriter = new OutputStreamWriter(bout);
			bwriter.write("Hello, BradTCP");
			bwriter.flush();
			bwriter.close();
			server.close();
			System.out.println("send OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
