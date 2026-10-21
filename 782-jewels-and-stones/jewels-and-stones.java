class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       HashSet<Character> str = new HashSet<>();
       for(int i=0;i<jewels.length();i++){
        str.add(jewels.charAt(i));
       }
       int cnt = 0;
       for(int i=0;i<stones.length();i++){
        if(str.contains(stones.charAt(i)))cnt++;
       }
       return cnt;
    }
}