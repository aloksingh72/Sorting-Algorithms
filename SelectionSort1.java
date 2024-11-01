class SelectionSort1{

		public static void main(String[] args){
	

			int[] a = {5,8,21,96,14,3,0,90};
	System.out.println("Array before sorting");
	for(int p:a){
		System.out.print(p+" ");
		}
	
	System.out.println();
		//method calling
		selectionSort(a);
		
		
		}


	public static void selectionSort(int[] a){

			int n= a.length;
		for(int i =0;i<n-1;i++){
				int minInd = i;
	
			for(int  j =i+1;j<n;j++){

					if(a[j] < a[minInd]){
							
								minInd = j;
						}
				}
			int temp = a[minInd];
			a[minInd] = a[i];
			a[i] = temp;
				
			}


	for(int x:a){

				System.out.print(x+" ");
			}
	
		}

}