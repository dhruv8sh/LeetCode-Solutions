class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=l1, last=null;
        int carry=0;
        while(l1!=null) {
            l1.val+=l2.val+carry;
            carry=l1.val/10;
            l1.val%=10;
            last=l1;
            if(l2.next==null)
                l2.next=new ListNode(0);
            else if(l1.next==null)
                l1.next=new ListNode(0);
            l1=l1.next;
            l2=l2.next;
        }
        if(carry==1)
            last.next=new ListNode(1);
        return ans;
    }
}
