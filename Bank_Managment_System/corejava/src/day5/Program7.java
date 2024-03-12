//wap to print value from 1 to entered number 
package day5;
import java.util.Scanner;

public class Program7 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Ener the number");
		int num=s.nextInt();
		int i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
			
	}
}
