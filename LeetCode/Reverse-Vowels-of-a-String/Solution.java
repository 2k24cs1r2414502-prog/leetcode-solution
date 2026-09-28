1class Solution {
2public:
3    string reverseVowels(string s) {
4        int i = 0, j = s.size() - 1;
5        
6        auto isVowel = [&](char c) {
7            c = tolower(c);
8            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
9        };
10        
11        while (i < j) {
12            while (i < j && !isVowel(s[i])) i++;
13            while (i < j && !isVowel(s[j])) j--;
14            
15            
16            swap(s[i], s[j]);
17            i++;
18            j--;
19        }
20        
21        return s;
22    }
23};
24