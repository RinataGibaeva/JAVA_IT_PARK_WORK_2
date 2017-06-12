class Program {
	public static void main(String[] args){
		char a[] = {'3', '2', '3', '1'};
		int k = 0;
		int m = 1000;
		
		for (int i = 0; i < 4; i++) {
			k = k + (a[i] - '0') * m;
			m = m / 10;
		}
		System.out.println(k);
	}
}
