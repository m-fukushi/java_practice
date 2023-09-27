package practice;

public class Sword implements Cloneable {
	private String name;
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
	
	public Sword(String s) {
	 this.name = s;
	}
	
	public Sword() {
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
	 this.name = s;
	}
	
}
