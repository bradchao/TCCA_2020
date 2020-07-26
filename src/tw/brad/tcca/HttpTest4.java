package tw.brad.tcca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.net.ssl.HttpsURLConnection;

public class HttpTest4 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.nhi.gov.tw/resource/mask/maskdata.csv");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			reader.readLine();
			while ( (line = reader.readLine()) != null) {
				// line => parse
				String[] data = line.split(",");
				System.out.println(data[1] + ":Adult:" + data[4] + ":Child:" + data[5]);
			}
			reader.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	
	}
	
}
