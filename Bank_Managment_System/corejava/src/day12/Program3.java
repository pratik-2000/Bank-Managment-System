// Interface Demo
package day12;
interface A{
   int i=10;
}
interface B{
	int j=20;
}

class C implements A,B{
	 void show() {
		 System.out.println(i+j);
	 }
	//int D=i+j;
	
	
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1=new C();
		c1.show();
		
	}

}
