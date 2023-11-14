import java.util.Arrays;

public class sort_selection {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        System.out.print("Array before selection sort:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.print("Array after selection sort:");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selectionSort(int[] arr){
       
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }
    private static int getMaxIndex(int[]arr, int s, int e){
        int max = s;
        for (int i = s; i <= e; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
