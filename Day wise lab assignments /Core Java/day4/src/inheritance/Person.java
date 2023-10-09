package inheritance;

public class Person {
//data members (state of a Person)
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//overloaded def. ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//add a method to ret Person's details
	public String getDetails() {
		return firstName+" "+lastName;
	}
}
