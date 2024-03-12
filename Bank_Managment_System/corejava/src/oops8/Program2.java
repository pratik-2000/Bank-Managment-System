// wap to print greatest marks student in the record
package oops8;
class Student{
	
	int rollno;
	String name;
	float marks;
	
	void get( int r,String n,float m) {
		
		rollno=r;
		name=n;
		marks=m;
	}
	void display() {
		System.out.println(name +"\t"+ rollno +"\t"+ marks);
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.get(420,"pintu",35);
		//s1.display();
		Student s2=new Student();
		s2.get(430,"Aditya",100);
		
		if(s1.marks>=s2.marks) {
			s1.display();
		}
		else {
			s2.display();
		}

	}

}
