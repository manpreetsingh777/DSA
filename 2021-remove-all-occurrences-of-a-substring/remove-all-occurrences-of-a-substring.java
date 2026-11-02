class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            if(stack.size() >= part.length()) {
                int k = part.length() - 1;
                int j = stack.size() - 1;
                int found = 1;
                while(k >= 0) {
                    if(stack.get(j) == part.charAt(k)) {
                        k--;
                        j--;
                    }
                    else {
                        found = 0;
                        break;
                    }
                }
                if(found == 1) {
                    for(int h = 0; h < part.length(); h++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}