package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		
		vc.add("Keshav");
		vc.add("Vijay");
		vc.add("Raj");
		vc.add("Marco");
		vc.add("Gordon");
		
		vc.addElement("Puck");
		
		Enumeration<String> ee = vc.elements();
		while (ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}

	}

}
