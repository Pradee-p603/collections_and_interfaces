package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("bura mat dekho");
		c.add(14);
		c.add(true);
		
		System.out.println("Lengt of collection = "+ c.size());
		for (Object ele : c) {
			System.out.println(ele);}
		
			Object [] oArray = c.toArray();
			//print all element of aaray
		for (Object ele: c) {
				String s = (String) ele;
			System.out.println(s);

		}
			System.out.println(c.add("pradee"));;
	System.out.println(c.addAll(c));
			System.out.println();
			
		}
			
		}
		
	



