import java.util.Scanner;

//Find largest of the three numbers
public class Program20 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the numbers to be checked: ");
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = ob.nextInt();
		ob.close();

		if (isMax(a, b) && isMax(a, c))
			System.out.println(+a + " is the largest number.");
		else if (isMax(b, a) && isMax(b, c))
			System.out.println(+b + " is the largest number.");
		else
			System.out.println(+c + " is the largest number.");

		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

	private static boolean isMax(int a, int b) {
		if (a > b)
			return true;
		else
			return false;
	}
}

/*
 * OUTPUT --------
 * 
 * Enter the numbers to be checked: 10 87 14 87 is the largest number.
 * -------------------------------------------------------------------- Made By
 * - ©Rishabh Tiwari
 * --------------------------------------------------------------------
 * 
 */