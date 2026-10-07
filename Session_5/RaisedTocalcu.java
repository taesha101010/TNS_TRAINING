import java.util.Scanner;
class  RaisedTocalcu 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your base number x: ");
		int x = sc.nextInt();
		System.out.println("Enter your raised to number n: ");
		int n = sc.nextInt();
		int ans = 1;
		
		
		for (int i = 1;i <= n ; i++ )
		{
			 
			 ans = ans*x;
		}
		
		System.out.println(ans);
		
	}
}



