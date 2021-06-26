import java.util.Scanner;

//Multiply two numbers

public class Program5 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		ob.close();
		System.out.println("Multiplication of "+a+", "+b+"= "+(a*b));
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

}
/*
OUTPUT
-------

4 5
Multiplication of 4, 5= 20


--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/