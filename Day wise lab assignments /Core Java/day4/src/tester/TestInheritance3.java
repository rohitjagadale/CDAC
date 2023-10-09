package tester;

import inheritance.*;

//Test ctro invocation , in inh hierarchy + super(...)
public class TestInheritance3 {

	public static void main(String[] args) {
		//sub class ref --> sub class obj
		Student student1 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		// create faculty object
		//sub class ref --> sub class obj(DIRECT referencing)
		Faculty faculty1 = new Faculty("Rama", "Kher", 10, "Java React DB");
		Person p;//super class ref.
		p=student1;//up casting , done implicitly by javac , due to "extends"
		System.out.println(p.getDetails());//run time polymorphism : getDetails : Student
		p=faculty1;
		System.out.println(p.getDetails());//prints Faculty details
		
	}

}
