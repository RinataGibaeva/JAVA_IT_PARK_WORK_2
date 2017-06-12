//*замена максимального и минимального*//
import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = {2, 5, 3, 0, 4, 3};
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < 6 ; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max number:" + max);
		
		for (int i = 0; i < 6; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("min nuber:" + min);
		
		for (int i = 0; i < 6; i++) {
			if (max == a[i]) {
				a[i] = 0;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			if (min == a[i]) {
				a[i] = 0;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
	}
	
}