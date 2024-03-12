//Square of entered number
package day3;
import java.util.Scanner;
public class Program4 {
public static void main(String []args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number you want to print square");
	int num =s.nextInt();
	int square =num*num;
	System.out.println("square is :"+square);
	
}
}
