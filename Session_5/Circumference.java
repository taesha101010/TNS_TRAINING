import
java.util.Scanner;
class Circumference 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float radius = sc.nextInt();
		
		double ans = 2*3.14*radius;
		
		System.out.println("The Circumference of given circle is: " + ans);
	}
}
