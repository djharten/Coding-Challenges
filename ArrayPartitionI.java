// Leetcode Problem, "Array Partition I" : https://leetcode.com/problems/array-partition-i/description/

// Sorts the array, then takes every other value and adds it to the total min sum.
// Ex: [ 1, 4, 9, 8, 6, 2 ] sorts to [ 1, 2, 4, 6, 8, 9 ]. Pairs made would be
// (1,2) , (4,6) , (8,9). Sum of the min of each pair is 1 + 4 + 8 = 13.
class Solution {
    public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      int sum = 0;
      for(int i = 0; i < nums.length; i+= 2) {
        sum += nums[i];
      }    
          return sum;
      }
}
