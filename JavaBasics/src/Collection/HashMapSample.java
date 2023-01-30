package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm= new HashMap<Integer, String>();
		hm.put(100, "Vijay");
		hm.put(75, "Dhrashti");
		hm.put(null, "Vijay");
		hm.put(125, "Sai");
		hm.put(115, "Dhrashti");
		hm.put(null, "Anu");
		hm.put(150, null);
		hm.put(135, "Sharmi");
		hm.put(200, null);
		
		//not sort the keys
		//will allow only one key
		//keys should be unique
		
		for (Map.Entry<Integer, String> me: hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

}
