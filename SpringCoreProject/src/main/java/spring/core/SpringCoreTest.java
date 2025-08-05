package spring.core;

public class SpringCoreTest {
	
	private String fname;
	
	@Override
	public String toString() {
		return "SpringCoreTest [fname=" + fname + ", lname=" + lname + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	private String lname;

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
