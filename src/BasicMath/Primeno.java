package BasicMath;

public class Primeno {
    public static void main(String[] args) {
        int n = 40;
        // System.out.println(isprime(no)); // Print the result
        boolean[] prime = new boolean[n + 1];
        System.out.println(prime[0]);
        sieve(prime,n); 
    }

    // static boolean isprime(int n) {
    //     if (n <= 1) { // Corrected condition (numbers <= 1 are not prime)
    //         return false;
    //     }
    //     int c = 2;
    //     while (c * c <= n) { // Check divisors up to sqrt(n)
    //         if (n % c == 0) {
    //             return false; // If divisible, not a prime
    //         }
    //         c++;
    //     }
    //     return true; // If no divisors found, it's prime
    // }

                                                 // MORE OPTIMIZED METHOD
    
    static void sieve(boolean[] prime,int n){
        for(int i =2; i*i<=n;i++){
            if(!prime[i]){
                for(int j = i * 2; j <= n; j += i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i <=n;i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}

