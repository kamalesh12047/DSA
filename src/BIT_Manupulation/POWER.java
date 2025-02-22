package BIT_Manupulation;

public class POWER {
    public static void main(String[] args) {
        int x = 18;
        int n = 2;

        int ans = 1;

        while(n > 0){
            if((n & 1) == 1){
                ans *= x;
            }
            x *= x;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
