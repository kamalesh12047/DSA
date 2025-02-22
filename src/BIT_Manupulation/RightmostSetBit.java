package BIT_Manupulation;

public class RightmostSetBit {
    public static void main(String[] args) {
        int num = 18; // Binary: 10010
        System.out.println(findRightmostSetBit(num)); // Output: 1 (0-based index)
    }

    static int findRightmostSetBit(int num) {
        if (num == 0) return -1; // No set bits in 0
        int isolatedBit = num & -num;
        return Integer.numberOfTrailingZeros(isolatedBit);
    }
}

