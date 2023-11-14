import java.util.Arrays;

public class sort_quick {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 7, 6, 14, 9 };
        System.out.println("Array before quick sort:");
         System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Array after quick sort: ");
         System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[]nums, int low, int high){
        if(low>=high){
            return;
        }
        int s = low, e = high;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;    
            }
        }
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
