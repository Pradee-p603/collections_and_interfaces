package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {


		ArrayList l = new ArrayList();
		l.add(0, "green");
		l.add(1, 20.0);
		l.add(2, 12);
		l.add(3, "blue");
		l.add(4, "red");

		
		
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		l.set(1, "orange");
		System.out.println(l);
		
		
		//System.out.println(l.subList(1, 3));
		
	
		System.out.println(	l.indexOf("orange"));
		System.out.println(l.lastIndexOf(12));
	}

}
