package GeneratedObjects;

public class Jugador {

	
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
	
	
	public Jugador() {
		tag = "";
		nombre = "";
		trofeos = 0;
		trofeosMax = 0;
		nivel = 0;
		exp = 0;
		wonChampionshipChallenge = false;
		victorias3vs3 = 0;
		victoriasDuo = 0;
		victoriasSolo = 0;
		maxLvlIrrupcionUrbana = 0;
		mejorTiempoMegaBrawler = 0;
		club = null;
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
