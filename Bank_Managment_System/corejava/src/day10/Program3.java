//method overloading ex1
package day10;
class Area{
	
	void area(int a,int b) {
		
		System.out.println("Area of square:"+(a*b));
	}
	void area(float a,float b ) {
		System.out.println("Area of rectangle:"+(a*b));
	}
	void area(int b,float h) {
		
		System.out.println("Area of trangle:"+((b*h)/2));
	}
}



public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1=new Area();
		a1.area(12,10);
		a1.area(5.4f, 12.6f);
		a1.area(5, 1.4f);

	}

}
