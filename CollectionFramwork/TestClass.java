package CollectionFramwork;

import java.util.ArrayList;

public class TestClass {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"pushpa",22);
		Employee e2 = new Employee(2,"golu",24);
		Employee e3 = new Employee(3,"molu",25);
		Employee e4 = new Employee(4,"sonu",26);
		Employee e5 = new Employee(5,"choumu",27);
		
		System.out.println(e1);
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getId());
		
		
		Employee e =(Employee)list.get(1);
		System.out.println(e);
		
	}

}
