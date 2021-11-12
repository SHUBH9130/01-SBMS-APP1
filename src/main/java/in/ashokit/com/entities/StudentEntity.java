package in.ashokit.com.entities;

public class StudentEntity {

	private Integer sid;
	private String sname;
	
	public void showData(Integer sid,String sname) {
	this.sid=sid;
	this.sname=sname;
		System.out.println("Student ID "+sid+" Student Name "+sname);
	}
	
	
	public StudentEntity() {
	System.out.println("StudentEntity.StudentEntity()");
	
	
	
	}
}
