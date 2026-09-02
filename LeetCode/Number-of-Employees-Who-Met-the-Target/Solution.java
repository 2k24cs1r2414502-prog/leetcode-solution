1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int n=hours.length;
4        int count=0;
5        for(int i=0;i<n;i++){
6            if(hours[i]>=target){
7                count++;
8            }
9        }
10        return count;
11    }
12}