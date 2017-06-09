import java.util.Scanner;
class Program {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			int a[] = {5, 2, 1, 5, 6, 7};
			int s = a[0];
			int b = a[1];
			int c = a[2];
			int i = 0;
			int n = 6;
			while (i < 3) {
				a[i] = a[n - 1 - i];
				System.out.println(a[i]);
				i++;
			}
			a[3] = c;
			a[4] = b;
			a[5] = s;
			System.out.println(c);
			System.out.println(b);
			System.out.println(s);
		}
	}