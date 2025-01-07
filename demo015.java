public class demo015 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;


        if(a>0 && b>0){
            a = a+b;
            b = a-b;
            a = a-b;
        }

        System.out.println("variable a is: "+a);
        System.out.println("variable b is: "+b);
    }
}
