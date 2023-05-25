  package CollectionFramwork;

import java.util.Comparator;

public class Employee2{
	private Integer id;
	private  String name;
	private Integer age;
	public Employee2(Integer id, String Name, Integer Age) {
		this.id = id;
		this.name = Name;
		this.age = Age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		
		return this.id +" "+this.name+" " +this.age;
	}
	
	}
class OrderByName implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
class OrderById implements Comparator<Employee2>{
@Override
public int compare(Employee2 o1, Employee2 o2){
	
	return o1.getId().compareTo(o2.getId());
}

}

class OrderByAge implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
	
		return o1.getAge().compareTo(o2.getAge());
	}
	
}


	
	


