import java.util.Scanner;

//REVERSE AN ARRAY
public class Program13 {

	
	public static void main(String[] args) {
		int[] array = input();
		int n = array.length;
		System.out.print("The Array entered is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\nReverse of the Array: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	
		System.out.println(
				"--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
		
	}
	public static int[] input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int  n = ob.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = ob.nextInt();
		}
		ob.close();
		return array;
}
}

/*

OUTPUT
-------
Enter the length: 9
1 2 3 4 5 6 7 8 9
The Array entered is: 1 2 3 4 5 6 7 8 9 
Reverse of the Array: 9 8 7 6 5 4 3 2 1 
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/