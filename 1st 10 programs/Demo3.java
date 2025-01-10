import java.util.Scanner;
public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();


        if(a>b && a>c){
            System.out.println("a is greater broo");
        }
        else if(b>a && b> c){
            System.out.println("b is greater broo");

        }
        else{
            System.out.println("c is greater broo");
        }
          sc.close();
    
    }
}