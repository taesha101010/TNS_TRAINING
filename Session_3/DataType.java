import java.util.*;
class DataType
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float a = 6f;
		int b = 4;
		System.out.println(a+b);
		
		System.out.println("Enter your age: ");
		int c = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter Length: ");
		float d = sc.nextFloat();
		System.out.println("Enter Breadth: ");
		float e = sc.nextFloat();
		float f = d*e;
		System.out.println(f);
		
		
		
		
	}
}
