package GeneratedObjects;

import Logic.APIConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class GameData {

	private int cantBrawlers;
	private int cantGadgets;
	private int cantStarPowers;
	private JSONObject json;
	
	public GameData() {	
		
		cantBrawlers = 0;
		cantGadgets = 0;
		cantStarPowers = 0;

		// Instancio API para poder hacer consultas sobre el club
		APIConnection api = new APIConnection();
		
		// Realizo la consulta y la guardo en objeto json
		json = api.getJsonBrawlers();
		
		if(json!=null)
			calcCants();
	}

	private void calcCants() {		
		JSONArray array = json.getJSONArray("items");
		cantBrawlers = array.length();
		for(int i=0; i<cantBrawlers; i++) {			
			JSONObject brawler = array.getJSONObject(i);
			cantGadgets = cantGadgets + brawler.getJSONArray("gadgets").length();
			cantStarPowers = cantStarPowers + brawler.getJSONArray("starPowers").length();						
		}		
	}

	public int getCantBrawlers() {
		return cantBrawlers;
	}

	public int getCantGadgets() {
		return cantGadgets;
	}

	public int getCantStarPowers() {
		return cantStarPowers;
	}
	
	
}
