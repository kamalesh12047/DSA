package Recursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(Ship("","Harshini")); 
        System.out.println(Ship("Harshini")); 
        System.out.println(Shipreq("appapple"));
    }
    static String Ship(String n,String up ){
        if(up.isEmpty()){
            return ""; 
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return Ship(n,up.substring(1));
        }
        else{
           return  ch + Ship(n+ch,up.substring(1));
        }
    }
    static String Ship(String up){
        if(up.isEmpty()){
            return ""; 
        }
        if(up.startsWith("Harsh")){
            return Ship(up.substring(5));
        }
        else{
            return up.charAt(0) + Ship(up.substring(1));
        }
    }
    static String Shipreq(String up){
        if(up.isEmpty()){
            return ""; 
        }
        if(up.startsWith("app") && !up.startsWith("apple") ){
            return Ship(up.substring(3));
        }
        else{
            return up.charAt(0) + Ship(up.substring(1));
        }
    }
}

