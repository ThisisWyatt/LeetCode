package ListNode.cci52;

import ListNode.Node;

/**
 * Description TODO LeetCode 面试 52th 寻找两个链表首次出现的结点
 * Author Cloudr
 * Date 2020/4/11 22:45
 **/
public class Cci52 {

    private static Node getIntersectionNodes(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node node1 = headA;
        Node node2 = headB;
        while (node1.value != node2.value) {

            node1 = node1.next;
            node2 = node2.next;

            if (node1 == null) {
                node1 = headB;
            }
            if (node2 == null) {
                node2 = headA;
            }
        }
        return node1;
    }

    private static int common(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] aa = a;
        int[] bb = b;
        while (true) {
            i++;
            if (a == aa && i == a.length) {
                a = bb;
                i = 0;
            }
            j++;
            if (b == bb && j == b.length) {
                b = aa;
                j = 0;
            }
            if (a[i] == b[j])
                return a[i];
            if (a == bb && i == bb.length - 1)
                return -1;
        }
    }

    public static void main(String[] args) {
//        Node head1 = null;
//        Node temp1 = null;
//
//        for (int i = 0; i < 7; i++) {
//            Node current;
//            if (head1 == null) {
//                current = new Node(i);
//                head1 = current;
//                temp1 = head1;
//            } else {
//                current = new Node(i);
//                temp1.next = current;
//                temp1 = temp1.next;
//            }
//        }
//
//        Node head2 = null;
//        Node temp2 = null;
//
//        for (int i = 4; i < 10; i++) {
//            Node current;
//            if (head2 == null) {
//                current = new Node(i);
//                head2 = current;
//                temp2 = head2;
//            } else {
//                current = new Node(i);
//                temp2.next = current;
//                temp2 = temp2.next;
//            }
//        }
//
//        Node x = getIntersectionNodes(head1, head2);
//        System.out.println(x.value);


        int[] a = {4, 5, 6, 7, 8, 9};
        int[] b = {10, 11, 12};
        int commonNum = common(a, b);
        System.out.println(commonNum);


    }

}
