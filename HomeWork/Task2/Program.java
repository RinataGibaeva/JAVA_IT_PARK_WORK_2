import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum;
		
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		
		System.out.println("Enter 2 number:");
		int b = scanner.nextInt();
		
		System.out.println("Enter last number:");
		int c = scanner.nextInt();
		
		sum = a + b + c;
		
		System.out.println("Sum of all numbers:" + sum);
	}
}