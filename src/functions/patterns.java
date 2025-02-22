package functions;
public class patterns{
    public static void main(String[] args) {
        int n = 5;
        Pattern4(n);
    }


    static void Pattern1(int n){
        for (int i =1;i<=n;i++) {
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n){
        for (int i =1;i<=n;i++) {
            for(int j = 1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        for (int i =1;i<=n;i++) {
            for(int j = 1; j<= n - i  + 1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n){
        for (int i =1;i<=n;i++) {
            for(int j = 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n){
        for (int i =0;i<n;i++) {
            int totalcol = i < n ? 2 * n - i - 1 : i;
            for(int j = 0; j<totalcol;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}