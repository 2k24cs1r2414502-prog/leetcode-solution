1class Solution {
2    public boolean canJump(int[] nums) {
3        int jump=0;
4
5        for (int i=0;i<nums.length;i++) {
6            if (i>jump) {
7                return false;
8            }
9            jump = Math.max(jump,i+nums[i]);
10            if (jump>=nums.length-1) {
11                return true;
12            }
13        }
14
15        return true;
16    }
17}