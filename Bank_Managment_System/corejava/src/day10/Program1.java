//single inheritance
package day10;
class Base{
	
	String name="pratik";
}
class Child extends Base{
	 
	String surname="patil";
	
	void display() {
		
		System.out.println(name+" "+ surname);
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.display();

	}

}
