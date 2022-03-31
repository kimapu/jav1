package solution.lab6.q4;

import java.time.LocalDate;

public class Customer {

	private String name;
	private int age;
	private LocalDate dob;
		
	public Customer(String name, int age, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

	
	
}
