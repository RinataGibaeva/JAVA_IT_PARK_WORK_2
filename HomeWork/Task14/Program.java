//*среднее арифметическое элементов массива*//
import java.util.Scanner;

class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int[] a = {2, 5, 1, 5, 2, 3};
		int average = 0;
		
		for (int i = 0; i < 6; i++) {
			average = average + a[i];
		}
		average = average / 6;
		System.out.println("average of the array: " + average);
	}
}