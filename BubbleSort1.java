class BubbleSort1{

	public static void main(String[] args){

	int[] a = {30,20,70,15,90,89,65};

		for(int x:a){
			System.out.print(x+" ");
		}
	System.out.println();
	
		//method calling
		bubbleSort(a);
		for(int p:a){
		System.out.print(p+" ");
			}

		}
	
	//method declaration
		public static void bubbleSort(int[] a){

			int n = a.length;
			for(int i = 0 ;i<n-1;i++)
			{

				for(int j=0;j<n-1-i;j++)
				{
					if(a[j] > a[j+1]){
								int temp = a[j];
								a[j] = a[j+1];
								a[j+1] = temp;
						}
					
					
				}
			}

		}


}