public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 19, 23, 45};
    int target = 19;
    int ans = BinarySearch(nums,0, 5, target);
    System.out.println(ans);
    }
    static int BinarySearch(int[] arr,int s, int e, int key){
       int mid = s + (e-s)/2;
       while(s<=e){
        if(arr[mid]==key){
           return mid;
        }
        else if(arr[mid]>key){
            e = mid-1;
        }
        else{
            s = mid + 1;
        }
        mid = s + (e-s)/2;
         
       }
     
       return -1;
        
    }
    }

