package StackAndQueues;

import java.util.*;

public class stackAndQueueAndDeque {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();   //LIFO
//        stack.push(40);
//        stack.push(35);
//        stack.push(30);
//        stack.push(25);
//        stack.push(20);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();  //FIFO
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(78);
        deque.addLast(99);
        deque.addFirst(22);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
