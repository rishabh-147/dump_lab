
import java.util.Scanner;

//Sort Strings in alphabetical order
public class Program10 {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the number of strings to be sorted...");
		int n = ob.nextInt();
		String[] array = new String[n];
		System.out.println("Enter the Strings:");
		for (int i = 0; i <= n - 1; i++) {
			array[i] = ob.next();
		}
		ob.close();
		sort(array);
		display(array);

		System.out.println(
				"--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

	private static void sort(String[] A) {
		for (int K = 0; K < A.length - 1; K++) {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i].compareTo(A[i + 1]) > 0) {
					String temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}
	}

	private static void display(String[] A) {
		for (String i : A) {
			System.out.println(i);
		}
	}
}


/*
OUTPUT
--------
Enter the number of strings to be sorted...8
Enter the Strings:
GOT LOST INTO THE BLUE OF HER EYES.
BLUE
EYES.
GOT
HER
INTO
LOST
OF
THE
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/