package entities;

import java.util.Objects;

public class UserStudent {
	
	private Integer number;
	
	public UserStudent() {
	}

	public UserStudent(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserStudent other = (UserStudent) obj;
		return Objects.equals(number, other.number);
	}
	
	

}