
class GreatestCommonDivisor 
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 6;
		
		if (a>b)
		{
			if (a%b== 0)
			{
				System.out.println("The greatest common divisor is:  "+b);
			}
			
			if (a%b != 0)
			{
				while (b!=0)
				{
					int temp = b;
					b = a%b;
					a = temp;
				}
				
				System.out.println("The greatest common divisor is:  "+ a)
			}
		}
		
		if (a<b)
		{
			if (b%a== 0)
			{
				System.out.println("The greatest common divisor is:  "+a);
			}
			
			if (a%b != 0)
			{
				while (b!=0)
				{
					int temp = a;
					a = b%a;
					b = temp;
				}
				
				System.out.println("The greatest common divisor is:  "+ b)
			}
		}
		
		
	
	}
}
