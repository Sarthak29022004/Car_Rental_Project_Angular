package Linked_List;

public class Delete_the_Middle_Node_of_a_Linked_List_LeetCode {
    static class ListNode {
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

    static void display(ListNode head){
        while (head!=null){
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }

    static ListNode deleteMiddle(ListNode head) {
        int len = 1;
        ListNode temp = head;
        while(temp.next !=null){
            len++;
            temp = temp.next;
        }
        if (len==1) return head;
        len /= 2;
        ListNode temp2 = head;
        while (len>1){
            temp2 = temp2.next;
            len--;
        }
        temp2.next = temp2.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        display(n1);
        System.out.println(deleteMiddle(n1).val);
        display(n1);
    }
}
