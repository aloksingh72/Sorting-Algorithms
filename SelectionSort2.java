//Dated-> 03/11/2024
//Ques-> Selection Sort Practice program
public class SelectionSort2 {
    public static void main(String[] args) {
        int[] a = {4,5,9,8,78,65,9,4,0};
        //methdo calling
        selectionSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void selectionSort(int[] a){
        int n = a.length;
        for(int i =0;i<n-1;i++){
            int minInd = i;
            for(int j =i+1;j<n;j++){
                if(a[j] <a[minInd]){
                    minInd = j;
                }
            }
            int temp = a[minInd];
            a[minInd] = a[i];
            a[i]  =temp;
        }
    }
    
}
