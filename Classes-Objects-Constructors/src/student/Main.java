package student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setdata(15, "Dhruv", 21);
		s2.setdata(16, "Digambar", 24);
		
		s1.getdata();
		System.out.println();
		s2.getdata();
	}

}
