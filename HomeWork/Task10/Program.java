import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int max = 0;
		System.out.println("enter the number of numbers:");
		
		int n = scanner.nextInt();
		System.out.println("enter " + n + " numbers");
		
		while (i < n) {
			int a = scanner.nextInt();
			if (a > max) {
				max = a;
			}
			i++;
		}
		System.out.println("max number: " + max);
	}
}