package tw.brad.tcca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.net.ssl.HttpsURLConnection;

public class HttpTest3 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
				//System.out.println(line);
			}
			reader.close();
			//System.out.println("len:" + sb.length());
			parseJSON(sb.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	
	}
	// https://github.com/stleary/JSON-java
	
	static void parseJSON(String json) {
		try {
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String name = row.getString("Name");
				String tel = row.getString("Tel");
				System.out.println(name + ":" + tel);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
