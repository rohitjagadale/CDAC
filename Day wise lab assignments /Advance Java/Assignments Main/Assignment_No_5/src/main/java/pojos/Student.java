package pojos;

public class Student {
	private String firstName;
	private String lastName;
	private int marks;
	private Course selectedCourse;
	private boolean admissionStatus;
	public Student(String firstName, String lastName, int marks, Course selectedCourse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.selectedCourse = selectedCourse;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks + ", selectedCourse="
				+ selectedCourse + ", admissionStatus=" + admissionStatus + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Course getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	public boolean isAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(boolean admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	
}
