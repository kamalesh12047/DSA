package functions;
public class palindeomenum {
    public static void main(String[] args) {
        int x = 101;
        System.out.println(isPalindrome(x));
    }
    static  boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        // Reverse half of the digits
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Check if the original half and reversed half are equal
        // For odd number of digits, ignore the middle digit by dividing reversedHalf by 10
        
        return x == reversedHalf || x == reversedHalf / 10;
    }
    
}
