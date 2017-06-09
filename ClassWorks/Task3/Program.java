import java.until.Scaner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a%2 == 0) {
			System.out.printLn("EVEN");
		} else {
			System.out.printLn("NOT EVEN")
		}
	}
}