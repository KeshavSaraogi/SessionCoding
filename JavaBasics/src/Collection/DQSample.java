package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQSample {
	
	
	//Array Deque is a class derived from deque interface
	public static void main(String[] args) {

		//advantage over the normal implementation; 
		//already provided with the overriding method;
		//can access both deque and arraydequqe methods instead of only arraydeque methods;
		//left - interface right - class;
		Deque<String> dq = new ArrayDeque<String>(); 
		dq.offer("Vijay");
		dq.offer("Sai");
		dq.offer("Keshav");
		dq.offerFirst("Raj");
		dq.offerLast("Shivam");
		dq.offer("Malvi");
		dq.offerFirst("John");
		
		for (String s: dq) {
			System.out.println(s);
		}
		
		dq.pollLast();
		System.out.println("===================");
		for (String s: dq) {
			System.out.println(s);
		}
	}

}