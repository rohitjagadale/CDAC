package core;

public abstract class Person {
	private String name;
	private int event_id;
	private double mob_no;

	public Person(String n, double m,int i) {
		name = n;
		mob_no = m;
		event_id=i;
	}

	@Override
	public String toString() {
		return "details : " + name + " " + mob_no + " " + event_id;
	}

	public abstract String specification();

	@Override
	public abstract boolean equals(Object obj1);

	public String getName() {
		return name;
	}

}
