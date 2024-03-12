//constructor overload
package day10;

class Calculator {
	int a, b;

	Calculator(int x, int y) {

		a = x;
		b = y;

	}
	Calculator(int x,int y,int z){
		
		System.out.println(x+y+z);
	}

	void add() {

		System.out.println(a + b);
	}

	void sub() {

		System.out.println(a - b);
	}

}

public class Program6 {
	public static void main(String[] args) {
		
		Calculator c1=new Calculator(6,4,3);
		
		c1.add();
		c1.sub();

	}

}
