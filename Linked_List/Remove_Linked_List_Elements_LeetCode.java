package Linked_List;

public class Remove_Linked_List_Elements_LeetCode {

    public static ListNode head;

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    static class Solution {
        public int removeElements(ListNode head, int val) {
            ListNode temp = head;
            while (temp != null) {

                if (temp.val == val) {
                    if (temp.next==null){
                        head = temp;
                    } else {
                        head = temp.next;
                        temp = temp.next;
                        continue;
                    }
                }
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            return head.val;
        }
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(7, a);
        ListNode c = new ListNode(7, b);
        ListNode d = new ListNode(7, c);
        ListNode ls = new ListNode();
        head = d;
        //ListNode ls = new ListNode();
        System.out.println(sl.removeElements(head, 7));
    }
}
