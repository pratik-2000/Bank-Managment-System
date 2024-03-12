//average of three entered number 
package day3;
import java.util.Scanner;
public class Program5 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three number");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int average=(num1+num2+num3)/3;
		
		System.out.println("Average is:"+average);
	}
}
