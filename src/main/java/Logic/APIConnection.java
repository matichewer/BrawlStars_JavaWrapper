package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONObject;

public class APIConnection {
	
	private String keyAPI;
	

	public APIConnection() {
		// guardar keyapi en variable
	}
	
	
	public JSONObject getJsonPlayer(String tag) {
		
		JSONObject toReturn = null;
		String link = "https://api.brawlstars.com/v1/players/%" + tag;
		
		try {
			
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
	        http.setRequestMethod("GET");
			http.setRequestProperty("Authorization","Bearer "+ keyAPI);
	        http.setRequestProperty("Content-Type","application/json");	        
	        System.out.println("Status de la conexion:  " + http.getResponseCode() + " " + http.getResponseMessage());

	        
	        // Si la conexion es correcta preparo el JSON, sino retorno null
	        if(http.getResponseCode() == 200) {
	        	
	  			BufferedReader br  = new BufferedReader(new InputStreamReader(http.getInputStream(), Charset.forName("UTF-8")));
	  			StringBuilder sb = new StringBuilder();
	  			String line;
	  			while ((line = br.readLine()) != null) 
	  				sb.append(line);	  
	  			http.disconnect();    	  
	  			toReturn = new JSONObject(sb.toString());
	  			
	        }
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return toReturn;
		
	}
}
