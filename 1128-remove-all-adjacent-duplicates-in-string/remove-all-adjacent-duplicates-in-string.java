class Solution {
    public String removeDuplicates(String s) {
      int n = s.length();
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(stack.isEmpty()==true)stack.push(ch);
        else if(ch == stack.peek()){
            stack.pop();
        }
        else {
            stack.push(ch);
        }
      }
      StringBuilder ans = new StringBuilder();
      for(int j=0;j<stack.size();j++){
        ans.append(stack.get(j));
      }
      return ans.toString();
    }
}