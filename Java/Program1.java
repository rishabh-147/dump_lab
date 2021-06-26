import java.util.Scanner;

//Adding two numbers.
public class Program1 {

	public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	int a = ob.nextInt();
	int b = ob.nextInt();
	ob.close();
	System.out.println("Sum of "+a+", "+b+"= "+(a+b));
	
	System.out.println(
			"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
}
/*
OUTPUT
-------

100 47
Sum of 100, 47= 147


--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/