package pojo;

public class Candidate {
	//| id | name    | party    | votes |
	private int candidateId;
	private String candidateName;
	private String partyName;
	private int votes;
	
	
	public Candidate() {
	}
	public Candidate(int candidateId, String candidateName, String partyName, int votes) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.partyName = partyName;
		this.votes = votes;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", partyName=" + partyName
				+ ", votes=" + votes + "]";
	}
}
