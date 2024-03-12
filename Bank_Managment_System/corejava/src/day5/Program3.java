//day number
package day5;
import java.util.Scanner;
public class Program3 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day number");
		int num=s.nextInt();
		
		if (num==1||num==2||num==3||num==4)
		{
			System.out.println("Weekday");
			
		}
		else {
			System.out.println("Weekind");
		}
	
	}
		
}
