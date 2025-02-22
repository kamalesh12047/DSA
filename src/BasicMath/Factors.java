package BasicMath;
import java.util.ArrayList;
public class Factors {
    public static void main(String[] args) {
        int n = 20;
        Fac(n);
    }
    static void Fac(int x){
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 1; i <=Math.sqrt(x) ; i++) {
            if(x % i == 0){
                if(x/i == i){
                    System.out.print(i + "  ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(x/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
