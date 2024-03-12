// how many times 0bject is run
package oops8;
class  Student2{

	 int rollno;
	 String name;
	
	static int count=0;
	
	Student2(int r,String n){
		
		rollno=r;
		name=n;
		count++;
	}
	void display() {
		System.out.println(name +" "+rollno+" "+"obj count is:"+count);
	}
	
}
public class Program5 {
	public static void main(String []args){
		
		Student2 s1=new Student2(10,"aditya");
		s1.display();
		Student2 s2=new Student2(20,"Pintu");
		s2.display();
		
	}

}
