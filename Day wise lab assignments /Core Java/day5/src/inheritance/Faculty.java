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
	@Override
	public String toString() {
		return "Faculty : " + super.toString() + " exp in yrs " + expInYears + " expert in " + sme;
	}
	// add new behavior : teach : to display faculty 's first name teaching for no
	// of years
	public void teach() {
		System.out.println(getFirstName()+" teaching for "+expInYears+" years ");
	}
}
