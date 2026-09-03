1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> stableMountains(int[] height, int threshold) {
6        List<Integer> stableIndices = new ArrayList<>(); 
7        
8        for (int i = 1; i < height.length; i++) {
9            if (height[i - 1] > threshold) {
10                stableIndices.add(i);
11            }
12        }
13        
14        return stableIndices;
15    }
16}
17