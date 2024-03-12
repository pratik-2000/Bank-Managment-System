//Switch Statement
package day5;
import java.util.Scanner;

public class Program1 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the vovel");
		char ch=s.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println("Vovel");
			break;
			
		case 'e':
			System.out.println("Vovel");
			break;
		default :
			System.out.println("Consanant");
		

		
		
		
		}
		
		
	}

}
