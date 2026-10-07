import java.util.Scanner;
class AvgNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st num: ");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd num: ");
		int b = sc.nextInt();
		System.out.println("Enter your 3rd num: ");
		int c = sc.nextInt();
		
		double result = avg(a, b, c); // method la call kela
		System.out.println("Average is: " + result);
	}
	
	public static double avg(int a, int b, int c){
		return (a + b + c) / 3.0; // 3.0 ne bhagaycha mhanje point madhe answer yeil
	}
}