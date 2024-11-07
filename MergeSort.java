public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9,8,3,1,6,7,5,4};
        //method calling
        mergeSort(arr,0,arr.length-1);


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
        //finding the length of left and right portion of the array
        int n1 = mid -left +1;
        int n2 = right -mid;

        // creating the new array
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        
    }
    
}
