import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int div;
		
		System.out.println("Enter numder:");
		int a = scanner.nextInt();
		
		System.out.println("Enter 2 number");
		int b = scanner.nextInt();
		
		div = a / b;
		
		System.out.println("a div b = " + div);
	}
}
