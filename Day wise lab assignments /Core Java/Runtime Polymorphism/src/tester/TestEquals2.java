package tester;

import inheritance.*;

public class TestEquals2 {

	public static void main(String[] args) {
		Object s1 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		Object s2 = new Student("Aditya", "Sethi", 2022, "DAC", 1234567, 80);
		Object s3 = new Student("Aditya", "Kumar", 2022, "DAC", 1234567, 80);
		Object s4= new Faculty("Riya", "Pathak", 10, "java");
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equals(s4));//f
		Object s5=new String("hello");
		System.out.println(s1.equals(s5));
		

	}

}
