import java.util.Scanner;

public class Demo005Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user-name: ");
        String u = sc.nextLine();
        System.out.print("Enter the pass: ");
        String p = sc.nextLine();

        while (u.equals("avin") && p.equals("999")) {
            System.out.println("logged in");
            break;
        }

    }
}
