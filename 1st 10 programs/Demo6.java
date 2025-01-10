import java.util.Scanner;
public class Demo6 {
      
    public static void main(String[] args) {

        String username = "Avin";
        String password = "999888";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the username: ");
    String user = sc.nextLine();

    System.out.println("enter the password: ");
    String pass = sc.nextLine();

    // if(    (user.equals(username)) && (pass.equals(password)))  {
    //     System.out.println("logged in..");
    //   }   
    //   else{
    //       System.out.println("nothing");
    //   }
    
    
    
    
    if(    user == username  && pass == password)  {
      System.out.println("logged in..");
    }   
    else{
        System.out.println("nothing");
    }
      sc.close();
    }
}    

