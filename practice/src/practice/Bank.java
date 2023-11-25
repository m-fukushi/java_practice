package practice;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Bank {
	String name;
	String address;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
		
	}
	
	public int hashCode(Object o) {
		return HashCodeBuilder.reflectionHashCode(this);
		
	}
}
