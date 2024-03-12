//method overriding
package day10;
class Base1{
	
	void display() {
		
		System.out.println("Base Method");
	}
	
	
}
class Child1 extends Base1{
	
	void display() {
		System.out.println("Child Method");// display method is overriding
	}
}
public class Program4 {
	public static void main(String []args) {
		
		Child1 c1=new Child1();
		c1.display();
	}

}
