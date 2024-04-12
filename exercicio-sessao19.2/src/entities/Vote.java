package entities;

import java.util.Objects;

public class Vote {
	
	private String candidateName;
	private Integer votes;
	
	public Vote() {
	}
	

	public Vote(String candidateName, Integer votes) {
		super();
		this.candidateName = candidateName;
		this.votes = votes;
	}
	

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}


	@Override
	public int hashCode() {
		return Objects.hash(candidateName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		return Objects.equals(candidateName, other.candidateName);
	}
	
	

}
