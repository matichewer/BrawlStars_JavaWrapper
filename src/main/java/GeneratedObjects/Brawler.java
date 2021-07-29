package GeneratedObjects;

import java.util.List;

public class Brawler {

	private String name;
	private List<String> gadgets;
	private List<String> starPowers;
	
	
	public Brawler(String name) {
		this.name = name;
	}
	
	public boolean addGadget(String gadget){
		gadgets.add(gadget);
		return true;
	}
	
	public boolean addStarPower(String starPower){
		starPowers.add(starPower);
		return true;
	}
	
	public int cantGadgets() {
		return gadgets.size();
	}
	
	public int cantStarPowers() {
		return starPowers.size();
	}
	
}
