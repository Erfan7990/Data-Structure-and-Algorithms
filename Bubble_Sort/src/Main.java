import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr){
        // run the array n-1 times
        for (int i=0; i < arr.length; i++){
            // for each step find out the MAX value
            for (int j=1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }

        return arr;
    }
}