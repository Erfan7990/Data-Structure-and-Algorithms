import java.util.Arrays;

public class TwoD_BS {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 29;
        System.out.println(Arrays.toString(Binary_Search(arr, target)));
    }
    static int[] Binary_Search(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length -1;

        while(row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return new int[]{row, col};
            }

            if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
