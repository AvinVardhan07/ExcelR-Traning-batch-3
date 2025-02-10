import java.util.Arrays;

// EXPLAINATION BROO:
// reverse an array, the elements swap places in a mirrored fashion.
// array: [1, 2, 3, 4, 5]

// First swap: 1 with 5
// Second swap: 2 with 4
// By the time i reaches 2 (middle), no further swaps are needed.
// The first element swaps with the last.
// The second element swaps with the second last.
// And so on...

public class Demo071 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i]; // upon the interator moves left to right with the elements ...so
            arr[arr.length - 1 - i] = temp; // parallely so we also move the like 2nd variable by decresing one by one
                                              // ..making the left one to point to the right one equally to have the
                                              // mirored swapping ...amd finally to achive an reversed array..
        }

        System.out.println(Arrays.toString(arr)); // using this to convert the complete array to the string because we
                                                  // cannot print the entire int array directly for that we need an
                                                  // interation
    }
}
