import java.util.Scanner;

public class Demo8 {
    // private static String user;
    // private static String pass;
        
            public static void main(String[] args) {
                // String username = "Avin";
                // String password = "999888";
                String user;
                String pass;
                  
                Scanner sc = new Scanner(System.in);
        
                do{
                    System.out.println("enter the username: ");
                    user = sc.nextLine();
        
                    System.out.println("enter the password: ");
                    pass = sc.nextLine();
                }while(user == "Avin"  && pass == "999888");

                System.out.println("username is: "+user   +"password: " +pass);

            sc.close();
    }
}
