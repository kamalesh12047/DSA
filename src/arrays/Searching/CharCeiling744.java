package arrays.Searching;

public class CharCeiling744{
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (letters[mid] > target) {
                end = mid - 1;  // Narrow the search to the left half
            } else {
                start = mid + 1;  // Narrow the search to the right half
            }
        }
        
        return letters[start % letters.length];  // Return the smallest letter greater than target
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println("Smallest letter greater than target: " + nextGreatestLetter(letters, target));
    }
}

