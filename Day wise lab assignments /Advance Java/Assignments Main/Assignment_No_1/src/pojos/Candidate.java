package pojos;

public class Candidate {
// id | name    | party    | votes
	private int id;
	private String name;
	private String partyName;
	private int votes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public Candidate(int id, String name, String partyName, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.partyName = partyName;
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", partyName=" + partyName + ", votes=" + votes + "]";
	}
	
	
	
}
