import java.util.ArrayList;
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
			ArrayList<Integer> number = new ArrayList<Integer>();
			String negatives = "";
			
			Scanner find = new Scanner(numbers);
			find.useDelimiter("[^-?0-9]+");
			
			while(find.hasNext())
			{
				if(find.hasNextInt())
				{
						number.add(find.nextInt());
						StdOut.println("number " + i + ": " + number.get(i));
						i++;
				}
				else
					find.next();
			}
			
			for (int j = 0; j < number.size(); j++)
			{
				if ((number.get(j) > 0) && (number.get(j) <= 1000))
					sum = sum + number.get(j);
				else if (number.get(j) < 0)
					if(negatives.isEmpty())
						negatives = negatives + number.get(j);
					else
						negatives = negatives + ", " + number.get(j);		
			}
			
			if(!negatives.isEmpty())
			{
				throw new IllegalArgumentException("Negatives not allowed: " + negatives);
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