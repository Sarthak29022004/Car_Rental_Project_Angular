package Linked_List;

public class linkedlist {
    Node head = null;
    Node tail = null;
    int size = 0;

    public static class Node {
        public int data;
        public Node next;


        Node(int val) {
            this.data = val;
//          this.next = null;       by default
        }
    }

    public static void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");  //3 -> 5 -> 7 -> 11 -> 13 ->
            head = head.next;
        }
    }

    static void DisplayR(Node head) {
        System.out.print(head.data + " -> ");  //3 -> 5 -> 7 -> 11 -> 13 ->
        if (head.next == null) return;
        DisplayR(head.next);
    }

    static void DisplayReverse(Node head) {
        if (head.next == null) {
            System.out.print(head.data + " -> ");
            return;
        }
        DisplayReverse(head.next);
        System.out.print(head.data + " -> ");  //13 -> 11 -> 7 -> 5 -> 3 ->
    }

    public static void length(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        System.out.println(count);
    }

    //   ======================   Important   =========================
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;   //insertAtEnd(val);
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertEnd(Node head, int val) {
        Node temp = new Node(val);
        Node head2 = head;
        if (head == null) {
            head2 = tail = temp;
        } else {
            while (head2.next != null) {
                head2 = head2.next;
            }
        }
        head2.next = temp;
        tail = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

//    int size() {
//        Node temp = head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }

    void insert(int val, int index) {
        Node temp = new Node(val);
        Node temp1 = head;
        if (index == size) {
            insertAtEnd(val);
            return;
        }
        if (index == 0) {
            insertAtHead(val);
            return;
        }
        for (int i = 1; i < index; i++) {
            temp1 = temp1.next;
        }
        temp.next = temp1.next;
        temp1.next = temp;
        size++;
    }

    void delete(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        for (int i = 1; i <= index; i++) {
            if (i == index) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        size--;
    }

    int getAt(int index) {
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(11);

        ll.insertAtHead(13);
        ll.insertAtHead(17);

        ll.display();
        System.out.println();


        ll.insert(100, 7);

        ll.display();
        System.out.println();

        ll.delete(0);
        ll.display();
        System.out.println();

        System.out.println(ll.size);

        System.out.println(ll.getAt(2));

        ll.insertEnd(ll.head, 21);
        ll.display();
        System.out.println();
        System.out.println("Head = " + ll.head.data + " , " + "Tail = " + ll.tail.data);

//        Node a = new Node(3);
//        Node b = new Node(5);
//        Node c = new Node(7);
//        Node d = new Node(11);
//        Node e = new Node(13);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        Display(a);
//        System.out.println();
//        DisplayR(a);
//        System.out.println();
//        DisplayReverse(a);
//        System.out.println();
//        length(a);

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        Node temp = a;
//        while (temp != null){
//            System.out.print(temp.data + " -> ");  //3 -> 5 -> 7 -> 11 -> 13 ->
//            temp = temp.next;
//        }
    }
}
