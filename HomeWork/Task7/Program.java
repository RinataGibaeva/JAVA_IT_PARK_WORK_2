import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int b = 1;
		
		System.out.println("enter 10 numbers:");
		
		while (i < 10){
			int a = scanner.nextInt();
			if (a % 2 == 0) {}
				else {
					b = b * a;
				}
			i++;
		}
		
		System.out.println("Product of odd numbers:" + b);
	}
}