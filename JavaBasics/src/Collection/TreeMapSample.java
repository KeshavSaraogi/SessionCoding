package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		
		TreeMap <Integer, String> hm= new TreeMap<Integer, String>();
		hm.put(100, "Vijay");
		hm.put(75, "Dhrashti");
		//hm.put(null, "Vijay");
		hm.put(125, "Sai");
		hm.put(115, "Dhrashti");
		//hm.put(null, "Anu");
		hm.put(150, null);
		hm.put(135, "Sharmi");
		hm.put(200, null);
		
		//will sort the keys
		//will not allow null key
		//only one key of each type
		//keys should be unique
		
		for (Map.Entry<Integer, String> me: hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}
