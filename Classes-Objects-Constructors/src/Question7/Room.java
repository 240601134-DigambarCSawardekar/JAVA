package Question7;

public class Room {
	private int roomNo;
	private String roomtype;
	private double roomarea;
	private String acmachine;
	
	public void setData(int roomNo,String roomtype,double roomarea,String acmachine) {
		this.roomNo = roomNo;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.acmachine = acmachine;
	}
	
	public void getData() {
		System.out.println("For Room Number "+roomNo+" Room Type is "+roomtype+", Room Area is "+roomarea+" SqFt and AC Machine is "+ acmachine);
	 }
	
}
