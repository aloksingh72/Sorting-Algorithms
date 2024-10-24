public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {12,15,90,10,65,31,99,2};
        //metho calling
        bubbleSort(a);
        for(int p:a){
            System.out.print(p+" ");
        }


    }
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for(int i =0;i<n-1;i++){
            int x =0;
            for(int j=0;j<n-1-i;j++){
                if(a[j]> a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    x++;
                }

            }
            // if array is already sorted then it will break
            if(x==0){
                break;
            }

        }



    }
    
}
