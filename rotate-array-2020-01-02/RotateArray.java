public class RotateArray {

  public static void rotate(int[] nums, int k) {
    if (k > nums.length) {
      k = k%nums.length;
    }
    int pre;
    int suf;
    for (int i = 0; i < k; i++) {
      suf = nums[nums.length-1];
      for (int j = 0; j < nums.length; j++) {
        pre = nums[j];
        nums[j] = suf;
        suf = pre;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    rotate(nums, 3);
    for (int num : nums) {
      System.out.println("value:" + num);
    }
  }
}
