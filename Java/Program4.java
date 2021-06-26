import java.util.Scanner;

//Adding two Complex numbers
public class Program4 {
//Created a inner class complex with two parts real and imaginary......then initialized them with the user data and executed the addition statement
	private Complex num1, num2;

	static class Complex {
		int real;
		int img;

		public Complex(String s) {

			this.real = s.charAt(0) - 48; // this is done coz if 'char' is stored in 'int' then the ASCII value is
											// stored of that chat
											// to rectify this we subtracted the ASCII of 0 i.e 48..so what remains is
											// the number.

			this.img = s.charAt(3) - 48;
		}
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter 1st Complex Number in [a+ib] format: ");
		String s1 = ob.next();
		System.out.print("Enter 2nd Complex Number in [a+ib] format: ");
		String s2 = ob.next();
		ob.close();

		Program4 p4 = new Program4();

		p4.num1 = new Complex(s1);
		p4.num2 = new Complex(s2);
		System.out.println(p4.num1.real + "  " + p4.num2.real + " " + p4.num1.img + " " + p4.num2.img);
		System.out.print("\n Sum of the given complex numbers is: "
				+ p4.add(p4.num1.real, p4.num2.real, p4.num1.img, p4.num2.img));
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}

	private String add(int r1, int r2, int i1, int i2) {
		int Sr = r1 + r2;
		int Si = i1 + i2;
		String res = "" + Sr + " + i (" + Si + ")";
		return res;
	}

}


/*

OUTPUT
-------

Enter 1st Complex Number in [a+ib] format: 3+i6
Enter 2nd Complex Number in [a+ib] format: 9+i5
3  9 6 5

 Sum of the given complex numbers is: 12 + i (11)

--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------


*/