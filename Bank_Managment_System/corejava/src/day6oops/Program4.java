// wap to calculate cube and square of entered number using method wit argument
package day6oops;
import java.util.Scanner;
class Cube{
	
	 void show(int num) {
		 
		 int square=num*num;
		 float cube=(num*num*num);
		 System.out.println("Square is:\s"+square);
		 System.out.println("Cube is:\s"+cube);
		 
	 }
}

public class Program4 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=s.nextInt();
		
		Cube d1=new Cube();
		d1.show(num);
		
	}

}
