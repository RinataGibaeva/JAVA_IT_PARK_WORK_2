import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int i = 2;
		int locmax = 0;
		System.out.println("enter the number of numbers: ");
		int n = scanner.nextInt();
		System.out.println("enter " + n + " numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		while (i < n) {
			int c = scanner.nextInt();
			if ((b > a) && (b > c)) {
				locmax++;
				a = b;
				b = c;
			} else {
				a = b;
				b = c;
			}
			i++;
		}
		System.out.println("number of local max: " + locmax);
	}
}