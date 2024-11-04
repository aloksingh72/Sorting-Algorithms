//insertion sort pratice
class InsertionSort1{
	
	public static void main(String[] args){
	
	int[] a= {5,95,65,32,12,0,36};
	//method calling

	insertionSort(a);
for(int p:a){

	System.out.print(p+" ");
	}

	}

	//method declaration

	public static void insertionSort(int[] a){

		int n = a.length;
	
		for(int i =1;i<n;i++){
			
				int key = a[i];
			int j = i-1;

		while(j>=0 && a[j] >key){
				a[j+1] = a[j];
			   j--;

				}

			a[j+1] = key;

			
			}
		
	}


}