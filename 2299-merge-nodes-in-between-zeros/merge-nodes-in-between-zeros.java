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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int cnt = 0;
        while(temp != null){
            if(temp.val == 0){
                if(!s.isEmpty()){
                while(!s.isEmpty()){
                    cnt += s.pop();
                }
                list.add(cnt);
                cnt = 0;
            }
            }
            else {
                s.push(temp.val);
            }
            temp = temp.next;
        }
       temp = head;
       for(int i=0;i<list.size() - 1 ;i++) {
        temp.val = list.get(i);
        temp = temp.next;
       }
       temp.val  = list.get(list.size() - 1);
       temp.next =  null;
       return head;
    }
}