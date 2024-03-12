// Employee record
package oops8;
class Emp
{	int empid;
	String empname;
	float empsalary;
	
	void get(int i,String n,float s) {
		empid=i;
		empname=n;
		empsalary=s;
		
	}
	void display() {
		
		System.out.println(empid+"\t"+empname+"\t"+empsalary);
	}
}
public class Program1 {
	public static void main(String []args) {
		Emp e1=new Emp();
		e1.get(100, "Aditya", 20000);
		e1.display();
	}
}
