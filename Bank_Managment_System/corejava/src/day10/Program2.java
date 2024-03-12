// method overloading
package day10;
class Addition{
	
	void add (int i,int j) {
		
		System.out .println("additon is:"+ (i+j));
	}
	void add(int i,float j) {
		
		System.out .println("additon is:"+ (i+j));
		
	}
	void add (int i,int j,int k) {
		
		System.out .println("additon is:"+ (i+j+k));
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1=new Addition();
		
		a1.add(10, 20);
		a1.add(5, 5.1f);
		a1.add(2, 1, 2);

	}

}
