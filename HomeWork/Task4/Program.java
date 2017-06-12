import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mod;
		
		System.out.println("Enter numder:");
		int a = scanner.nextInt();
		
		System.out.println("Enter 2 number");
		int b = scanner.nextInt();
		
		mod = a % b;
		
		System.out.println("a mod b = " + mod);
	}
}