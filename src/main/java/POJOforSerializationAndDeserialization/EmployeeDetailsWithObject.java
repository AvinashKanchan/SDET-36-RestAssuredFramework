package POJOforSerializationAndDeserialization;

public class EmployeeDetailsWithObject {
	
	//Declare variables as global
	String ename;
	String eId;
	int[] phno;
	String[] email;
	Object spouse;
	
	//Create constructor to initialise
	public EmployeeDetailsWithObject(String ename, String eId, int[] phno, String[] email, Object spouse) {
		this.ename = ename;
		this.eId = eId;
		this.phno = phno;
		this.email = email;
		this.spouse = spouse;
	}

	public EmployeeDetailsWithObject()
	{
		
	}
	//provide getters and setters
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	
	
	

}
