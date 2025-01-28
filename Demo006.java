

import java.util.*;

class Demo006{
    public static void main(String[] args) {
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while(a){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if((id.equals("Avin")) && (pass.equals("Revanth_123"))){
                System.out.println("Hello Avin, You are welcome ");
                break;
            }else{
                System.out.println("Your credentials don't match");
            }
        }
        sc.close();
    }
};