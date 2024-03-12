// table 1 to 20 using while loop
package day6;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table=1;
		while(table<=20)
		{
			
			int i=1;
			while(i<=10)
			{
				System.out.println(table +"*"+i+"="+ table*i);
				i++;
			}
			table++;
			System.out.println("--------");
		}

	}

}
