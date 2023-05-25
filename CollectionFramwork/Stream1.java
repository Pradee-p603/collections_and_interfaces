package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1{
	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		 list.add("one");
		 list.add("Two");
		 list.add("Three");
		 list.add("four");
		 list.add("five");
		 
	Stream<String> stream = list.stream();
	stream.forEach(e ->{
		System.out.println(e);
		});
		 
		 
		 
	}

}
