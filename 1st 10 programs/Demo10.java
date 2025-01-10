
import java.util.Scanner;

class InnerDemo10 {

   private String customer;
    private long bankAcc;
    private double balance;

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the username: ");
        customer = sc.nextLine();

        System.out.println("enter the bankAcc: ");
        bankAcc = sc.nextLong();

        System.out.println("enter the balance: ");
        balance = sc.nextDouble();
    }



    void display(){
        System.out.println("username:"+customer + "\nbankAcc:"+bankAcc +"\n balance:"+balance);
    }

}

public class Demo10 {
    public static void main(String[] args) {
            InnerDemo10 obj = new InnerDemo10();
            obj.input();
            obj.display();
    }
}
