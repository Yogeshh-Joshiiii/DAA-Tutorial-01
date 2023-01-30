import java.util.*;

// public class queueDs{
//     public static void main(String args[]){
//         Queue<Integer>q=new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+"-");
//             q.remove();
//         }
//     }
// }

// QUEUE Using two stacks -->

public class queueDs {
    Stack<Integer> sa;
    Stack<Integer> sb;
    public queueDs() {
        sa=new Stack<Integer>();
        sb=new Stack<Integer>();
    }

    public void push(int x) {
        while(!sa.isEmpty()){
            sb.push(sa.pop());
        }
        sa.push(x);
        while(!sb.isEmpty()){
            sa.push(sb.pop());
        }
    }

    public int pop() {
        if(sa.isEmpty()){
            return -1;
        }
        return sa.pop();
    }

    public int peek() {
        if(sa.isEmpty()){
            return -1;
        }
        return sa.peek();
    }

    public boolean empty() {
        return sa.isEmpty();
    }
    public static void main(String args[]){
        queueDs q=new queueDs();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        while(!q.empty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}