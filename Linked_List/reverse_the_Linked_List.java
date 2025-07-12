package Linked_List;

public class reverse_the_Linked_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){
        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
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

    static ListNode reverse(ListNode head){
        ListNode temp = head.next;
        head.next = null;
        while (temp.next!=null){
            temp.next = head;
            temp = temp.next;
        }
        display(head);
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        display(n1);
        reverse(n1);
    }
}
