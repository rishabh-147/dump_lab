//First 100 prime numbers
/*
 * PRIME NUMBERS: Numbers with 2 factors only.....1 and themselves.....for instance: 2 3 5 7..... 
 **/
public class Program16 {

	public static void main(String[] args) {
		int count = 0;
		int i = 1, c;
		System.out.println("First 100 prime numbers are: ");
		while (count <= 100) {
			c = 0; // count for factor
			for (int k = 1; k <= i; k++){
			 //check to find number of factors.
				if (i % k == 0) {
					c += 1;
				}
			}
			//Check if factors == 2 
			if (c == 2) {
				System.out.println("--> " + i);
				count += 1;
			}
			i += 1;
		}
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
}

/*
   OUTPUT
   -------
   
   First 100 prime numbers are: 
--> 2
--> 3
--> 5
--> 7
--> 11
--> 13
--> 17
--> 19
--> 23
--> 29
--> 31
--> 37
--> 41
--> 43
--> 47
--> 53
--> 59
--> 61
--> 67
--> 71
--> 73
--> 79
--> 83.....
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

 * */
