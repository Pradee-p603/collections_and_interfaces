package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee1 {
	public static void main(String[] args) {

		Employee1 e = new Employee1(1, "shivam", 128);
		Employee1 e1 = new Employee1(1, "shivam", 128);
		Employee1 e2 = new Employee1(5, "hiralal", 25);
		Employee1 e3 = new Employee1(3, "devnarayan", 26);
		Employee1 e4 = new Employee1(2, "apple", 27);

		ArrayList l = new ArrayList();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());

		System.out.println(e.equals(e1));

		Collections.sort(l);

		for (Object object : l) {

			System.out.println(object); 
 
		}

	}
}
