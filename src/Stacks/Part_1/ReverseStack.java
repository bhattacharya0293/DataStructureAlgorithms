package Stacks.Part_1;

import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, x);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println("|"+s.pop()+"|");
        }
        System.out.println("---");
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

//        printStack(s);
        reverseStack(s);
        printStack(s);
    }
}
