//Day number
package day4;
import java.util.Scanner;
public class Program5 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int day=s.nextInt();
		
		if(day ==1) {
			System.out.println("monday");
		}
		else if(day==2) {
			System.out.println("tuesday");
		}
		else if(day==3) {
			System.out.println("wednesday");
		}
		else if(day==4) {
			System.out.println("thursday");
		}
		else if(day==5) {
			System.out.println("friday");
		}
		else if(day==6) {
			System.out.println("saturday");
		}
		else if(day==7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid Day");
		}
	}
}
