class Solution {
    public char findTheDifference(String s, String t) {
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        else {
            map.put(ch,1);
        }
      }
      StringBuilder ans = new StringBuilder();
      for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        if(map.containsKey(ch)){
            if(map.get(ch) == 0){
                ans.append(ch);
                break;
            }
            else{
                map.put(ch, map.get(ch) - 1);
            }
        }
        else {
            ans.append(ch);
            break;
        }
      }
      return ans.charAt(0);
    }
}