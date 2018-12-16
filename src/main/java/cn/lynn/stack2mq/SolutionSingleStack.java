package cn.lynn.stack2mq;

import java.util.Stack;

/**
 * @author:lynn
 * @since 2018/12/16 16:25
 * @descript:  用一个栈来实现一个队列，主要是递归时，隐式用到系统栈
 */
public class SolutionSingleStack {

    Stack<Integer> stack1 = new Stack<Integer>();


    public void push(int node) {
        stack1.push(node);

    }
    public int pop() {
        int result = stack1.pop();
        int restemp;
        if (stack1.size()!=0){
            restemp=this.pop();
            stack1.push(result);
            return restemp;
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionSingleStack s=new SolutionSingleStack();
        s.push(23);
        s.push(32);
        s.push(24);
        s.push(45);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
