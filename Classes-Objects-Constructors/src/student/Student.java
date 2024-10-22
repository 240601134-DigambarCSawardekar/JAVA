package student;

public class Student {
	int rollNo;
	String name;
	int age;
	
public void setdata(int rollNo,String name, int age ){
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
		
	}
public void getdata() {
	System.out.print(rollNo+" ");
	System.out.print(name+" ");
	System.out.print(age+" ");
}

}
