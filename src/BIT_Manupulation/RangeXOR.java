package BIT_Manupulation;

public class RangeXOR {
    public static void main(String[] args) {
        int range = 7;
        System.out.println(xor(range));        
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
