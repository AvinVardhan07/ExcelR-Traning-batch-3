import java.util.Scanner;

public class Demo004Prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
