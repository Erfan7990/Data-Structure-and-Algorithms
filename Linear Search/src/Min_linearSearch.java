public class Min_linearSearch {
    public static void main(String[] args) {
        int[] arr = {12,4,18,7,-4,3};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < ans)
            {
                ans = arr[i];
            }
        }

        return ans;
    }
}
