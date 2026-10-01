import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.addLast(20);
        dq.offerLast(30);
        dq.addLast(40);
        dq.offerLast(50);
        dq.offerFirst(60);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
    }
}
