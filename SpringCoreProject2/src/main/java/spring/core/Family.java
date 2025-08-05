package spring.core;

public class Family {
	
	private String familyName;
	private int memberSize;
	@Override
	public String toString() {
		return "Family [familyName=" + familyName + ", memberSize=" + memberSize + ", village=" + village + "]";
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getMemberSize() {
		return memberSize;
	}
	public void setMemberSize(int memberSize) {
		this.memberSize = memberSize;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	private String village;
	

}
