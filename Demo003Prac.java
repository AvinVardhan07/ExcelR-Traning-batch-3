import java.util.Scanner;

public class Demo003Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.err.println("x");
        } else if (y > x && y > z) {
            System.out.println("y");
        } else {
            System.out.println("z");
     
        }
        sc.close();
    }
}
