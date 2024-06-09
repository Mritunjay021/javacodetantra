import java.util.*;

public class dequeueex {
    public static void main(String args[]) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("One");
        deque.addFirst("two");
        deque.addLast("3");
        deque.offer("4");
        deque.offerFirst("5");
        deque.offerLast("6");
        deque.push("7");
        System.out.println("intial deque");
        System.out.print(deque + " ");
        System.out.println("\nusing ITERATOR");
        Iterator it = deque.iterator();
        while (it.hasNext())
            System.out.println(" " + it.next());
        Iterator rev = deque.descendingIterator(); // reverse iterator
        System.out.println("\n\nusing REVERSE ITERATOR");
        while (rev.hasNext())
            System.out.println(" " + rev.next());

        System.out.println("\n\n Deque peak" + deque.peek());
        System.out.println("\n deque after peek:" + deque);
        System.out.println("\n deque pop:" + deque.pop());
        System.out.println("\n deque after pop:" + deque);
        System.out.println("\n dequeu contains three:" + deque.contains("three"));
        deque.removeFirst();
        deque.pollLast();

    }
}