package tester;

import inheritance.*;

//Test ctro invocation , in inh hierarchy + super(...)
public class TestInheritance1 {

	public static void main(String[] args) {
		// create student object
		// String fn, String ln, int year,
		// String enrolledCourse, double fees, int marks
		Student student1 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		// create faculty object
		Faculty faculty1 = new Faculty("Rama", "Kher", 10, "Java React DB");
	}

}
