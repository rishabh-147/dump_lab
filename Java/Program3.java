import java.util.Scanner;

//Adding two binary numbers
public class Program3 {

	public static void main(String[] args) {
		//Convert bin to decimal, simple sum 
		Scanner ob =  new Scanner(System.in);
		long a = ob.nextLong();
		long b = ob.nextLong();
		ob.close();
		int sum = toDec(a)+toDec(b);
		System.out.print("Binary addition of "+a+", "+b+" is = "+toBin(sum));
		//NOT TO BE WRITTEN IN RECORD
		advanced(a, b, sum);
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
	
	private static int toDec(long num)
	{
		int dec = 0,count = 0;
		while(num != 0)
		{
			int d = (int) (num % 10);
			if(d == 1)
			{
				dec = dec + d * ((int) Math.pow(2, count));
			}
			count += 1;
			num = num / 10;
		}
	return dec;
	}
	
	public static String toBin(int num)
	{
		String bin = "";
		while(num >= 2)
		{
			int d = num % 2;
			bin = d + bin;
			num = num / 2;
		}
		if(num == 1)
			bin = "1" + bin;
		return bin;
	}
//Making this code a bit more strong by
	//displaying the decimal values of the numbers.
	
	//To be ignored in record
	private static void advanced(long a, long b, int sum)
	{
		System.out.println("\n\nFOLLOWING IS NOT IN THE LAB RECORD.\n--------------------\n"+a+" is the binary of "+toDec(a));
		System.out.println(+b+" is the binary of "+toDec(b));
		System.out.println("And the summation of the above numbers is "+sum);
	}
}


/*

OUTPUT
-------

11111
10101
Binary addition of 11111, 10101 is = 110100

FOLLOWING IS NOT IN THE LAB RECORD.
--------------------
11111 is the binary of 31
10101 is the binary of 21
And the summation of the above numbers is 52


--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------


*/