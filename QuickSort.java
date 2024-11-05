class QuickSort{
	public static void main(String[] args){
		
		int[] arr = {5,6,2,3,1,8,4};
	
		//mehtod calling
		quickSort(arr,0,arr.length-1);


		//printing the sorted array
		for(int num:arr){
		System.out.print(num+" ");
	
		}
	}


	//mehtod declaration 
	// quick sort
	public static void quickSort(int[] arr,int low,int high){

	if(low < high){
			
			int pi = partition(arr,low,high);
		
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	public static int partition(int[] arr,int low,int high){

		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low;j<high;j++){
	
			if(arr[j] < pivot){

				i++;
			//Swap a[i] & a[j]

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		

     }
		
		
	
		int temp  = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

	return i+1;




  }

}