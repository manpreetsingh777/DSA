class Solution {
    public String reverseWords(String s) {
      int n = s.length();
      StringBuilder ans = new StringBuilder();
      Stack<Character> stack = new Stack();
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch == ' '){
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
            ans.append(ch);
        }
        else{
            stack.push(ch);
        }
      }

      while(!stack.isEmpty()){
            ans.append(stack.pop());
      }
      return ans.toString();
    }
}