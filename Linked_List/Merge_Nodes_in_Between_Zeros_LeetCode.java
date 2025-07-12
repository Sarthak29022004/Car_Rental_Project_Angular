package Linked_List;

public class Merge_Nodes_in_Between_Zeros_LeetCode {
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

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(0);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(2);
        ListNode h = new ListNode(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Merge_Nodes_in_Between_Zeros_LeetCode ll = new Merge_Nodes_in_Between_Zeros_LeetCode();
        ll.display(a);
        ll.mergeNodes(a);
    }

    void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode temp3 = temp2;
        int totalSum = 0;
        while (temp.next != null) {
            totalSum += temp.val;
            if (temp.next.val == 0) {
                temp2.val = totalSum;
                if (temp.next.next == null) {
                    temp2.next = temp.next.next;
                } else {
                    temp2 = temp2.next;
                }
            }
            if (temp.next.val == 0) {
                totalSum = 0;
            }
            temp = temp.next;
        }
        display(temp3);
        return temp3;
    }
}
