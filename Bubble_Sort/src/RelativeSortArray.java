import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(IsArray(arr1, arr2));
        if (IsArray(arr1, arr2)){
            System.out.println(Arrays.toString(SortingArrayOne(arr1, arr2)));
        }
    }
    static boolean IsArray(int[] nums1, int[] nums2){
        for (int i: nums1) {
            for (int j: nums2) {
                if (i == j){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] SortingArrayOne(int[] arr1, int[] arr2){
        int[] newArr = new int[(arr1.length -1)];

        for (int i=0; i < arr2.length ; i++){
            for (int j=0 ; j< arr1.length; j++){
                if (arr2[i] == arr1[j])
                {
                    newArr[j] = arr1[j];
                }
            }
        }
        return newArr;
    }


}
