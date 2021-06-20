package GeneratedObjects;

import org.json.JSONObject;

import Logic.APIConnection;

public class Club {


	private String tag;
	private String nombre;
	
	public Club(String tag) {
		
		// Instancio API para poder hacer consultas sobre el club
		APIConnection api = new APIConnection();
		
		// Realizo la consulta y la guardo en objeto json
		JSONObject json = api.getJsonClub(tag);
		
		// Asigno todos los atributos
		this.tag = tag;
		nombre = json.getString("name");
		
	}
	
	
	@Override
	public String toString() {
		return "Club:\n\ntag: " + tag + "\nnombre: " + nombre;
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
	
	
	
}
