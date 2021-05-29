package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONObject;

public class APIConnection {
	
	private String token;
	private int statusID;
	private String statusReason;
	

	public APIConnection() {
		token = null;
		statusID = 0;
		statusReason = null;
		
		leerTokenBrawlStars();
		
	}
	
	
	private void leerTokenBrawlStars() {		
		// Obtengo el token privado para hacer uso de la API del Brawl Stars
		try {			
			File archivoToken = new File ("token.api");
			FileReader fr = new FileReader (archivoToken);
			BufferedReader br = new BufferedReader(fr);
			token = br.readLine();
			br.close();
			fr.close();			
		} catch (IOException e) {
			statusID = 1;
			statusReason = "Can't obtein private token.";
			e.printStackTrace();
		}		
	}
	
	private JSONObject generateJSON(String link) {

		JSONObject json = null;
		
		try { 
			
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
	        http.setRequestMethod("GET");
			http.setRequestProperty("Authorization","Bearer "+ token);
	        http.setRequestProperty("Content-Type","application/json");	
	        
	        statusID = http.getResponseCode();
	        statusReason = http.getResponseMessage();
	        
			System.out.println("Link: " + link);
	        System.out.println("Status de la conexion:  " + statusID + " " + statusReason + "\n");

	        // Si la conexion es correcta preparo el JSON, sino mantengo null
	        if(http.getResponseCode() == 200) {
	        	
	  			BufferedReader br  = new BufferedReader(new InputStreamReader(http.getInputStream(), Charset.forName("UTF-8")));
	  			json = new JSONObject(br.readLine());
	  			
	  			http.disconnect();   
	  			br.close();	 	  			
	        }	
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return json;
	}
	
	
	
	// PLAYERS
	public JSONObject getJsonPlayer(String tag) {		
		String link = "https://api.brawlstars.com/v1/players/%23" + tag;		
		return generateJSON(link);
	}
	
	public JSONObject getJsonPlayerBattlelog(String tag) {		
		String link = "https://api.brawlstars.com/v1/players/%23" + tag + "/battlelog";		
		return generateJSON(link);
	}
	
	
	
	// CLUBS
	public JSONObject getJsonClub(String tag) {		
		String link = "https://api.brawlstars.com/v1/clubs/%" + tag;
		return generateJSON(link);
	}
	
	public JSONObject getJsonClubMembers(String tag) {		
		String link = "https://api.brawlstars.com/v1/clubs/%" + tag + "/members";
		return generateJSON(link);
	}
	
	
	
	// BRAWLERS
	public JSONObject getJsonBrawlers() {		
		String link = "https://api.brawlstars.com/v1/brawlers";
		return generateJSON(link);
	}
	
	public JSONObject getJsonBrawlerID(String idBrawler) {		
		String link = "https://api.brawlstars.com/v1/brawlers/" + idBrawler;
		return generateJSON(link);
	}

	
	
	// RANKINGS
	public JSONObject getJsonRankPlayers(String idPais) {		
		String link = "https://api.brawlstars.com/v1/rankings/ " + idPais + "/players"; 
		return generateJSON(link);
	}
	
	public JSONObject getJsonRankBrawler(String idPais, String idBrawler) {		
		String link = "https://api.brawlstars.com/v1/rankings/" + idPais + "/brawlers/" + idBrawler; 
		return generateJSON(link);
	}
	
	public JSONObject getJsonRankClub(String tag) {		
		String link = "https://api.brawlstars.com/v1/rankings/" + tag + "/clubs"; 
		return generateJSON(link);
	}
	
	public JSONObject getJsonRankPowerPlaySeasons(String idPais) {		
		String link = "https://api.brawlstars.com/v1/rankings/" + idPais + "/powerplay/seasons"; 
		return generateJSON(link);
	}
	
	public JSONObject getJsonRankPowerPlaySpecificSeason(String idPais, String idSeason) {		
		String link = "https://api.brawlstars.com/v1/rankings/" + idPais + "/powerplay/seasons/" + idSeason; 
		return generateJSON(link);
	}
	
}
