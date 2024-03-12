//print greatest feature
package oops8;
import java.util.Scanner;
class A{

	int a;
	int b;
	
	void get(int x,int y) {
		
		a=x;
		b=y;
	}
	
	void max() {
		
		if(a>b) {
			System.out.println(a);
			
		}
		else {
			System.out.println(b);
		}
	}
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		A a1=new A();
		System.out.println("enter the first value");
		int a=s.nextInt();
		System.out.println("enter the second value");
		int b=s.nextInt();
		
		a1.get(a, b);
		
		A a2=new A();
		System.out.println("enter the first value");
		a=s.nextInt();
		System.out.println("enter the second value");
		b=s.nextInt();
		a2.get(a, b);
		
		a1.max();
		a2.max();
		
	}

}
