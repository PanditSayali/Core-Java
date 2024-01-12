import java.util.Scanner;

public class calculation {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		a = sc.nextInt();
		System.out.println("Enter a another no: ");
		b = sc.nextInt();
		System.out.println("Sum is: " + (a + b));
		System.out.println("substaction is: " + (a - b));
		System.out.println("Multiplication is : " + a * b);
		System.out.println("division is : " + a / b);
		System.out.println("remender is: " + a % b);

	}
}