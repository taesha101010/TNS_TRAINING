class GreatestCommonDivisor 
{
	public static void main(String[] args) 
	{
		int a = 21;
		int b = 41;
		int originalA = a;
		int originalB = b;
		
		while (b != 0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		System.out.println("The GCD of " + originalA + " and " + originalB + " is: " + a);
	}
}