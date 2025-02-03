
import java.util.*;

public class Demo008 { // important question asking the prmpt again and agian broo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, pass;
        do {
            System.out.println("Hello Mallareddy Unversity, Please Login: ");
            System.out.print("Enter username: ");
            username = sc.next();
            System.out.print("Enter password: ");
            pass = sc.next();
        } while ((!username.equals("AVin")) || (!pass.equals("Avin_123"))); // runs again and again if the password or
                                                                            // username is incorrect as it asks again
                                                                            // and agian until its correct and if they
                                                                            // are correct the prints succesful and
                                                                            // comes out of loop
        System.out.println("Successfully logged in.");
        sc.close();
    }
}