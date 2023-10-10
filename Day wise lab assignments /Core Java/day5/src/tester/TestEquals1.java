package tester;

import inheritance.*;

public class TestEquals1 {

	public static void main(String[] args) {
		Student s1 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		Student s2 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//f

	}

}
