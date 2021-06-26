import java.util.Scanner;

//Check if the number entered is prime.
public class Program17 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int n = ob.nextInt();
		ob.close();
		if (isPrime(n)) {
			System.out.println(+n + " is a Prime Number.");
		}
		else
		System.out.println(+n + " is not a Prime Number.");

		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

	private static boolean isPrime(int n) {
		int i = n;
		int c;

		c = 0; // count for factor
		for (int k = 1; k <= i; k++) {
			// check to find number of factors.
			if (i % k == 0) {
				c += 1;
			}
		}
		// Check if factors == 2
		if (c == 2)
			return true;
		else
			return false;
	}
}

/*
 Output
 ------
 
Enter the number to be checked: 17
17 is a Prime Number.
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------
 */
