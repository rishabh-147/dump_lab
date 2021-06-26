import java.util.Scanner;

//Check for Armstrong Number;
/*
 * ARMSTRONG NUMBER: 3 digit no. whose sum of cubes of the digit s is equal to the number itself.
 * 
 * 153 = 1^3 + 5^3 + 3^3 = 153 is  a Armstrong number.
 */
public class Program19 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the number to be checked: ");
		int n = ob.nextInt();
		ob.close();
		
		if (isArmstrong(n)) {
			System.out.println(+n + " is a Armstrong Number.");
		}
		else
		System.out.println(+n + " is not a Armstrong Number.");

		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
	
	private static boolean isArmstrong(int n)
	{
		int sum = 0;
		int temp = n;
		while(temp != 0)
		{
			int d = temp % 10;
			sum = sum +(int) Math.pow(d, 3);
			temp = temp / 10;
		}
		
		if(sum == n) return true;
		else return false;
	}
}


/*
 * Output
 * -------
 * 
 Enter the number to be checked: 153
153 is a Armstrong Number.
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------
 */