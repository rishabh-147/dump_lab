import java.text.DecimalFormat;
import java.util.Scanner;

//Compute Simple Interest....
public class Program8 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Principle: ");
		int Principle = ob.nextInt();
		System.out.print("Rate of Interest: ");
		int rate = ob.nextInt();
		System.out.print("Time (in Years): ");
		int Time = ob.nextInt();
		
		ob.close();
		double amount = SimpleIntrest(Principle, rate, Time);
		DecimalFormat dec = new DecimalFormat("#0.00"); // Used DecimalFormat of java.text for DECIMAL PRECISION upto 2
														// digits.
		System.out.printf("Amount = INR " + dec.format(amount));
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");

	}

	private static double SimpleIntrest(int P, int R, int T) {
		double amt = P;
		
			double SI = (P * R * T) / 100;
			
			amt = amt + SI;
		
		return amt;
	}

}
/*

OUTPUT
-------

Principle: 40000
Rate of Interest: 5
Time (in Years): 3
Amount = INR 46000.00

--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/