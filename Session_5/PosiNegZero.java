import java.util.Scanner;
class PosiNegZero
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell how numbers you want to enter.");
		int numbers = sc.nextInt();
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount= 0;
		for (int i = 1;i<=numbers ; i++)
		{
			System.out.println("Enter number: ");
			int a = sc.nextInt();
			
			if (a>0)
			{
			    positiveCount++;
			}
			if (a<0)
			{
				negativeCount++;
			}
			if (a==0)
			{
				zeroCount++;
			}
		}
		
		System.out.println("Positive count is :" + positiveCount);
		System.out.println("Negative count is :" + negativeCount);
		System.out.println("zero count is :" + zeroCount);
		
		
	}
}
