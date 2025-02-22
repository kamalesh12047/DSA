package BasicMath;
public class sqrt {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(newton_raplson(n));
        System.out.println(mySqrt(n));
    }
    static double newton_raplson(double n){
        double x = n;
        double root;
        while (true) { 
            root = 0.5 * (x + n/x) ;
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }   
                                                        // more effective
    static int mySqrt(double x){
        int n=(int)Math.sqrt(x);
        return n;
    }
}

    

