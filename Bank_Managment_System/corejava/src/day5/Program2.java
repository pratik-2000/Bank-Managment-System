//logical or || 
package day5;
import java.util.Scanner;
public class Program2 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the charactor"); 
		char ch =s.next().charAt(0);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Vovel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
	}

}
