import java.util.Scanner;
class AgeRest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int ag = sc.nextInt();
		boolean drlis = true;
		
		if (ag >= 18 && drlis == true)
		{
			System.out.println("can drive");
		}
		
		else if (ag >= 18 && drlis == false )
		{
			System.out.println("You need Lisence");
		}
		
		else  
		{
			System.out.println("You need to be above 18 yrs");
		}
		
		
		
	}
}
