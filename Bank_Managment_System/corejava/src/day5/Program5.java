//greatest number between three number
package day5;
import java.util.Scanner;

public class Program5 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int a=s.nextInt();
		System.out.println("Enter the Second number");
		int b=s.nextInt();
		System.out.println("Enter the third number");
		int c=s.nextInt();
		int greatestNumber;
		if( a>=b&&a>=c) {
			
			greatestNumber=a;
		}
		else if(b>=a&&b>=c)
		{
			greatestNumber=b;
		}
		else 
		{
			greatestNumber=c;
		}
		System.out.println("greatest number is:"+greatestNumber);
		
		}

}