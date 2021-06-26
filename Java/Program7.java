import java.text.DecimalFormat;
import java.util.Scanner;

// Compute Compound Interest
public class Program7 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Principle: ");
		int Principle = ob.nextInt();
		System.out.print("Rate of Interest: ");
		int rate = ob.nextInt();
		System.out.print("Time (in Years): ");
		int T = ob.nextInt();
		System.out.print("Compounding Time (in Months): ");
		int CompTime = ob.nextInt();
		ob.close();
		int Time = (T * 12) / CompTime;
		double amount = CompoundIntrest(Principle, rate, Time);
		DecimalFormat dec = new DecimalFormat("#0.00"); // Used DecimalFormat of java.text for DECIMAL PRECISION upto 2
														// digits.
		System.out.printf("Amount = INR " + dec.format(amount));
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");

	}

	private static double CompoundIntrest(int P, int R, int T) {
		double amt = P;
		for (int i = 1; i <= T; i++) {
			double CI = (amt * R) / 100;
			// System.out.println(CI);
			amt = amt + CI;
		}
		return amt;
	}

}

/*

OUTPUT
------

Principle: 5500
Rate of Interest: 4
Time (in Years): 3
Compounding Time (in Months): 6
Amount = INR 6959.25

--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

*/