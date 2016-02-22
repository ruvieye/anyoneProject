package http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class HttpCallTest {
	private final String USER_AGENT = "Mozilla/5.0";

	@Test
	public void sendGet() throws Exception {
		String urls = "http://localhost/index";
		URL url =null;
		HttpURLConnection conn = null;
		long start = 0L;
		long end = 0L;
		try {
			url = new URL(urls);
			conn = (HttpURLConnection) url.openConnection();
			start = System.currentTimeMillis();
			System.out.println("start : " + start);
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(1000);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", USER_AGENT);
			//conn.setDoOutput(true);
			//conn.getOutputStream();
			
			System.out.println(conn.getConnectTimeout());
			System.out.println(conn.getResponseCode());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} finally {
			end = System.currentTimeMillis();
			System.out.println("end : " + end);
			System.out.println("delay time : " + (end - start));
			conn.disconnect();

		}

	}

	@Test
	public void httpConnection() throws Exception {
		String url = "http://localhost:8080/index";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// add reuqest header
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		// String urlParameters =
		// "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		// wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		// System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}
}