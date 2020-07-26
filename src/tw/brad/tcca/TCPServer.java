package tw.brad.tcca;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();

			File sendFile = new File("dir1/coffee.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = new BufferedInputStream(
					new FileInputStream(sendFile));
			bin.read(buf);
			bin.close();
			
			BufferedOutputStream bout = new BufferedOutputStream(
					socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			
			
			String urip = socket.getInetAddress().getHostAddress();
			server.close();
			System.out.println("send OK:" + urip);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
