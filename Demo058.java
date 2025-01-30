import java.util.Scanner;

public class Demo058 { // printing the factors of the given numbers broo

    void factor(int n) {
        System.out.println("Enter the number bro");

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " , ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required num: ");
        int n = sc.nextInt();
        Demo058 obj = new Demo058();
        obj.factor(n);

        sc.close();
    }
}
