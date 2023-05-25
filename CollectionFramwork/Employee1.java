package CollectionFramwork;

public class Employee1 implements Comparable<Employee1> {
	private Integer id;
	private String name;
	private Integer age;

	public Employee1(int id, String name, int age) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

		return this.id + " " + this.name + " " + this.age;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Employee1)) {
			return false;
		}
		Employee1 e = (Employee1) o;

		if (this.name == e.name && this.id == e.id && this.age.intValue() == e.age.intValue()) {

			return true;
		} else {
			return false;
		}

		// return this.name == e.name && this.id == e.id && this.age == e.age;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode() + name.hashCode() + age.hashCode();
	}

	@Override
	public int compareTo(Employee1 o) {

		if(this.id == o.id && this.age == o.age) {
			return this.name.compareTo(o.name);
		} else {
			return this.id.compareTo(o.id);
		}

	}

}
