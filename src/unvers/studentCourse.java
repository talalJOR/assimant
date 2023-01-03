package unvers;

public class studentCourse {
	 private int stuid;
	 private int corid;
	 
	 
	public studentCourse(int stuid, int corid) {
		super();
		this.stuid = stuid;
		this.corid = corid;
	}
	@Override
	public String toString() {
		return "studentCourse [stuid=" + stuid + ", corid=" + corid + "]";
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public int getCorid() {
		return corid;
	}
	public void setCorid(int corid) {
		this.corid = corid;
	}
}
