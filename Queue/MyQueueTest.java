package Queue;

import java.util.Scanner;

public class MyQueueTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        MyQueue q = new MyQueue(10);

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Удалённый элемент: " + q.pop());

        System.out.println("Первый элемент: " + q.front());

        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);

        System.out.println("Размер очереди: " + q.size());

        q.push(9);
        q.push(10);
        q.push(11);

        System.out.println("Размер очереди: " + q.size());

        q.clear();

        System.out.println("Размер очереди: " + q.size());

        System.out.println(q.pop());
    }
}
