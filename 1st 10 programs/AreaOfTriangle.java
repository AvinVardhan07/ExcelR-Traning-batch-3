
import java.util.Scanner;
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE BASE: ");
        double base = sc.nextInt();

        System.out.println("ENTER THE HEIGHT: ");
        double height = sc.nextInt();


        double area = 0.5 * base * height;

        System.out.println("THE AREA OF THE TRIANGLE IS: "+area);

        sc.close();


    }
}