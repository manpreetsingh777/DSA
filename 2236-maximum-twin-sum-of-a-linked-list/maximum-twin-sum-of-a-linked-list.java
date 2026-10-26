/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
       ListNode t = head;
       Stack<Integer> stack = new Stack<>();
       int max = 0;
       while( t != null){
       stack.push(t.val);
       t=t.next;
       }
       int i=0;
       int n = stack.size();
       while(i<n/2){
        int sum = stack.get(i) + stack.get(n-i-1);
        if(sum>max)max = sum;
        i++;
       }
       return max;
    }
}