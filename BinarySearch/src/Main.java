public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] arr = {3, 4, 9, 13, 26, 45, 50, 57};
        int tagret = 26;

        System.out.println(BinarySearch(arr, tagret));
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // find the middle element
            // int mid = (start + end)/2; // if integer has large amount of value then it's going to be ""integer range out of bound""
            int mid = start + (end - start)/2;

            if( target < arr[mid] ){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return  -1;
    }
}