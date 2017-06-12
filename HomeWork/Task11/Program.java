import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		double average = 0;
		
		System.out.println("enter the number of numbers");
		int n = scanner.nextInt();
		System.out.println("Enter " + n + " numbers");
		
		while (i < n) {
			double a = scanner.nextDouble();
			average = average + a;
			i++;
		}
		average = average/n;
		System.out.println("average numbers: " + average);
	}
}