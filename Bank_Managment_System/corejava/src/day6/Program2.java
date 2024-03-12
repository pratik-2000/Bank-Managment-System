//1 to 20 table using for loop
package day6;
public class Program2 {
	public static void main(String []args) {
		
		for(int table=1;table<=20;table++)

		{
			for(int i=1;i<=10;i++) {
				
				System.out.println(table+"*"+i +"="+ table*i);
			}
			System.out.println("-----------");
		}
		
	}
}
