import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 2, 2, 2};
        long start = System.nanoTime();
        int res = majorityElement(nums);
        System.out.println(System.nanoTime() - start);
        System.out.println(res);
    }
    public static int majorityElement(int[] nums) {
//        int first = nums[0];
//        int second = 0;
//        float sum = first;
//        int i = 1;
//
//        for (; i < nums.length; i++){
//            if (first != nums[i]){
//                second = nums[i];
//                break;
//            }
//            sum += nums[i];
//        }
//
//        for(; i < nums.length; i++){
//            sum += nums[i];
//        }
//
//        if ((first + second) /2.0 > sum/ (nums.length-1)) return first;
//        else return second;
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];
    }
}
