package arrays.Sorting;
public class InsertionSort{


    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  //3
            int j = i - 1;     //0
            System.out.println("Inserting " + key);
            while (j >= 0 && arr[j] > key) {               // 4>0 and 4>3
                // Debug: Print movement of elements
                System.out.println("Moving " + arr[j] + " to position " + (j + 1));
                arr[j + 1] = arr[j];                       // arr[1] = 3
                j--;                                       
            }
            arr[j + 1] = key; // Place the key in its correct position
            // Debug: Print array after each insertion
            System.out.println("Array after inserting " + key + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12};
        insertionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
