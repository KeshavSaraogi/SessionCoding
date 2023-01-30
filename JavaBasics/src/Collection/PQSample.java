package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		//First In First Out
		//Random Order
		
		pq.add("Keshav");
		pq.add("Vijay");
		pq.add("Raj");
		pq.add("Marco");
		pq.add("Gordon");
		
		Iterator<String> it = pq.iterator();
		
		System.out.println(pq.element()); // if the element is empty, it will throw No Such Element exception 
		System.out.println(pq.peek());    // if thr element is empty, it will return Null
		
		System.out.println("----------------");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		pq.remove(); // if empty, return No Such Element Exception
		pq.poll();   // if empty, return null 
		
		System.out.println("----------------");
		
		Iterator<String> itTwo = pq.iterator();
		while (itTwo.hasNext()) {
			System.out.println(itTwo.next());
		}
	}

}
