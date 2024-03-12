package StackMinMax;

import java.util.Deque;
import java.util.LinkedList;


public class StackMinMax {

    Deque<Integer> data;
    Deque<Integer> min;
    Deque<Integer> max;
    StackMinMax(){
        min = new LinkedList<>();
        data = new LinkedList<>();
        max = new LinkedList<>();
    }
    void push(int x){
        data.push(x);
        if (min.isEmpty() || min.peek() >= x){
            min.push(x);
        }
        if (max.isEmpty() || max.peek() <= x){
            max.push(x);
        }
    }
    void pop(){
        if (!data.isEmpty()){
            int temp = data.pop();
            if (temp == min.peek()){
                min.pop();
            }
            if (temp == max.peek()){
                max.pop();
            }
        } else{
            throw new IllegalArgumentException("Стэк пуст");
        }
    }
    int min(){
        return min.peek();
    }
    int max(){
        return max.peek();
    }
}
