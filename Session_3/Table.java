import java.util.*;
// for LOOP
/*
for (initialization,condition,increment)
for (int a; a< 20; a++){}


// while

int a ;
while(condition){
-------
-----
increment/decrement}

// do while
int a ;
do{
-----
----
--
increment} while(condition);

*/
class Table
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		/*int a = sc.nextInt();
		
		System.out.println("The table is as follows: ");
		for (int i = 1 ; i <= 10 ; i++ )
		{
			
			System.out.println(a + "X" + i + "=" + a*i);
		}*/
		
		int natural_num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= natural_num)
		{
			
			sum = sum + i;
			i++;
		}
		  System.out.println(sum);
		
	}
	
}
