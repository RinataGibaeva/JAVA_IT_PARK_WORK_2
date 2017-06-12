//*кол-во элементов, стоящих на четных позициях*//
import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = {3, 7, 9, 3, 1, 3, 2, 4};
		int odd = 0;
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				odd = odd + 1;
			}
		}
	System.out.println("number of odd array: " + odd);
	}
}