class swapwithout
{
	public static void main(String args[])
{
	int a= 20,b=10;
	System.out.println("Before swap");
	System.out.println("a :" + a);
	System.out.println("b :" + b);
     	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap");
	System.out.println("a :" + a);
	System.out.println("b :" + b);
 	
}
}