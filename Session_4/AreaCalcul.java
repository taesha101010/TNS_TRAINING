import java.util.Scanner;
class AreaCalcul 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice(1.Triangle/2.Square/3.Rectangle):");
		int a = sc.nextInt();
		
		switch (a)
		{
			case 1: 
				System.out.println("Enter base and height:");
				double base = sc.nextDouble();
				double height = sc.nextDouble();
				System.out.println("Area of Triangle: " + (0.5 * base * height));
				break;
				
			case 2:
				System.out.println("Enter side:");
				double side = sc.nextDouble();
				System.out.println("Area of Square: " + (side * side));
				break;
				
			case 3:
				System.out.println("Enter length and breadth:");
				double len = sc.nextDouble();
				double breadth = sc.nextDouble();
				System.out.println("Area of Rectangle: " + (len * breadth));
				break;
				
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}