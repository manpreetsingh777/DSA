class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        while(r < n) {
            char ch = s.charAt(r);
            if(map.getOrDefault(ch, 0) == 0) {
                map.put(ch, 1);
                int len = r - l + 1;
                max = Math.max(max, len);
                r++;
            }
            else {
                while(map.getOrDefault(ch, 0) > 0) {
                    char c = s.charAt(l);
                    map.put(c, map.get(c) - 1);
                    l++;
                }
            }
        }
        return max;
    }
}
