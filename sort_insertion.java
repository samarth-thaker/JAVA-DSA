import java.util.Arrays;

public class sort_insertion {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 7, 6, 14, 9 };
        System.out.println("Array before insertion sort:");
         System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println();
        System.out.println("Array after insertion sort: ");
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
    
}
