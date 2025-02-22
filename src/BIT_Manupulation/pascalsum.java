package BIT_Manupulation;
public class pascalsum {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Pascal(n));
    }
    static int Pascal(int n){
        return 1 << n;
    }
}


