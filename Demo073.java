import java.util.Scanner;

public class Demo073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter broo: ");

        //size
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++)

        //elements 
        arr[i] = sc.nextInt();
        sc.close();

        Duplicate obj = new Duplicate();
        obj.printdup(arr);
    }
}

class Duplicate {
    void printdup(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("duplicate elements in arrays are:"+arr[i] + " ");
                    break; // Move to next element after finding a duplicate
                }
            }
        }
    }
}
