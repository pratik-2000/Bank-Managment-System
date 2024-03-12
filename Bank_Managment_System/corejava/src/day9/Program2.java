//call by reference
package day9;
class BB{
	int a=10;
	void change(BB b1) {
		b1.a++;
	}
	void display() {
		System.out.println(a);
		
	}
}

public class Program2 {
	public static void main(String []args) {
		
		BB x=new BB();
		x.change(x);
		x.display();
		

		
	}

}
