package javacollection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerFirst("Eko");
        stack.offerFirst("Kurniawan");
        stack.offerFirst("Khannedy");

        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Eko");
        queue.offerLast("Kurniawan");
        queue.offerLast("Khannedy");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
