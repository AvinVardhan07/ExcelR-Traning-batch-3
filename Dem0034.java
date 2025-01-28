
import java.util.Scanner;


public class Dem0034 {
    public static void main(String[] args) {
      int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");


          x = sc.nextInt();
           
          if(x % 2 == 0 ){
              System.out.println("even number");
          }
          else{
            System.out.println("odd");
          }
          
       sc.close();
        
    }
};
