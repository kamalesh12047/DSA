package arrays.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GreatCadies1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int  extracandies = 3;
        System.out.println(kidsWithCandies(candies, extracandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        ArrayList<Boolean> c = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                c.add(true);
            }
            else{
                c.add(false);
            }
        }
        return c;
    }
}
