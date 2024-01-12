class Swap
{
	public static void main(String args[]){
        int a=20,b=10;
	int temp;
	System.out.println("Before Swaping");
	System.out.println("a :" + a);
	System.out.println("b :" + b);
	temp =a;
	a = b;
	b = temp;
	System.out.println("After Swaping b:");
	System.out.println("a :" + a);
	System.out.println("b :" + b);
	}
}