package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("red");
		list1.add(100);
		list1.add("black");
		list1.add("pink");
		System.out.println(list1);
		
		
		ArrayList list2 = new ArrayList();
		list2.add(122);
		list2.add("jo jeeta vhi sikander");
		list2.add("gandhiji ke teen bander");
		list2.add("yellow");
		list2.add("haraa");
		System.out.println(list2);
		list1.add("kisi ka naam"); 
		//list1.add(list2);
		System.out.println(list1);
		//list1.clear();
	  //  System.out.println("clear ="+list1);
		
		//System.out.println(list1.contains(list2));
		//System.out.println(list1.containsAll(list2));
		//System.out.println("Empty = "+ list1.isEmpty());
		//System.out.println(list1.remove(1));
		//System.out.println(list1.remove(list2));
		//System.out.println("retain = " +list1.retainAll(list2));
		System.out.println("size = " + list1.size());
		
		
	}

}
