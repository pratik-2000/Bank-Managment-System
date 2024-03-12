//method with argument

package day6oops;
import java.util.Scanner;
class Methoddemo{
	 void show(String name) {
		 System.out.println("your name is :-"+name);
		 
	 }
	
}

public class Program2 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		
		Methoddemo d1=new Methoddemo();
		d1.show(name);
		
		
	}

}
