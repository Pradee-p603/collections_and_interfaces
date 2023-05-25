package CollectionFramwork;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetElement {
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add(2);
		s.add(3);
		s.add(1);
		
		System.out.println(s);
		
		for (Object ele : s) {
			System.out.println(ele);
			
		}
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(2));
		System.out.println(s.tailSet(1));
		
		
	}
	

}
