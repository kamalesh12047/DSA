package BIT_Manupulation;
public  class unique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(uni(arr));
    }
    static int uni(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

    
}
