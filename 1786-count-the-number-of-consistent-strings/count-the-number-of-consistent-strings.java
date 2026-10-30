class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int len = allowed.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            char ch = allowed.charAt(i);
            set.add(ch);
        }
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            int flag = 1;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if(set.contains(ch) == false){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)cnt++;
        }
        return cnt;
    }
}