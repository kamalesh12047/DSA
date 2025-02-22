package BIT_Manupulation;
public class magicno {
    public static void main(String[] args) {
        int n = 6;
        System.err.println(magic(n));
    }
    static int magic(int n){
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n & 1;
            ans += base * last;
            base *= 5;
            n = n>>1;
        }
        return ans;
    }
}
