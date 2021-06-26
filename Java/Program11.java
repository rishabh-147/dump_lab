import java.util.Scanner;

//Reverse words in a String
public class Program11 {
//just store in array and print it backwards...Easy Peasy LOL!!
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = ob.nextLine();
		ob.close();
		String[] array = s.split("");
		System.out.print("Reverse of the String: ");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
}
/*
OUTPUT
-------

Enter the String: I LOVE MY INDIA !!!
Reverse of the String: !!! AIDNI YM EVOL I
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/