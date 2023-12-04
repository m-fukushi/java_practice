package practice;
import java.io.Serializable;
import java.util.Objects;

public class Hero implements Cloneable,Serializable{
	private String name;	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int hp;
	Sword sword;
	private int mp;

	public int hashCode() {
		return Objects.hash(this.name,this.getHp());
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.setHp(this.getHp());
		result.sword = this.sword.clone();
		return result;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword s) {
	 this.sword = s;
	}
	
	public Hero(String s) {
		
	}
	public Hero() {
		
	}
	public Hero(String name,int hp,int mp) {
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}


}