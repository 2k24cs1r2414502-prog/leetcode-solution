1class Solution {
2    public int maxProductDifference(int[] nums) {
3        
4        Arrays.sort(nums);
5
6        int n = nums.length;
7
8        int maxProduct = nums[n - 1] * nums[n - 2];
9        int minProduct = nums[0] * nums[1];
10
11        return maxProduct - minProduct;
12    }
13}