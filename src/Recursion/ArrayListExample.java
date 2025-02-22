package Recursion;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 45, 78, 90};
        int target = 45;
        System.out.println(sa(arr, target, 0)); // Start index from 0
    }

    static ArrayList<Integer> sa(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list; // Base case: if we've reached the end of the array, return an empty list
        }

        if (arr[index] == target) {
            list.add(index); // Add current index if it matches the target
        }

        // Recursively get indices from the rest of the array
        list.addAll(sa(arr, target, index + 1));
        
        return list;
    }
}


