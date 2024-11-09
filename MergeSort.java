//Dated ->07/11/2024
// Sorting by using Merge sort
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9,8,3,4,1,6,7,5,4};
        //method calling
        mergeSort(arr,0,arr.length-1);

        for(int num:arr){
            System.out.print(num+" ");
        }


    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left < right){

            int mid = (left + right) /2;
            mergeSort(arr,left,mid);
            mergeSort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }

    }
    public static void merge(int[] arr,int left,int mid,int right){
        //finding the size of two sub arrays
        int n1 = mid -left +1;
        int n2 = right -mid;

        // creating the temporary array
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // copying the data to the sub arrays
        for(int i =0;i<n1;i++){
            lArr[i] = arr[left +i];

        }
        for(int j =0 ;j<n2;j++){
            rArr[j] = arr[mid + 1 +j];
        }

        //merge the temporary array back into the original array

        int i =0;
        int j =0;
        int k =left;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++; 
            }
            k++;
        }

        //copy the remaining elements of left side array into  original arrray
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }

        
        
    }
    
}
