package inheritance;

public class Faculty extends Person {
	private int expInYears;
	private String sme;

	public Faculty(String firstName, String lastName, int yrs, String sme) {
		super(firstName, lastName);
		System.out.println("in Faculty's ctor");
		expInYears = yrs;
		this.sme = sme;
	}

	// modify the behavior : to ret Faculty's complete details
	public String getDetails() {
		return "Faculty : " 
	+ super.getDetails() + " exp in yrs " + expInYears + " expert in " + sme;
	}
}
