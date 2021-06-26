//Sort an array in ascending order
public class Program14 extends Program13{

	public static void main(String[] args) {
		int[] array = Program13.input();
		System.out.print("Unsorted Array: ");
		display(array);
		ascSort(array);
		System.out.print("\n  Sorted Array: ");
		display(array);
		
		
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
	}
	static void ascSort(int[] array)
	{for(int j = 0; j < array.length - 1; j++) {
		for(int i = 0; i < array.length - 1; i++)
		{	if(array[i] > array[i + 1])
			{
			 	int t = array[i];
			 	array[i] = array[i + 1];
			 	array[i + 1] = t;
			}
		}
	}
	}
	public static void display(int[] array)
	{
		for(int i : array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}



/*
 * 
 * 
 OUTPUT
 -------
Enter the length: 5
9 1 5 7 3
Unsorted Array: 9 1 5 7 3 

Sorted Array: 1 3 5 7 9 
--------------------------------------------------------------------
		 Made By - ©Rishabh Tiwari
--------------------------------------------------------------------

 * */