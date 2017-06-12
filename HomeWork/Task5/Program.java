//*Считать число - 3 знака (0..255), вывести его двоичное представлены*//
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		int a = scanner.nextInt();
		
		int b = a % 2;
		a = a / 2;
		System.out.println(b);
		
		int c = a % 2;
		a = a / 2;
		System.out.println(c);

		int d = a % 2;
		a = a / 2;
		System.out.println(d);
		
		int e = a % 2;
		a = a / 2;
		System.out.println(e);
		
		int f = a % 2;
		a = a / 2;
		System.out.println(f);
		
		int g = a % 2;
		a = a / 2;
		System.out.println(g);
		
		int z = a % 2;
		a = a / 2;
		System.out.println(z);
		
		int x = a % 2;
		a = a / 2;
		System.out.println(x);
	}
}