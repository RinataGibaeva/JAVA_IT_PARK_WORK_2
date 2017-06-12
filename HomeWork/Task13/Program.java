//*сумма всех элементов*//
import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		 int[] a = {6, 9, 5, 2, 8, 1};
		 int sum = 0;
		 
		 for (int i = 0; i < 6; i++){
			 sum = sum + a[i];
		 }
		 
		 System.out.println("Sum of the array: " + sum);
		
	}
}