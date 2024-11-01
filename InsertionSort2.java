class InsertionSort2{

	public static void main(String[] args){

	int[] a = {15,9,8,36,14,56,98};
	//mehtod calling
	insertionSort(a);

	}

	public static void insertionSort(int[] a){

		int n = a.length;
	
		for(int i = 1;i<n;i++){
				int key = a[i];
				int j =i-1;
			while(j>=0 && a[j] >key){


					a[j+1]=a[j];
					j--;
				}

			a[j+1] = key;

			}
     for(int p:a){
			System.out.print(p+" ");
		}
		
	}

}