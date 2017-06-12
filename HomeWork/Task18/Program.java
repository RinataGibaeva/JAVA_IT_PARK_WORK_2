import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter size array: ");
		
		int n = scanner.nextInt();
		int[] x = new int[n];
		
		System.out.println("enter array: ");
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
		}
		
		int b = n - 1;
		
		for (int a = 0; a <= b; a++) {
			int min = x[a];
			for (int i = a; i < n; i++){
				if (x[i] < min) {
					min = x[i];
				}	
			}
			for (int i = a; i < n; i++) {
				if ( min == x[i]) {
					int temp = x[i];
					x[i] = x[a];
					x[a] = temp;
				}
			} 
		}	   
		
		System.out.println("Select-soft: ");
		for (int i = 0; i < n; i++) {
			System.out.println(x[i]);
		}	
	}
}