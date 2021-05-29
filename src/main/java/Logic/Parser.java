package Logic;

import org.json.JSONObject;

import GeneratedObjects.Jugador;

public class Parser {

	private APIConnection api;
	
	
	public Parser() {
		api = new APIConnection();
	}
	
	public Jugador generarJugador(String tag) {
		JSONObject json = api.getJsonPlayer(tag);
		Jugador jugador = new Jugador();
		jugador.setTag(json.getString("tag"));
		jugador.setNombre(json.getString("name"));
		jugador.setTrofeos(json.getInt("trophies"));
		jugador.setTrofeosMax(json.getInt("highestTrophies"));
		jugador.setNivel(json.getInt("expLevel"));
		jugador.setExp(json.getInt("expPoints"));
		jugador.setWonChampionshipChallenge(json.getBoolean("isQualifiedFromChampionshipChallenge"));
		jugador.setVictorias3vs3(json.getInt("3vs3Victories"));
		jugador.setVictoriasSolo(json.getInt("soloVictories"));
		jugador.setVictoriasDuo(json.getInt("duoVictories"));		
		jugador.setMaxLvlIrrupcionUrbana(json.getInt("bestRoboRumbleTime"));
		jugador.setMejorTiempoMegaBrawler(json.getInt("bestTimeAsBigBrawler"));
		return jugador;
	}
	
	
	
	
}
