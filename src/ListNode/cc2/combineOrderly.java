package ListNode.cc2;
import ListNode.Node;
/**
 * Description TODO 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * Author Cloudr
 * Date 2020/3/15 22:19
 **/

import java.util.Scanner;

/**
 * 思路
 *
 *     这道题可以使用递归实现，新链表也不需要构造新节点，我们下面列举递归三个要素
 *     终止条件：两条链表分别名为 l1 和 l2，当 l1 为空或 l2 为空时结束
 *     返回值：每一层调用都返回排序好的链表头
 *     本级递归内容：如果 l1 的 val 值更小，则将 l1.next 与排序好的链表头相接，l2 同理
 *     O(m+n)O(m+n)O(m+n)，mmm 为 l1的长度，nnn 为 l2 的长度
 **/

public class combineOrderly {
    private static Node mergeTwoLists(Node L1, Node L2) {
        if(L1==null)
            return L2;
        if(L2==null)
            return L1;
        if(L1.value<L2.value)
        {
            L1.next=mergeTwoLists(L1.next,L2);  //选出小的结点作为本结点 然后利用循环选出下一个结点
            return L1;                          //结点小的那个链表作为这一层的返回值
        }else{
            L2.next=mergeTwoLists(L2.next,L1);
            return L2;
        }
    }
}
