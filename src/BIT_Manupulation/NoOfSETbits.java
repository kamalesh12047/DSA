package BIT_Manupulation;

public class NoOfSETbits {
    public static void main(String[] args) {
        int n = 5;
        int c = 0;
        while(n > 0){
            n = n & (n - 1); // Unset the rightmost set bit
            c++;
        }
        
        System.out.println(c);
    }
}
