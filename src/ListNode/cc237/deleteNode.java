package ListNode.cc237;

import ListNode.Node;

import java.util.Scanner;

/**
 * Description TODO  删除一个节点
 * Author Cloudr
 * Date 2020/4/2 23:14
 **/
public class deleteNode {

    private void deleteNode1(Node head, Node node) { //node为空不影响 node.next也为空，node.value也为空
        while (head != null) {
            if (head.value == node.value) {
                head.value = head.next.value;
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
//        输入
        Scanner in = new Scanner(System.in);
        Node head = null;
        if (in.hasNextInt()) {
            head = new Node(in.nextInt());
        }
        Node temp = head;

        while (in.hasNextInt()) {
            assert temp != null;
            temp.next = new Node(in.nextInt());
            temp = temp.next;
        }
//      删除
        Node putNode = head;
        deleteNode d = new deleteNode();
        Node delete = new Node(2);
        d.deleteNode1(head, delete);
//      输出
        while (putNode != null) {
            System.out.println(putNode.value);
            putNode = putNode.next;
        }

    }
}
