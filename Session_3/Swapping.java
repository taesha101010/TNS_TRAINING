class  Swapping
{
	public static void main(String[] args) 
	{
		//swap the values of two integer variables without using any auxillary variable
		int a = 2;
		int b = 3;
		System.out.println("a = "+ a + " b = "+ b);
		System.out.println("After Swapping!!");
		a = a+b; //5
		b = a-b;  //5-3 = 2
		a = a-b;  //3-2 = 3
		
		System.out.println("a = "+ a + " b = "+ b);
		
	}
}
