public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 19, 23, 45};
        int target = 19;
        int ans = BinarySearch(nums,0, 5, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[]arr, int s, int e, int key){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return BinarySearch(arr, s, mid-1, key);
        }
        else{
            return BinarySearch(arr, mid+1, e, key);
        }
    } 
}
