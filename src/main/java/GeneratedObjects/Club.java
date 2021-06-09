package GeneratedObjects;

public class Club {


	private String tag;
	private String nombre;
	
	public Club() {
		tag = "";
		nombre = "";
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
