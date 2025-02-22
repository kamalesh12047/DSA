package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for(int i =0; i < 26;i++){
            char ch = (char)('a' + 1);
            build.append(ch);
        }

        System.out.println(build.toString());
    }
}
