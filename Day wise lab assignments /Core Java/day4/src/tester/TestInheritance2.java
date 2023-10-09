package tester;

import inheritance.*;

//Test ctro invocation , in inh hierarchy + super(...)
public class TestInheritance2 {

	public static void main(String[] args) {
		// create student object
		// String fn, String ln, int year,
		// String enrolledCourse, double fees, int marks
		//direct referncing 
		//Student type of ref ---> Student obj
		Student student1 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		// create faculty object
		//Faculty type of ref ---> Faculty obj
		Faculty faculty1 = new Faculty("Rama", "Kher", 10, "Java React DB");
		System.out.println(student1.getDetails());
		System.out.println(faculty1.getDetails());
	}

}
