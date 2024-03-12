// Private Demo
package day12;
 class P1{
	private int a=100;
}
 class P2 extends P1{
	
	 void show() {
		System.out.println(a);
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P2 p=new P2();
		p.show();
	}

}
