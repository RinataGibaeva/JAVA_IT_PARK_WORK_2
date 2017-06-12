import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1; 
		
		System.out.println("Enter the number of numbers");
		
		int n = scanner.nextInt();
		System.out.println("Enter " + n + " numbers");
		int min = scanner.nextInt();
		
		while (i < n) {
			int a = scanner.nextInt();
			if (a < min) {
				min = a;
			} 
			i++;
		}
		System.out.println("Min numbers: " + min);
	}

}