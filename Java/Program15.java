import java.util.Scanner;

//Add 2 matrices using multidimensional arrays
public class Program15 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Size of the Matrix is: ");
		int n = ob.nextInt();
		int[][] A = new int[n][n];
		A= input(A, n);
		int[][] B = new int[n][n];
		B = input(B, n);
		int[][] Res = new int[n][n];
		Res = add(A, B, Res, n);
		System.out.println("Matrix A: ");
		display(A, n);
		System.out.println("Matrix B: ");
		display(B, n);
		System.out.println("Result Sum Matrix: ");
		display(Res, n);
		ob.close();
		
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
    private static int[][] input(int[][] A, int size)
    { @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Matrix: ");
    	for(int i = 0; i < size; i++)
    	{
    		for(int j = 0; j < size; j++)
    		{
    			A[i][j] = sc.nextInt();
    		}
    	}
    	
    return A;
   
}
    
    private static int[][] add(int[][] A,int[][] B, int[][] Result, int size) {
    
    	for(int i = 0; i < size; i++)
    	{
    		for(int j = 0; j < size; j++)
    		{
    			Result[i][j] = A[i][j] + B[i][j];
    		}
    	}
    	return Result;
    }
    
    private static void display(int[][] A, int size)
    {
    	for(int i = 0; i < size; i++)
    	{System.out.print("\t\t");
    		for(int j = 0; j < size; j++)
    		{
    			System.out.print(A[i][j]+" ");
    		}
    		System.out.println();
    		System.out.println();
    	}
    }   
}


/*
 OUTPUT
 -------
 Size of the Matrix is: 3
1 2 3 4 5 6 7 8 9
9 8 7 6 5 4 3 2 1
Matrix A: 
		1 2 3 

		4 5 6 

		7 8 9 

Matrix B: 
		9 8 7 

		6 5 4 

		3 2 1 

Result Sum Matrix: 
		10 10 10 

		10 10 10 

		10 10 10 

--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------
  */
 