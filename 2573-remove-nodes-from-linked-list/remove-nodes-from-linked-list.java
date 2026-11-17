class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer> s = new Stack<>();
        for(int i = list.size()-1; i >= 0; i--){
            int curr = list.get(i);
            if(s.isEmpty() || curr >= s.peek()){
                s.push(curr);
            }
        }
        ListNode dummy = new ListNode(0);
        temp = dummy;
        while(!s.isEmpty()){
            temp.next = new ListNode(s.pop());
            temp = temp.next;
        }
        return dummy.next;
    }
}
