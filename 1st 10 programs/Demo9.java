import java.util.Scanner;

public class Demo9 {

    private String customer;
    private long bankAcc;
    private double bal;

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the name: ");
        customer = sc.nextLine();

        System.out.println("Enter the bankAccNo: ");
        bankAcc = sc.nextLong();

        System.out.println("Enter the balance: ");
        bal = sc.nextDouble();
    }

    void display() {
        System.out.println("name: " + customer);
        System.out.println("bank account number: " + bankAcc);
        System.out.println("bal: " + bal);
    }

    public static void main(String[] args) {
        Demo9 obj = new Demo9();

        obj.input();
        obj.display();
    }
}
