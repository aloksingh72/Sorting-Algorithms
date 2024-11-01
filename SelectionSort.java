class SelectionSort{

	public static void main(String[] args){
	
	int[] a = {10,89,56,12,45,36,90};

	//method calling
		selectionSort(a);


		for(int p:a){
			System.out.print(p+" ");
			}
		
		}
    //method declaration
	
	public static void selectionSort(int[] a){

		int n = a.length;
		for(int i =0;i<n-1;i++){
		
				int min = a[i];
			int ind = i;

				for(int j=i+1;j<n-1;j++){
					 
				   if(a[j] < min){
			 
							min = a[j];
							ind = j;
						}
					
				}

				a[ind]= a[i];
				a[i] = min;
			}


		}

}