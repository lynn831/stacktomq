package cn.lynn.stack2mq;

import java.util.Stack;

/**
 * @author:lynn
 * @since 2018/12/16 16:04
 * @descript:  用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class SolutionDoubleStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }
    public int pop() {
        if(stack2.size()<=0) {        //判断栈2中为空
            while(stack1.size()>0) {
                stack2.push(stack1.pop());    //将栈1弹出的元素放入栈2中
            }
            if(stack2.isEmpty()) {
                try {
                    throw new Exception();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return stack2.pop();       //然后弹栈2

    }
    public static void main(String[] args) {
        SolutionDoubleStack s=new SolutionDoubleStack();
        s.push(23);
        s.push(24);
        s.push(45);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
