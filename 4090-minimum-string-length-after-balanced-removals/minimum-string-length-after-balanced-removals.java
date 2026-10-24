class Solution {
    public int minLengthAfterRemovals(String s) {
       int n = s.length();
       Stack<Character> s1 = new Stack();
       Stack<Character> s2 = new Stack();
       for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch == 'a')s1.push(ch);
        else{
            s2.push(ch);
        }
       }
        return Math.abs(s1.size() - s2.size());
    }
}