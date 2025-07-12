package Linked_List;

public class Nth_Node_From_End {
    public Node head;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(10);
        Node e = new Node(11);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Nth_Node_From_End n = new Nth_Node_From_End();
        n.head = a;
        n.display(a);
        System.out.println();
        n.nthFromEnd(2);
        n.nthFromEndUsingTwoPointer(2);
    }

    void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    void nthFromEnd(int index) {  //imp
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < size - index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void nthFromEndUsingTwoPointer(int index) {  //VIMP => One Traversal
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < index; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }
}
