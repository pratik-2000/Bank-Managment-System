//Addition of two number using method with argument
package day6oops;

import java.util.Scanner;

class Addition {
	void Show(int num1, int num2) {

		int sum = num1 + num2;
		System.out.println("Addition is :\s"+sum);

	}

}

public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num1 and num2");

		int num1 = s.nextInt();
		int num2 = s.nextInt();

		Addition d1 = new Addition();
		d1.Show(num1, num2);

	}

}
