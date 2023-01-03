package unvers;

public class students {
	 private int stid ;
	 private String stname ;
	 
	public students(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	public students() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "students [stid=" + stid + ", stname=" + stname + "]";
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
}
