package Linked_List;

import java.util.ArrayList;
import java.util.HashMap;

public class Linked_List_Components_LeetCode {
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

    static int numComponents(ListNode head, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        int ans = 0;
        boolean flag = false;
        while (head.next != null) {       //0 1 2 3
            if (map.containsKey(head.val) && map.containsKey(head.next.val)) {
                ans++;
                flag = true;
                head = head.next;
                continue;
            }
            if (!flag && map.containsKey(head.val) && ((head.next.next==null) || !map.containsKey(head.next.val))){
                ans++;
            }
            flag = map.containsKey(head.val);
            head = head.next;
        }
        return ans;
    }

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
//        ListNode e = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
//        d.next = e;
        display(a);
        int[] arr = {0, 1, 3};
        System.out.println(numComponents(a, arr));
    }
}
