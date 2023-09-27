package practice;
import java.util.Objects;

public class Hero implements Cloneable{
	public String name;	
	int hp;
	Sword sword;

	public int hashCode() {
		return Objects.hash(this.name,this.hp);
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
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
	
}