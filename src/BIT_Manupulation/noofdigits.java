package BIT_Manupulation;
public class noofdigits {
    public static void main(String[] args) {
        int base = 2;
        int n = 6;
        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);
    }
}
