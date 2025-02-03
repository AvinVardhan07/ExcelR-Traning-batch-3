
import java.util.*;

class Demo006Prac {
    public static void main(String[] args) {
      //  boolean a = true;
        Scanner sc = new Scanner(System.in);
      
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            
            while((id.equals("Avin")) && (pass.equals("999"))) {
                System.out.println("Hello ");
                break;
            } 
            System.out.println("go back");

            sc.close();
        }
      
    }
