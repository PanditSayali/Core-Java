import java.util.Scanner;
class ASCII
{
	public static void main(String args[])
	{
	char ch;
	System.out.println("Enter a characcter:");
	Scanner sc = new Scanner(System.in);
	ch = sc.next().charAt(0);
	int a = ch;
	System.out.println("ASCII value " + ch + " is " + a);

	}
}