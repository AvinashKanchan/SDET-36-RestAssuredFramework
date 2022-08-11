package POJOforSerializationAndDeserialization;

public class Spouse {
	
	//declare variables
	String sname;
	int Phno;
	String Company;
	
	//Create constructor
	public Spouse(String sname, int phno, String company) {
		this.sname = sname;
		this.Phno = phno;
		this.Company = company;
	}

	//Generate getters and setters
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPhno() {
		return Phno;
	}

	public void setPhno(int phno) {
		Phno = phno;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}
	
	
	

}
