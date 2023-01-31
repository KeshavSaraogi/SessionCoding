package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ALSample {

	public static void main(String[] args) {
		
		JavaBean jb = new JavaBean("Keshav", 23);
		System.out.println(jb.getAge() + " " + jb.getName());
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Keshav");
		al.add("Vijay");
		al.add("Raj");
		al.add("Marco");
		al.add("Gordon");
		
		ArrayList<String> alTwo = new ArrayList<String>();
		alTwo.add("Magnus");
		alTwo.add("Hikaru");
		alTwo.add("Ian");
		
		al.addAll(alTwo);
		
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
