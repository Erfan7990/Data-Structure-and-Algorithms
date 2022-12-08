public class findOutElement {
    // find the target element, If the targeted element is not present in given array then
    // "find out the target element that is smallest in array and find out the greater than value of the targeted value"
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 13, 15, 26, 45, 50};
        int target = 20;
        System.out.println(BinarySearch2(arr, target));
    }

    static int BinarySearch2(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start+ (end - start)/2;

            if (arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return arr[start];
    }

}
