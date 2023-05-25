package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamFilter {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		Stream<String> stream = list.stream();
		list.stream().filter(e -> e.startsWith("f")).distinct().map(e ->
		e.toUpperCase()).sorted().forEach(e -> {
			System.out.println(e);
		});
	}

}
