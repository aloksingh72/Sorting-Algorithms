//dated ->17/11/2024
//Shambu Sir's method 
//most efficient method
class MergeSort2{

	public static void main(String[] args){
	
		int[] a={8,9,6,32,45,1,2,36,5,78,99};

		//methdo calling
		mergeSort(a,0,a.length-1);

		for(int p:a){

				System.out.print(p+" ");
			}


	}

	//method declaration
		//divide logic
	public static void mergeSort(int[] a,int si,int ei){

			if(si<ei){

				int mid = si+ (ei-si)/2;
				mergeSort(a,si,mid);
				mergeSort(a,mid+1,ei);
				merge(a,si,mid,ei);
					

			}

	}

		public static void merge(int[] a,int si,int mid,int ei){

			int[] merged = new int[ei-si+1];
			int indx1 = si;
			int indx2 = mid+1;
			int k=0;
				while(indx1 <= mid && indx2 <= ei){

							if(a[indx1] <a[indx2]){

								merged[k++] = a[indx1++];
									
									
						}
						else{
							merged[k++] = a[indx2++];
							 
								
								
							}
					}

				//remaining elements from leftArray side
				while(indx1 <= mid){

						merged[k++] = a[indx1++];
							
							

				}


				//remaining elements from right array
			while(indx2 <= ei){

					merged[k++] = a[indx2++];
						
						
			}
			
			//copy back to array a form merged array
			for(int i=0;i<merged.length;i++){
						a[si+i]= merged[i];
				}
		}

}