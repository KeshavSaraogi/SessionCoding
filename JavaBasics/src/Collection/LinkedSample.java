package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("Magnus");
		ll.add("Hikaru");
		ll.add("Ian");
		
		ListIterator<String> it = ll.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------");
		
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
