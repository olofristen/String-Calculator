import java.util.Scanner;
import edu.princeton.cs.algs4.*;

public class String_Calculator {
	
	public static int Add(String numbers)
	{
		if(numbers.isEmpty())
			return 0;
		else
		{
			int sum = 0;
			int i = 0;
			int[] number = new int[2];
			
			Scanner find = new Scanner(numbers);
			find.useDelimiter("[^0-9]+");
			
			while(find.hasNext())
			{
				if(find.hasNextInt() && i < 2)
				{
					number[i] = find.nextInt();
					StdOut.println("number " + i + ": " + number[i]);
					i++;
				}
				else
					find.next();
			}
			
			for (int j = 0; j < 2; j++)
			{
				sum = sum + number[j];
			}
			
			return sum;
		}
	}
	
	public static void main(String[] args) 
    {
		Scanner scanner = new Scanner(System.in);
		String numbers = scanner.nextLine();
		
		StdOut.println("The string: " + numbers);
		
		int sum = Add(numbers);
		StdOut.println("Sum: " + sum);
    }
}