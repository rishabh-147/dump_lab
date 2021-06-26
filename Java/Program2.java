import java.util.Scanner;

//Check for odd or even
public class Program2 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		ob.close();
		System.out.print(+num+" is an ");
		if(num % 2 == 0) 
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");

	}

}

/*

OUTPUT
------
147
147 is an Odd number


--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/