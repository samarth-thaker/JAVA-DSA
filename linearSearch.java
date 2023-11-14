public class linearSearch{
public static void main(String[] args) {
    int[] nums = {23, 45, 1, 2, 8, 19};
    int target = 19;
    int ans = LinearSearch(nums, target);
    System.out.println(ans);
}
static int LinearSearch(int[] arr, int key){
    if(arr.length==0){
        return -1;
    }
    for(int index=0; index<arr.length;index++){
        
        int element = arr[index];
        if(element==key){
            return index;
        }
       

    }
    return -1;
    
}
}