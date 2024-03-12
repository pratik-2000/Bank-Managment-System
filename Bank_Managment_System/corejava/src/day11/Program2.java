//Super keyword use for method
package day11;
class Base{
	
	void show() {
		
		System.out.println("Base Method");
	}
	
}
class Derived extends Base{
	void show() {
		System.out.println("Derived Method");
	}
	
	void display() {
		
		show();
		super.show();
	}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d1=new Derived ();
		d1.display();
	}

}
