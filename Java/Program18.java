import java.util.Scanner;

//Find sum of N natural numbers
public class Program18 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the limit n: ");
		int n = ob.nextInt();
		ob.close();
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of first "+n+ " Natural numbers is= "+sum);
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

}

/*
 OUTPUT
 ------
 
 Enter the limit n: 10
Sum of first 10 Natural numbers is= 55
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

 
 */
 