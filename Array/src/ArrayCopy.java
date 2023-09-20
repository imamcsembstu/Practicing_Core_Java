import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {23, 43,33,31,9,12,34,14};

        int[] copyToArr = new int[10];

        // 1St Approach : main array 5th
        System.arraycopy(arr, 5, copyToArr,3,3); // length error if length>3
        System.out.println("The main Array: " + Arrays.toString(arr) + "\nAnd the copy array is: "+ Arrays.toString(copyToArr));


        int[] copiedArray = Arrays.copyOf(arr,15);
        System.out.println("\nThe main Array: " + Arrays.toString(arr) + "\nAnd the copy array is: "+ Arrays.toString(copiedArray));

        // Copy Of range

        int[] copyForRange = Arrays.copyOfRange(arr,1,4);
        System.out.println("\nThe main Array: " + Arrays.toString(arr) + "\nAnd the copy array of range 1-4 is: "+ Arrays.toString(copyForRange));

    }



}
