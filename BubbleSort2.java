class BubbleSort2{

	public static void main(String[] args){

		
			int[] a = {10,89,56,12,45,36,90};
			//method calling
			bubbleSort(a);

		for(int p:a){
		System.out.print(p+" ");

			}
		}

		//method declaration
		public static void bubbleSort(int[] a){

			int n = a.length;
			for(int i =0 ;i<n-1;i++){
					int x=0;

					for(int j=0;j<n-1-i;j++){

							if(a[j] > a[j+1]){
					
										int temp = a[j];
										a[j] = a[j+1];
										a[j+1] = temp;
										x++;
								}
						}
		
		if(x==0){
				break;
			}
				}
		}


}