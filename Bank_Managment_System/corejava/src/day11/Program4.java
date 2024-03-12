//hierarchical inheritance
package day11;
class Shape
{
	void draw()
	{
		System.out.println("Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}
public class Program4 {
	public static  void main(String []args) {
		Shape s1=new Shape();
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		
		s1.draw();
		c1.draw();
		r1.draw();
		
		
	}

}
