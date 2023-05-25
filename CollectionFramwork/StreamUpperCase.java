package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamUpperCase {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		Stream<String> Stream = list.stream();
		list.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
		});

	}

}
