import java.util.*;
import java.io.*;
class SimpleInterest
{
	public static void main(String args[])
	{
		int p,t,r,SI;
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle,Time,rate");
		p =sc.nextInt();
		r =sc.nextInt();
		t =sc.nextInt();
		SI = (p*t*r)/100;
		System.out.println("Simple Interest :" + SI );
	}
}