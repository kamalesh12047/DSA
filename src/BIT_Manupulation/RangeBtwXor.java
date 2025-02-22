package BIT_Manupulation;

public class RangeBtwXor {
    public static void main(String[] args) {
        int a = 7,b = 10;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(xor(ans));        
    }
    static int xor(int f){
        if(f % 4 == 0){
            return f;
        }
        if(f % 4 == 1){
            return 1;
        }
        if(f % 4 == 2){
            return f + 1;
        }
        if(f % 4 == 3 ){
            return 0;
        } 
        return -1;
    }
}
