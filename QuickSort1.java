//dated->05/11/2024
// quick sort

public class QuickSort1 {
    public static void main(String[] args){

        int[] arr = {4,8,5,9,1,6,3,7,2};
        //method calling

        quickSort(arr,0,arr.length-1);

        for(int num :arr){
            System.out.print(num+" ");
        }

    }
    // method declaration quickSort 
    public static void  quickSort(int[] arr ,int low,int high){
        if(low < high){
            //recieving partition index from partiton method
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);

        }
    }

    public static int partition(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j =low;j<high;j++){

            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;



    }
    
}
