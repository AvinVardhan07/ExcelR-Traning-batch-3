import java.util.Scanner;

public class Demo059 {
    // Actual & our procedure condition: The number which is divisible by the 1
    // and it self is
    // called as the prime number and so here we are going the reverse format !!
    // as we are checking if a number is divisible by any other number other
    // than the one and it self its false and if not its true and note: the
    // iteration starts from the 2 bcoz numbers less than 2 are considered as a not
    // prime
    // numbers broo

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) { // any ways it will be divisile by it self and this is the condition for the
                                      // remianing numbers broo and if it is divisible bu any of the numbers the it
                                      // would not be considered as the prime number broo
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Demo059 obj = new Demo059();

        boolean bool = obj.isPrime(n); //

        if (bool) {
            System.out.println(n + " IS A PRIME NUMBER BROO");
        } else {
            System.out.println("NOT A PRIME NUMBER BROO");
        }

        sc.close();
    }
}
