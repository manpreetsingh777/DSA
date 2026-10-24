class Solution {
    public int minLength(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() == true)stack.push(ch);
            else if(ch == 'B' && stack.peek() == 'A'){
                stack.pop();
            }
            else if(ch == 'D' && stack.peek() == 'C'){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}