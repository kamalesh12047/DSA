package BasicMath;

public class EuclideanAlgorithm {
    
    // Function to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        // Iterate until the remainder is zero
        while (b != 0) {
            // Store the remainder of a divided by b
            int remainder = a % b;
            // Update a to b, and b to the remainder
            a = b;
            b = remainder;
        }
        // The GCD is the last non-zero value of a
        return a;
    }

    public static void main(String[] args) {
        int a = 56, b = 98;
        
        // Output the result of the GCD computation
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

