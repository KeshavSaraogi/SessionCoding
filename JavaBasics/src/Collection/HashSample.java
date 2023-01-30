package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Keshav");
		hs.add("Vijay");
		hs.add("Raj");
		hs.add("Marco");
		hs.add("Gordon");
		
		Iterator<String> it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
