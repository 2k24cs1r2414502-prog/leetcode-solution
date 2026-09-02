1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        ArrayList<Integer> list = new ArrayList<>();
4        for (int i = 0; i < nums.length; i++) {
5            int count = 0;
6
7            for (int j = 0; j < nums.length; j++) {
8
9                if (nums[j] < nums[i]) {
10                    count++;
11                }
12            }
13
14            list.add(count);
15        }
16        for (int i = 0; i < nums.length; i++) {
17            nums[i] = list.get(i);
18        }
19
20        return nums;
21    }
22}