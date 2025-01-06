<<<<<<< HEAD
import java.util.Scanner;

public class Bank {
    private static String username;
    private static String bankbalance;
    private static int id;

    public static void accept() {
      
        String originalUsername = "user";
        String originalBalance = "999888";
        int originalId = 20;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            bankbalance = scanner.nextLine();

            System.out.print("Enter your age: ");
            id = scanner.nextInt();
            scanner.nextLine(); 

            
        } while (username == originalUsername && bankbalance == originalBalance && id == originalId);

        System.out.println("Details accepted.");
        scanner.close();
    }

    public static void display() {
        System.out.println("Entered username is: " + username);
        System.out.println("Entered phone number is: " + bankbalance);
        System.out.println("Entered age is: " + id);
    }

    public static void main(String[] args) {
        accept(); 
        display(); 
    }
}
=======
import java.util.Scanner;

public class Bank {

  
    private static String username;
    private static String bankbalance;
    private static int id;

    public static void accept() {
      
        String originalUsername = "user";
        String originalBalance = "999888";
        int originalId = 20;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            bankbalance = scanner.nextLine();

            System.out.print("Enter your age: ");
            id = scanner.nextInt();
            scanner.nextLine(); 

            
        } while (username == originalUsername && bankbalance == originalBalance && id == originalId);

        System.out.println("Details accepted.");
        scanner.close();
    }

    public static void display() {
        System.out.println("Entered username is: " + username);
        System.out.println("Entered phone number is: " + bankbalance);
        System.out.println("Entered age is: " + id);
    }

    public static void main(String[] args) {
        accept(); 
        display(); 
    }
}
>>>>>>> aa8632d8302a497dfa31412cfa4f1e11ac47cff5
