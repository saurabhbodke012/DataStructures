package Arrays;

import java.util.Arrays;

public class Insert {

    public static void duplicateZeros(int[] arr) {
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(i == n-1){
                break;
            }
            if(arr[i] == 0){
                for(int j= (n-2); j>=(i+1); j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int nums1Index = 0;
//        int nums2Index = 0;
//        int[] merged = new int[m +n ];
//        while(nums1Index < nums1.length && nums2Index < nums2.length) {
//            if(nums1[nums1Index] < nums2[nums2Index]) {
//                merged[nums1Index + nums2Index] = nums1[nums1Index];
//                nums1Index++;
//            } else {
//                merged[nums1Index + nums2Index] = nums2[nums2Index];
//                nums2Index++;
//            }
//        }
//
//        for (int i=0; i< merged.length; i++){
//            nums1[i] = merged[i];
//        }
//    }


    public static void main(String[] args) {
        int[] arr= {1,0,2,3,0,4,5,0};
        int[] nums1= {1,2,3,0,0,0};
        int[] nums2={2,5,6};

//        merge(nums1,3,nums2,3);

//        duplicateZeros(arr);
    }
}
