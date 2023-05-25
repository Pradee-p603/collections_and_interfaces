package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class itrator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Shivam mandloi");
		list.add("red");
		list.add(14);
		list.add("green");
		list.add(500);
		list.add("orange");

		Iterator it = list.iterator();
		// list.add("shayam");
		// when we perform more than one operation on a list at the same timed then
		// java.util.ConcurrentModificationException will arise
		// it is called failfast situation

		// System.out.println((it.hasNext()));
		while (it.hasNext()) {
			Employee1 e = (Employee1) it.next();
			System.out.println(e.getName());

			System.out.println(e.getId());
			System.out.println(e.getAge());

			// System.out.println(it.next());

		}

	}

}
