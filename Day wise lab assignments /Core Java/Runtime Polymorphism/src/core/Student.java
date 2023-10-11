package core;

public class Student extends Person {
	private String course;

	public Student(String n, double mob, int i, String course) {
		super(n, mob,i);
		this.course = course;
	}

	@Override
	public String toString() {
		return "student " + super.toString() + " course = " + course;
	}

	@Override
         public String specification(){
        	 return "specif = study";
         }

	@Override
	public boolean equals(Object obj1) {
		Person p = (Person) obj1;

		if (super.getName() == p.getName())
			return true;
		return false;
	}
}