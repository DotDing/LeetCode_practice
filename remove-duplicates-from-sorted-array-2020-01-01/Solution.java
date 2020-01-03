import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static int removeDuplicates(int[] nums) {
    /**
     * 我的题解思路
     * step 1
     */
//    int duplicationValue = nums[0];
//    for (int i=1; i<nums.length; i++) {
//      if (duplicationValue == nums[i]) {
//        // 删除重复元素，并
//      } else {
//        duplicationValue = nums[i];
//      }
//    }
    // step 1 将数组转为set
    // step 2 set转为数组
//    Set<Integer> numsSet = new HashSet<>(Arrays.asList(nums));
    // 官方题解：双指针法
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    int[] nums = {1,1,1,1,3,3,4};
    System.out.println(removeDuplicates(nums));
  }
}
