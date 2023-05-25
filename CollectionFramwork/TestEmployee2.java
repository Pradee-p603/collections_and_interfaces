package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee2 {
	public static void main(String[] args) {
		Employee2 e2 = new Employee2(1, "shivam", 22);
		Employee2 e3 = new Employee2(2, "mangal", 23);
		Employee2 e4  = new Employee2(3, "adesh", 24);
		Employee2 e5  = new Employee2(4, "Shalini", 25);
		Employee2 e6 = new Employee2(5, "ritu", 29);
		
		
		
		ArrayList list = new ArrayList();
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
	
	//System.out.println(list);
		Collections.sort( list,new OrderByAge() );
		for (Object object : list) {
			System.out.println(object);
			
		}
		System.out.println("\t");
		 
		Collections.sort(list, new OrderById());
		
		for (Object object : list) {
			System.out.println(object);
			
		}
		
	
		
	}

	

}
