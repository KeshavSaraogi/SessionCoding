package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Hashtable <Integer, String> hm= new Hashtable<Integer, String>();
		hm.put(100, "Vijay");
		hm.put(75, "Dhrashti");
		hm.put(125, "Sai");
		hm.put(115, "Dhrashti");
		//hm.put(150, null);
		hm.put(135, "Sharmi");
		//hm.put(200, null);
		
		//will sort the keys
		//will not allow null key and value
		//keys should be unique
		//it is synchronized - thread safe
		
		for (Map.Entry<Integer, String> me: hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
