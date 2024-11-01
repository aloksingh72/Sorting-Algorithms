class InsertionSort{

	public static void main(String[] args){


		int[] a = {9,12,16,56,98,23,6,0,4};
		//method calling
		insertionSort(a);

		for(int i =0;i<a.length;i++){

				System.out.print(a[i]+" ");
			}

		}
		
		//method declaration
	public static void insertionSort(int[] a){

		int n = a.length;
	for(int i =1;i<n;i++){
		int key = a[i];
		int j =i-1;
		
	while(j>=0 && a[j] >key){

				a[j+1] =a[j];
					j--;
			}

		a[j+1] = key;


		}

	}


}