import java.util.Scanner;

class Program {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int i = 2;
		int x = scanner.nextInt();
		boolean isPrime = true;
		 
		while (i * i <= (x)) {
			if (x % i == 0) 
			if (x % i == 0) {
				isPrime = false;
				break; 
			}
		i++;		
		}
		if (isPrime == true) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}
		
	}
}