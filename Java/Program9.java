import java.util.Scanner;

//Calculate Power of a Number...
public class Program9 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		int pow = ob.nextInt();
		ob.close();
		System.out.println(+num + " raise to the power of " + pow + " is = " + (int) Math.pow(num, pow));
		
		System.out.println(
				"--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
}
/*
OUPUT
------

6 4
6 raise to the power of 4 is = 1296
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------
*/