package BIT_Manupulation;

public class FlipImage832 {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        flipAndInvertImage(image);
        
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] n : image){
            for(int i = 0; i < (image[0].length + 1)/2;i++){
                int t = n[i] ^ 1;
                n[i] = n[image[0].length - 1 - i] ^ 1;
                n[image.length - 1 - i] = t;
            }
        }
        return image; 
    }

}
