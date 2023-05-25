package CollectionFramwork;

public class Employee {
	private int id ;
	private String name;
	private int age;
	
	
	Employee(int id, String name, int age){
		this.id = id;
		this.age = age;
		this.name = name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id= id;
}
public int getId() {
	return id;
}
public void setAge(int age) {
	this.age = age;
}
 public int getAge(){
	return age;
}
 @Override
public String toString() {
	
	return this.id +" "+ this.name +" "+ this.age;
}
}

