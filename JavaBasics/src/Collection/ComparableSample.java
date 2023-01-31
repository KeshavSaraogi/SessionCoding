package Collection;

import java.util.TreeSet;

public class ComparableSample {
		//Sorting the list and making sure that there are no duplicate values
		//handle the sorting automatically
		//Difference between Comparable and Comparator - very important
	
	public static void main(String[] args) {
		TreeSet<User> ts = new TreeSet<User>();
		ts.add(new User("keshav"));
		ts.add(new User("shreyaskar"));
		ts.add(new User("yash"));
		ts.add(new User("vijay"));
		
		for (User user: ts) {
			System.out.println(user);
		}
	}
	
}

class User implements Comparable<User>{
	private String userName;

	public User(String userName) {
		this.userName = userName;
	}

	public String getUserNam() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int compareTo(User u) {
		return this.userName.compareTo(u.userName);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.userName;
	}
}
