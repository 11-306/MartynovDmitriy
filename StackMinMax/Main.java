package StackMinMax;

public class Main {
    public static void main(String[] args) {
        StackMinMax stack = new StackMinMax();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(4);
        stack.push(5);
        System.out.println("min " + stack.min());
        System.out.println("max " + stack.max());
    }
}
