import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Controller {

	public static void main(String[] args) {

		String myPaste = "Mohammed is the best";
		String urlOfPaste = makePaste(myPaste);
		System.out.println(urlOfPaste);

		// Tells connection object how to behave
		// Establishing the connection
	}
	
	public static String makePaste(String pasteText) {
		String line, response = "";
		
		try {
			URL url = new URL("https://pastebin.com/api/api_post.php");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			// connection configuration
			// Time is in milliseconds
			// If it takes longer than 5 seconds send information to the server or receive
			// information then drop out and end the connection
			connection.setReadTimeout(5000);
			connection.setConnectTimeout(5000);
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			
			// Because we are sending data first thing we need is a stream writer - lets us
			// send things
			OutputStream os = connection.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
			
			String reqParams = "api_dev_key="+AppConstants.APIKEY+"&api_option=paste&api_paste_code="+pasteText;
			writer.write(reqParams);
			
			// bad manners - should always flush the stream
			writer.flush();
			writer.close();
			os.close();
			
			// was the connection successful?
			int responseCode = connection.getResponseCode();
			
			// HTTP_OK IS 200 IS A CONSTANT AS IT ALWAYS STAYS THE SAME
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				// Talk to the server don't stop until it sends you EOF (end of file) - Get me
				// everything the server is sending back to me
				while ((line = br.readLine()) != null) {
					response += line;
				}
			}
			
			else {
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				// Talk to the server don't stop until it sends you EOF (end of file) - Get me
				// everything the server is sending back to me
				while ((line = br.readLine()) != null) {
					response += line;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
}
}

