package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {
	public static void main(String[] args) {
		
	
	ArrayList <String>l = new ArrayList();
	
	l.add("ritu madam");
	l.add("adesh sir");
	

	Iterator it = l.iterator();

	String str = l.get(0);
	String str1 = l.get(1);
	System.out.println(str);
	System.out.println(str1);
		
	}
	

}

