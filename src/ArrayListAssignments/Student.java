package ArrayListAssignments;

import java.util.Objects;

public class Student {
	private String name;
	private int rollNo;
	private String dOB;
	private String email;
	private int totalMarks;
	@Override
	public int hashCode() {
		return Objects.hash(dOB, email, name, rollNo, totalMarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dOB, other.dOB) && Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& rollNo == other.rollNo && totalMarks == other.totalMarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", dOB=" + dOB + ", email=" + email + ", totalMarks="
				+ totalMarks + "]";
	}
	
}
