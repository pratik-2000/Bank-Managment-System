/*class name-calculator-two
instance variables-
num1,num2.initialize with
parameterized
constructor.have
4 functionalities
add(),sub(),multiply(),divide().1
choice 1-addition
choice 2 subtraction
choice 3 multiplication
choice 4 division
else invalid choice*/
package day9;

import java.util.Scanner;

class Calculator {
	int num1, num2;

	Calculator(int a, int b) {

		num1 = a;
		num2 = b;

	}

	int add() {
		return num1 + num2;
	}

	int sub() {
		return num1 - num2;
	}

	float div() {
		if(num2 != 0) {
			return (float)num1 / num2 ;
		}
		else {
			System.out.println("Cannot divide by zero.");
			return Float.NaN; // Indicates an undefined result
		}
		
	}

	int mul() {
		return num1 * num2;
	}
}

public class Program3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the two number");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		Calculator c1 = new Calculator(n1, n2);

		System.out.println("Enter The Choice:\n 1:Addititon\n 2:Subtraction\n 3:Division\n 4:Multipliction");
		int choice = s.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Addition is:" + c1.add());
			break;
		case 2:
			System.out.println("Subtraction is:" + c1.sub());
			break;
		case 3:
			System.out.println("Division is:" + c1.div());
			break;
		case 4:
			System.out.println("Multipliction is:" + c1.mul());
			break;
		default:
			System.out.println("Invalid choice");

		}
		s.close();
	}

}
