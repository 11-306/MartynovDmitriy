package Queue;

public class MyQueue {
    private int q_right;
    private int q_left;
    private int size;
    private int[] array;

    MyQueue(int SIZE) {
        array = new int[SIZE];
        q_right = 0;
        q_left = 0;
        size = 0;
    }

    void push(int x) {
        if (size == array.length + 1) {
            throw new IllegalArgumentException("Так нельзя делать");
        }

        array[q_right] = x;
        q_right = (q_right + 1) % array.length;
        size++;

    }

    int pop() {
        if (is_empty()) {
            throw new IllegalArgumentException("Так нельзя делать");
        } else {
            size--;
            return array[q_left++];
        }
    }

    int front() {
        if (is_empty()) {
            throw new IllegalArgumentException("Так нельзя делать");
        } else {
            return array[q_left];
        }
    }

    int size() {
        return (size);
    }

    void clear() {
        q_left = q_right = 0;
        size = 0;
    }

    boolean is_empty() {
        if (q_left == q_right) {
            return true;
        } else {
            return false;
        }
    }
}
