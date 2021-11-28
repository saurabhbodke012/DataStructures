package DataStructure_I;

import java.util.Arrays;
import java.util.HashMap;

public class DayTwo {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){

            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }

            map.put(nums[i], i);
        }
        return res;
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int nums1Index = 0;
//         int nums2Index = 0;
//         for(int i=m;i<nums1.length;i++){
//             nums1[i]=nums2[nums2Index];
//             nums2Index++;
//         }
//         for(int i=0; i < nums1.length; i++) {
//             for(int index=i; index > 0 && nums1[index] < nums1[index-1]; index-- ) {
//                 int temp = nums1[index];
//                 nums1[index] = nums1[index-1];
//                 nums1[index-1] = temp;

//             }
//         }
//     }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for (int i=m; i<(m+n); i++){
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3,nums2,3);
    }

}
