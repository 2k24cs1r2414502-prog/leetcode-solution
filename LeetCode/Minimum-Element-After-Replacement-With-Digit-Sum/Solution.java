1class Solution {
2    public int minElement(int[] nums) {
3        int n = nums.length;
4        int min = Integer.MAX_VALUE;
5        for (int i = 0; i < n; i++) {
6            nums[i] = digitSum(nums[i]);
7        }
8        for (int i = 0; i < n; i++) {
9            if (nums[i] < min)
10                min = nums[i];
11
12        }
13        return min;
14    }
15
16    public int digitSum(int num) {
17        int sum = 0;
18        while (num != 0) {
19            sum += num % 10;
20            num = num / 10;
21        }
22        return sum;
23    }
24}
25