package inheritance;

public class Student extends Person {
//grad year,course,fees,marks
	private int gradYear;
	private String enrolledCourse;
	private double fees;
	private int marks;

	public Student(String fn, String ln, int year, String enrolledCourse, double fees, int marks) {
		// explicitly invoke MATCHING super cls ctor
		super(fn, ln);
		System.out.println("in student's  ctor");
		// init remaining state of the Student object
		gradYear = year;
		this.enrolledCourse = enrolledCourse;
		this.fees = fees;
		this.marks = marks;
		// display student's first name
		// System.out.println(super.firstName);
	}

	// add overriding form method to return Student's COMPLETE details
	@Override
	public String toString() {
		return "Student : " + super.toString() + " passed in " + gradYear + " course : " + enrolledCourse
				+ " fees paid " + fees + " Marks " + marks;
	}

	// addnew behavior : study method , to display student's last name studying in course name
	
	public void study() {
		System.out.println(super.getLastName() 
				+ " studying in " + this.enrolledCourse);
	}
}
