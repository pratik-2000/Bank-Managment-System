// static and constructor
package oops8;

class Student1{
	int rollno;
	String name;
	
	static String schoolname;
	{
		schoolname="z.p";
		
	}
	Student1(int r,String n){
		 rollno=r;
		 name=n;
		 
	}
	void display() {
		
		System.out.println(schoolname+" "+name+" "+rollno);
	}
}

public class Program4 {
	public static void main(String []args) {
		Student1 s1=new Student1(100,"Pintu");
		
		s1.display();
		
		Student1 s2=new Student1 (10,"Aditya");
		 s2.display();
	}
}
