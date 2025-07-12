package Linked_List;

import java.util.HashMap;

public class Add_Two_Numbers_LeetCode {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int i = 1;
        ListNode temp = l1;
        while (temp != null) {
            map.put(i++, temp.val);
            temp = temp.next;
        }
        long num1 = 0;
        int s1 = map.size();
        for (int j = s1; j > 0; j--) {
            num1 = num1 * 10 + map.get(j);
        }
        i = 1;
        long num2 = 0;
        temp = l2;
        while (temp != null) {
            map2.put(i++, temp.val);
            temp = temp.next;
        }
        int s2 = map2.size();
        for (int j = s2; j > 0; j--) {
            num2 = num2 * 10 + map2.get(j);
        }
        long num3 = num1 + num2;
        ListNode temp2 = new ListNode((int) num3 % 10);
        ListNode head = temp2;
        num3 /= 10;
        while (num3 > 0) {
            temp2.next = new ListNode((int) num3 % 10);
            temp2 = temp2.next;
            num3 /= 10;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode x = new ListNode(5);
        ListNode y = new ListNode(6);
        ListNode z = new ListNode(4);
        a.next = b;
        b.next = c;
        x.next = y;
        y.next = z;
        ListNode p = addTwoNumbers(a, x);
        System.out.println(p.val);
    }
}
