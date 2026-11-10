package homework.h07;

// https://leetcode.com/problems/missing-number/
public class T1 {

  public int missingNumber(int[] nums) {
    int result = nums.length;

    for (int i = 0; i < nums.length; i++) {
      result ^= i ^ nums[i];
    }

    return result;
  }
}
