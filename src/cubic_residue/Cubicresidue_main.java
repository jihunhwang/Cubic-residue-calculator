package cubic_residue;

import java.util.Scanner;

public class Cubicresidue_main 
{
	private static Scanner scan;

	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		
		System.out.println("What is your p?");
		int p = scan.nextInt();
		
		Integer[] cubic_residue_array = new Integer[p + 1];
		
		for(int i = 0; i < p; i++)
		{
			cubic_residue_array[i] = (i * i * i) % p;
		}
		
		int temp;
		
		for(int k = 0; k < p; k++)
		{
			for(int j = k + 1; j < p; j++)
			{
				if(cubic_residue_array[k] > cubic_residue_array[j])
				{
					temp = cubic_residue_array[k];
					cubic_residue_array[k] = cubic_residue_array[j];
					cubic_residue_array[j] =  temp;
				}
				
			}
		}
		
		int count = 1;
		
		System.out.print(cubic_residue_array[1] + " ");
		
		for(int i = 1; i < p - 1; i++)
		{
			if(cubic_residue_array[i] != cubic_residue_array[i + 1])
			{
				count++;
				System.out.print(cubic_residue_array[i + 1] + " ");
			}
		}
		
		System.out.println(System.lineSeparator() + "Total Count : " + count);
		
		
		if(count == p - 1)
		{
			System.out.println("Complete Residue!");
		}
		
	}
}
