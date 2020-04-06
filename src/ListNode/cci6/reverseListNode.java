package ListNode.cci6;

import ListNode.Node;

import java.util.Scanner;
import java.util.Stack;

/**
 * Description TODO  leetCode面试题6 反转打印链表
 * Author Cloudr
 * Date 2020/4/2 23:52
 **/
public class reverseListNode {
    private int[] reversePrint(Node head) {
        Stack<Node> stack = new Stack<>();
        Node Temp = head;
        while (Temp != null) {
            stack.push(Temp);
            Temp = Temp.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop().value;
        }
        return result;
    }

    public static void main(String[] args) {
        reverseListNode c = new reverseListNode();
//        输入
        Scanner in = new Scanner(System.in);
        Node head1 = null;
        if (in.hasNextInt()) {
            head1 = new Node(in.nextInt());
        }
        Node temp = head1;
        while (in.hasNextInt()) {
            assert temp != null;
            temp.next = new Node(in.nextInt());
            temp = temp.next;
        }
        in.close();

        int[] a = c.reversePrint(head1);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
