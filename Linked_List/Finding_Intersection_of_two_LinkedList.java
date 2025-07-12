package Linked_List;

public class Finding_Intersection_of_two_LinkedList {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    static void display(Node a) {
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node find(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;
        int size1 = 0;
        int size2 = 0;
        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        int c = 0;
        if(size1>size2){
            c = size1-size2;
            for (int i = 0; i < c; i++) {
                temp1 = temp1.next;
            }
        } else if (size2>size1) {
            c = size2-size1;
            for (int i = 0; i < c; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(14);
        Node c = new Node(9);
        Node d = new Node(18);
        Node e = new Node(21);
        Node f = new Node(30);
        Node g = new Node(40);
        //-------------------------
        Node h = new Node(7);
        Node i = new Node(50);
        Node j = new Node(55);
        a.next = b;   //a -> b -> c -> d -> e -> f -> g -> null
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        //-----------
        h.next = i;   //h -> i -> j -> e -> f -> g -> null
        i.next = j;
        j.next = e;
        head = a;
        display(a);
        display(h);
        System.out.println(find(a, h).data); //because null has no data
    }
}
