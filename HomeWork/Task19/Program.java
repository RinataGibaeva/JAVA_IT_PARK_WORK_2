import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter size array: ");
		int n = scanner.nextInt();
		
		System.out.println("enter array: ");
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
		}
		
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Bubble-soft: ")
		for (int i = 0; i < n; i++) {
			System.out.println(x[i]);
		}
	}
}