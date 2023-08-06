package org.student;

public class Students {
	public void StudentInfo(int id)
	{
		
		System.out.println("Student id:"+id);
	}
	
	public void StudentInfo(int id,String name)
	{

		System.out.println("Student id:"+id+" Student name:"+name);
	}
	
	public void StudentInfo(int id, String email,long phoneNumber)
	{
		System.out.println("Student email:"+email+" Student name:"+phoneNumber);
	}

	public static void main(String[] args) {
		
		Students s=new Students();
		s.StudentInfo(123);
		s.StudentInfo(1234, "Bhuvana");
		s.StudentInfo(123,"Bhuvana@gmail.com",8754174739l);

	}

}
