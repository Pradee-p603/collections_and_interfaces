package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SreamSorted {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Stream<String> stream = list.stream();
		
		list.stream().sorted().forEach(e ->{
			
		System.out.println(e);});
		
	
	}

}
