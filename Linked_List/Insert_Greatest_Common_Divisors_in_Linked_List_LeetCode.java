package Linked_List;

public class Insert_Greatest_Common_Divisors_in_Linked_List_LeetCode {

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

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            int n1 = temp.val;
            int n2 = temp.next.val;
            int minNum = Math.min(n1, n2);
            for (int i = minNum; i > 0; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ListNode newNode = new ListNode(i);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
            }
            temp = temp.next.next;
        }
        display(head);
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(18);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        insertGreatestCommonDivisors(a);
    }
}
