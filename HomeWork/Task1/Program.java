//*банкомат*//
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number: ");
		int a = scanner.nextInt();
		
		int a5000 = a / 5000;
		System.out.println("5000 - " + a5000);
		a = a % 5000;
		
		int a1000 = a / 1000;
		System.out.println("1000 - " + a1000);
		a = a % 1000;
		
		int a500 = a / 500;
		System.out.println("500 - " + a500);
		a = a % 500;
		
		int a100 = a / 100;
		System.out.println("100 - " + a100);
		a = a % 100;
		
		int a50 = a / 50;
		System.out.println("50 - " + a50);
		a = a % 50;
		
		int a10 = a / 10;
		System.out.println("10 - " + a10);
		a = a % 10;
		
		int a5 = a / 5;
		System.out.println("5 - " + a5);
		a = a % 5;
		
		System.out.println("1 - " + a);
		
		
		
		
	}
}