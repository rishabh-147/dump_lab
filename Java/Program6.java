import java.util.Scanner;

//Check for leap year
public class Program6 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int year = ob.nextInt();
		ob.close();

		if (year % 4 == 0)
			System.out.println(+year + " is a Leap Year.");
		else
			System.out.println(+year + " is not a Leap year.");

		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");

	}
}
/*

OUTPUT
-------

2020
2020 is a Leap Year.


--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/