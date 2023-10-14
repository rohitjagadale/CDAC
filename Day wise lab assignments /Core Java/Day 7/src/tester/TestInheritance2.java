package tester;

import inheritance.*;

//Test ctro invocation , in inh hierarchy + super(...)
public class TestInheritance2 {

	public static void main(String[] args) {
		// super ref --> sub class obj
		Object p = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);// upcasting
		System.out.println(p);//p.toString() : run time poly.
		// create faculty object
		// super class ref --> sub class obj(INDIRECT referencing)
		p = new Faculty("Rama", "Kher", 10, "Java React DB");//up casting
		System.out.println(p);//run time poly.
	}

}
