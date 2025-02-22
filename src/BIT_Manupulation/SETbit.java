package BIT_Manupulation;

public class SETbit {
    public static void main(String[] args){
        int num = 10;
        int i = 3;
        System.out.println(bit(num, i));
    }
    static int bit(int num,int n){
        return  n | (1<< n-1);
    }
}
