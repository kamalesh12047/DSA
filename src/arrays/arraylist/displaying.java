package arrays.arraylist;
import java.util.ArrayList;
public class displaying{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(55);
        System.out.println(list);
        System.out.println(list.contains(12));
        list.set(1,1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
