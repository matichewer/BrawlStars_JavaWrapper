package Main;

import org.json.JSONObject;

import Logic.APIConnection;

public class Main {

	public static void main(String[] args) {
		
		
		// Tests
		APIConnection api = new APIConnection();
		
		JSONObject jsonPlayer = api.getJsonPlayer("23U2VYCYV");
		System.out.println(jsonPlayer.toString(4));
				
//		JSONObject jsonPlayerBattlelog = api.getJsonPlayerBattlelog("23U2VYCYV");
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
		
		
		
		
		
	}

}
