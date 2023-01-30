package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		
		//maintains order - ascending
		//no duplicates
		ts.add("Keshav");
		ts.add("Vijay");
		ts.add("Raj");
		ts.add("Marco");
		ts.add("Gordon");
		
		Iterator<String> it = ts.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
