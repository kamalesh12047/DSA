package functions;
import java.util.ArrayList;
import java.util.Scanner;
public class dynamic {

    public static void main(String[] args) {
        
        
        Scanner k = new Scanner(System.in);
        System.out.print("enter the no of terms?:");
        int n = k.nextInt();
        ArrayList<Integer> list = new ArrayList<>(2);
        int i;
        for(i=0;i<n;i++){
            int j = k.nextInt();
            list.add(j);
        }


        // searching for specfic element
        System.out.print("enter the element to be searched?:");
        int p = k.nextInt();
        System.out.println(list.contains(p));
        System.out.println(list);

        // inserting an element in an specfic place if the place is occupied if it is replaced by that element
        System.out.print("enter the element to be inserted?:");
        int l = k.nextInt();

        System.out.print("enter where the element to be placed?:");
        int q = k.nextInt();

        list.set(q,l);
        System.out.println(list);

        // deleting an elementby their index

        System.out.print("enter the index no of the element to be deleted?:");
        int x = k.nextInt();
        list.remove(x);
        System.out.println(list);

        // get any element by their index

        for(i=0;i<3;i++){
            System.out.println(list.get(i));
        }

    }
}
