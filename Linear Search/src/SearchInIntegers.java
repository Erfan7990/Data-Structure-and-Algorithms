public class SearchInIntegers {
    public static void main(String[] args) {
        int[] nums = {16, 3,34,60,6,7,12};
        int target = 5;
        System.out.println(linearSearch(nums, target));

    }

    static int linearSearch(int[] arr, int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == target){
                return arr[i];
            }
        }
        return -1;
    }
}