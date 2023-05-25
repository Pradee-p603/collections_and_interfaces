package CollectionFramwork;

import java.util.*;

public class Enumerationn {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Shivam");
		v.add("pradeep");
		v.add(12345);
		v.add(123098);
		v.add("mandloi ji");
		v.add("green");
		v.add("blue");
		
	Enumeration en = v.elements();
	// nSystem.out.println(en.hasMoreElements());
	v.add("shree");
	//here no exception arise so it is called fail safe 
	while (en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	}

}
