package Main;

import org.json.JSONObject;

import GeneratedObjects.GameData;
import GeneratedObjects.Player;
import Logic.APIConnection;


public class Main {

	public static void main(String[] args) {
		
		
		

		
//		-------------------- INICIO TEST CLASE Parser --------------------
		
		Player player1 = new Player("U2VYCYV");
		if(player1.getStatus()) {
			System.out.println(player1.toString());		
			System.out.println("____________________________________");
		}
		
		Player player2 = new Player("9YGY2GPY0");
		if(player2.getStatus()) {
			System.out.println(player2.toString());
			System.out.println("____________________________________");
		}
		
		Player player3 = new Player("8U002G0PL");
		if(player3.getStatus()) {
			System.out.println(player3.toString());		
			System.out.println("____________________________________");
		}
	
		GameData data = new GameData();
		System.out.println("Cant brawlers: " + data.getCantBrawlers());
		System.out.println("Cant gadgets: " + data.getCantGadgets());
		System.out.println("Cant estelares: " + data.getCantStarPowers());
		

//		-------------------- FIN TEST CLASE Parser --------------------
		
		
		
		
		
		
		
		
		
//		-------------------- INICIO TEST CLASE APIConnection --------------------
		
		
//		APIConnection api = new APIConnection();
//		
//		JSONObject jsonPlayer = api.getJsonPlayer("U2VYCYV");
//		System.out.println(jsonPlayer.toString(4));
				
//		JSONObject jsonPlayerBattlelog = api.getJsonPlayerBattlelog("U2VYCYV");
//		System.out.println(jsonPlayerBattlelog.toString(5));

//		JSONObject jsonClub = api.getJsonClub("2329PVGPCLQ");
//		System.out.println(jsonClub.toString(5));

//		JSONObject jsonClubMembers = api.getJsonClubMembers("2329PVGPCLQ");
//		System.out.println(jsonClubMembers.toString(5));

//		JSONObject jsonBrawlers = api.getJsonBrawlers();
//		System.out.println(jsonBrawlers.toString(5));

//		JSONObject jsonBrawlerID = api.getJsonBrawlerID("16000000"); // ID de Shelly
//		System.out.println(jsonBrawlerID.toString(5));
		
//		JSONObject jsonRankPlayers = api.getJsonRankPlayers("AR"); // AR, global
//		System.out.println(jsonRankPlayers.toString(5));
		
//		JSONObject jsonRankBrawler = api.getJsonRankBrawler("AR", "16000000");
//		System.out.println(jsonRankBrawler.toString(5));
		
//		JSONObject jsonRankClub = api.getJsonRankClub("2329PVGPCLQ");
//		System.out.println(jsonRankClub.toString(5));
		
//		JSONObject jsonRankPowerPlaySeasons = api.getJsonRankPowerPlaySeasons("AR");
//		System.out.println(jsonRankPowerPlaySeasons.toString(5));
		
//		JSONObject jsonRankPowerPlaySpecificSeason = api.getJsonRankPowerPlaySpecificSeason("AR", "56");
//		System.out.println(jsonRankPowerPlaySpecificSeason.toString(5));

	
//		----------------------- FIN TEST CLASE APIConnection -----------------------
		
		
		
	}

}
