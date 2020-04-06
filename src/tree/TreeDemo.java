package tree;

import java.util.Scanner;
import java.util.Stack;
import java.util.TooManyListenersException;

/**
 * Description TODO 二叉树的建立
 * Author Cloudr
 * Date 2020/4/6 14:35
 **/

class TreeNode {
    int data;
    TreeNode LNode;
    TreeNode RNode;


    void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}

public class TreeDemo {
    //    创建二叉树
    private static TreeNode creatTree(TreeNode treeNode) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入结点的值");
        int data = in.nextInt();
        if (data != 0) {
            treeNode = new TreeNode();
            treeNode.setData(data);
            treeNode.LNode = creatTree(treeNode.LNode);
            treeNode.RNode = creatTree(treeNode.RNode);
        } else {
            treeNode = null;
        }
        return treeNode;
    }

    //    先序遍历二叉树（递归） 对于当前节点，先输出该节点，然后输出他的左孩子，最后输出他的右孩子。
    private static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.LNode);
            preOrder(root.RNode);
        }
    }

    //    先序遍历二叉树（非递归）
    private static void preOrderWithoutRecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
//            遍历一条路径下的左结点，并将其放入栈中
            while (root != null) {
                System.out.println(root.data);
                stack.push(root);
                root = root.LNode;
            }
//            当栈空的时候 跳出循环 全树遍历结算
            if (stack.isEmpty()) {
                break;
            }
//            当一条路径下的所有子结点遍历完后 依次返回遍历上一层的父右结点的所有左子结点
            root = stack.pop();
            root = root.RNode;
        }
    }

    //     中序遍历二叉树 （递归） 对于当前结点，先输出它的左孩子，然后输出该结点，最后输出它的右孩子。
    private static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.LNode);
            System.out.println(root.data);
            inOrder(root.RNode);
        }
    }

    //      中序遍历二叉树（非递归）
    private static void inOrderWithoutRecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.LNode;
            }
            if (stack.isEmpty()) {
                break;
            }
            root = stack.pop();
            System.out.println(root.data);
            root = root.RNode;
        }

    }

    //      后序遍历二叉树 （递归） 对于当前结点，先输出它的左孩子，然后输出它的右孩子，最后输出该结点。
    private static void postOrder(TreeNode node){
        if(node!=null){
            postOrder(node.LNode);
            postOrder(node.RNode);
            System.out.println(node.data);
        }
    }

    //      后序遍历二叉树（非递归）
    private static void postOrderWithoutRecursive(TreeNode node) {//后序遍历非递归实现
        int left = 1;//在辅助栈里表示左节点
        int right = 2;//在辅助栈里表示右节点
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackMark = new Stack<>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。

        while(node != null || !stack.empty())
        {
            while(node != null)
            {//将节点压入栈1，并在栈2将节点标记为左节点
                stack.push(node);
                stackMark.push(left);
                node = node.LNode;
            }

            while(!stack.empty() && stackMark.peek() == right)
            {//如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出
                stackMark.pop();
                System.out.println(stack.pop().data);
            }

            if(!stack.empty() && stackMark.peek() == left)
            {//如果是从左子节点返回父节点，则将标记改为右子节点
                stackMark.pop();
                stackMark.push(right);
                node = stack.peek().RNode;
            }
        }
    }



    public static void main(String[] args) {
        TreeNode tree = creatTree(new TreeNode());
        System.out.println("----中序遍历----");
        postOrderWithoutRecursive(tree);

    }
}
