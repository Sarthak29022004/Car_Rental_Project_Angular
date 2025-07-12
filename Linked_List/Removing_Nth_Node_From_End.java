package Linked_List;

public class Removing_Nth_Node_From_End {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    static Node removeNode(Node head, int index) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < index; i++) {
            fast = fast.next;
            if(fast==null){
                head = slow.next;
                return head;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(14);
        Node c = new Node(9);
        Node d = new Node(18);
        Node e = new Node(21);
        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        head = a;
        display(a);
        a = removeNode(head, 6);
        display(a);
        display(removeNode(head, 6));
    }
}
