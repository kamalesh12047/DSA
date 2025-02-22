package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(getPermutations("", "abc"));
    }

    static ArrayList<String> getPermutations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String leftPart = up.substring(0, i);  
            String rightPart = up.substring(i + 1);
            ans.addAll(getPermutations(p + ch, leftPart + rightPart));
        }
        
        return ans;
    }
}
