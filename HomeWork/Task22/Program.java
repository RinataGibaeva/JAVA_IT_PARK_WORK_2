import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("size 1 array(max 100): ");
		int n = scanner.nextInt();
		
		int text[] = new int[n];	
		System.out.println("enter 1 array, " + n + " numbers");
		for (int i = 0; i < n; i++){
			text[i] = scanner.nextInt();
		}
			
		System.out.println("size 2 array(max 10): ");
		int m = scanner.nextInt();
		int word[] = new int[m];
		System.out.println("enter 1 array, " + m + " numbers");
		for (int i = 0; i < m; i++){
			word[i] = scanner.nextInt();
		}
			
		boolean a = true;
		int position = 0;
		for (int i = 0; i < n; i++) {
			if (word[0] == text[i]) {
				position = i;
				for (int j = 1; j < m; j++) {
					if (word[j] == text[i + j]) {
						a = true;
					} 
						else {
							a = false;
							break;
						}	
				}
			} 
		}
		
		if (a) {
			System.out.println("position: " + position);
		} else {
			System.out.println("'text' dont have 'word'!");
		}
	}
}