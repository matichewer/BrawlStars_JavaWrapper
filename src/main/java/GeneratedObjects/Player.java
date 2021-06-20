package GeneratedObjects;

import org.json.JSONObject;

import Logic.APIConnection;

public class Player {
	
	private String tag;
	private String nombre;
	private int trofeos;
	private int trofeosMax;
//	private int highestPowerPlayPoints;   // deprecated ?
	private int nivel;
	private int exp;
	private boolean wonChampionshipChallenge;
	private int victorias3vs3;
	private int victoriasSolo;
	private int victoriasDuo;
	private int maxLvlIrrupcionUrbana; // dinosaurio
	private int mejorTiempoMegaBrawler;
	private Club club;
	
	
	public Player(String tag) {
		
		// Instancio API para poder hacer consultas sobre el jugador
		APIConnection api = new APIConnection();
		
		// Realizo la consulta y la guardo en objeto json
		JSONObject json = api.getJsonPlayer(tag);
		
		// Asigno todos los atributos
		this.tag = tag;
		nombre = json.getString("name");
		trofeos = json.getInt("trophies");
		trofeosMax = json.getInt("highestTrophies");
		nivel = json.getInt("expLevel");
		exp = json.getInt("expPoints");
		wonChampionshipChallenge = json.getBoolean("isQualifiedFromChampionshipChallenge");
		victorias3vs3 = json.getInt("3vs3Victories");
		victoriasSolo = json.getInt("soloVictories");
		victoriasDuo = json.getInt("duoVictories");		
		maxLvlIrrupcionUrbana = json.getInt("bestRoboRumbleTime");
		mejorTiempoMegaBrawler = json.getInt("bestTimeAsBigBrawler");
		
		// Si tiene club, lo asigno
		if(json.getJSONObject("club").has("tag")) {
			club = new Club(json.getJSONObject("club").getString("tag"));
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Jugador:\n\ntag: " + tag + "\nnombre: " + nombre + "\ntrofeos: " + trofeos + "\ntrofeosMax: "
				+ trofeosMax + "\nnivel: " + nivel + "\nexp: " + exp + "\nwonChampionshipChallenge: "
				+ wonChampionshipChallenge + "\nvictorias3vs3: " + victorias3vs3 + "\nvictoriasSolo: " + victoriasSolo
				+ "\nvictoriasDuo: " + victoriasDuo + "\nmaxLvlIrrupcionUrbana: " + maxLvlIrrupcionUrbana
				+ "\nmejorTiempoMegaBrawler: " + mejorTiempoMegaBrawler + "\nclub: " + club;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTrofeos() {
		return trofeos;
	}
	public void setTrofeos(int trofeos) {
		this.trofeos = trofeos;
	}
	public int getTrofeosMax() {
		return trofeosMax;
	}
	public void setTrofeosMax(int trofeosMax) {
		this.trofeosMax = trofeosMax;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public boolean isWonChampionshipChallenge() {
		return wonChampionshipChallenge;
	}
	public void setWonChampionshipChallenge(boolean wonChampionshipChallenge) {
		this.wonChampionshipChallenge = wonChampionshipChallenge;
	}
	public int getVictorias3vs3() {
		return victorias3vs3;
	}
	public void setVictorias3vs3(int victorias3vs3) {
		this.victorias3vs3 = victorias3vs3;
	}
	public int getVictoriasSolo() {
		return victoriasSolo;
	}
	public void setVictoriasSolo(int victoriasSolo) {
		this.victoriasSolo = victoriasSolo;
	}
	public int getVictoriasDuo() {
		return victoriasDuo;
	}
	public void setVictoriasDuo(int victoriasDuo) {
		this.victoriasDuo = victoriasDuo;
	}
	public int getMaxLvlIrrupcionUrbana() {
		return maxLvlIrrupcionUrbana;
	}
	public void setMaxLvlIrrupcionUrbana(int maxLvlIrrupcionUrbana) {
		this.maxLvlIrrupcionUrbana = maxLvlIrrupcionUrbana;
	}
	public int getMejorTiempoMegaBrawler() {
		return mejorTiempoMegaBrawler;
	}
	public void setMejorTiempoMegaBrawler(int mejorTiempoMegaBrawler) {
		this.mejorTiempoMegaBrawler = mejorTiempoMegaBrawler;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}		
	
}
