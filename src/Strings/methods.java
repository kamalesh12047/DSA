package Strings;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Thaniyas";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println("      Thaniyas        ".strip());
        System.out.println(Arrays.toString(name.split("a")));
    }
}
