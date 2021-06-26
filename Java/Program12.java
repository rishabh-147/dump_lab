import java.util.Scanner;

//Add elements of an array
public class Program12 {
//USING an array here is a waste of memory....why not be smarter....
	// no array used....but still it appears correctly doing the task.
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Length of Array: ");
		int n = ob.nextInt();
		System.out.println("Enter the elements: ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + ob.nextInt();
		}
		ob.close();
		System.out.println("SUM OF THE ARRAY IS: " + sum);

		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

}
/*
OUTPUT
--------
Length of Array: 5
Enter the elements: 
1 2 3 4 5
SUM OF THE ARRAY IS: 15
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------
*/