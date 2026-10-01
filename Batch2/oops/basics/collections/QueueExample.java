import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExample {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addLast(10);
        dq.addLast(50);
        dq.add(30);
        dq.addLast(40);
        dq.add(20);
        dq.addFirst(60);
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq); 
    }
}
