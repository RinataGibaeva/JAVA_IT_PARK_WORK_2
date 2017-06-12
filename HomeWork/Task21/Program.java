class Program {
	public static void main(String[] args) {
		int x = 3231;
		int t = 1000;
		int n = 4;
		for (int i = 0; i < n; i++) {
				int z = x / t;
				char f = (char)(z + '0');
				x = x % t;
				t = t / 10;
				if (i == 3){
					System.out.print(z);
				} else 
					System.out.print(z + ","); 
		}
	}
}