//*удаление дубликатов со здвигами*//
class Program {
	public static void main(String[] args) {
		int[] a = {1,3,2,6,7,4,7,3,5};
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					for (int z = j; z < n - 1; z++){
						a[z] = a[z + 1];
					}
					n--;
					if (a[i] == a[j]) {
						j--;
					}
				}
			}	
		}

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}