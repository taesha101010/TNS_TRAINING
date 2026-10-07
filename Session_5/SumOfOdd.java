import java.util.Scanner;
class SumOfOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for (int i = 1;i <= n ; i++ )
		{
			if (i % 2 != 0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("The Sum of all Odd numbers from 1 to 10 are: " + sum);
	}
	
	
}
