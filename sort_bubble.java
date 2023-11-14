import java.util.Arrays;

public class sort_bubble {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 7, 6, 14, 9 };
        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println();
        System.out.println("Array after bubble sort: ");
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
