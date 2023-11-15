public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19};
    int target = 20;
    int ans = LinearSearch(nums,0,nums.length-1, target);
    System.out.println(ans);
    }
    static int LinearSearch(int[]arr, int s, int e, int key){
        if(s>e){
            return -1;
        }
        if(arr[s]==key){
            return s;
        }else{
            return LinearSearch(arr, s+1, e, key);
        }
    

    } 

}
