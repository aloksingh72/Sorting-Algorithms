//Dated ->

class MergeSort3{

	public static void main(String[] args){

		int[] a = {12,9,5,4,3,6,7,8,9};
		//method calling

		mergeSort(a,0,a.length-1);

		for(int p:a){

				System.out.print(p+" ");
			}
		

	}

	//method declaration
	public static void mergeSort(int[] a,int si,int ei){

		if(si<ei){
			
				int mid = si+(ei-si)/2;
	

				mergeSort(a,si,mid);
				mergeSort(a,mid+1,ei);
			
				merge(a,si,mid,ei);
		}
	
	}

	public static void merge(int[] a,int si,int mid,int ei){

			int[] merged = new int[ei-si+1];
			int indx1=si;
			int indx2 = mid+1;
		
			int x=0;

			while(indx1 <= mid && indx2 <=ei){
			
					if(a[indx1] < a[indx2]){

						merged[x++] = a[indx1++];
					}
				
					else{

							merged[x++] = a[indx2++];

						}
				}


				while(indx1 <= mid){

					merged[x++] = a[indx1++];
				}
	
			while(indx2 <=  ei){

					merged[x++] = a[indx2++];
			}

			for(int i =0,j=si;i<merged.length;i++,j++){

					a[j] = merged[i];
	
				}
			
		}

	


}