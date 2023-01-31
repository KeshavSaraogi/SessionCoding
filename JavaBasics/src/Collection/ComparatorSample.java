package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {

	public static void main(String[] args) {
		TreeSet<Login> ts = new TreeSet<Login>(new UnameCompare());
		ts.add(new Login("Keshav", "Apple "));
		ts.add(new Login("Shivam", "Cherry"));
		ts.add(new Login("Shreyas", "Banana"));
		
		for (Login l: ts) {
			System.out.println(l);
		}
	}

}

class UnameCompare implements Comparator<Login> {

	@Override
	public int compare(Login l1, Login l2) {
		return l1.getUsername().compareTo(l2.getUsername());
	}
	
}

class Login {
	private String username;
	private String password;
	
	public Login(String password, String username) {
		this.password = password;
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override 
	public String toString() {
		return "Name: " + this.username + " Password " + this.password;
	}
}