package tree;

import java.util.*;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/4/6 13:48
 **/
public class TraversalBinaryTree {
    /**
     * 采用递归的方式前序遍历
     */
    private void preOrder(BinaryTree root){
        if (root != null){
            System.out.print(root.getData() + "\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    /**
     * 采用非递归的方式前序遍历
     */
    private void preOrderNonRecursive(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<>();
        while (true){
//            遍历一条路径下的左结点，并将其放入栈中
            while (root != null){
                System.out.print(root.getData() + "\t");
                stack.push(root);
                root = root.getLeft();
            }
//            当栈空的时候 跳出循环 全树遍历结算
            if (stack.isEmpty()){
                break;
            }
//            当一条路径下的所有子结点遍历完后 依次返回遍历上一层的父右结点的所有左子结点
            root = stack.pop();
            root = root.getRight();
        }
    }

    /**
     * 采用递归的方式中序遍历
     */
     private void inOrder(BinaryTree root){
        if (root != null){
            inOrder(root.getLeft());
            System.out.print(root.getData() + "\t");
            inOrder(root.getRight());
        }
    }

    /**
     * 采用非递归的方式中序遍历
     */
    private void inOrderNonRecursive(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                root = root.getLeft();
            }
            if (stack.isEmpty()){
                break;
            }
            root = stack.pop();
            System.out.print(root.getData() + "\t");
            root = root.getRight();
        }
    }

    /**
     * 采用递归的方式后序遍历
     */
    private void postOrder(BinaryTree root){
        if (root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + "\t");
        }
    }

    /**
     * 采用非递归的方式后序遍历
     */
    private void postOrderNonRecursive(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<>();
        while (true){
//            将一条线路上的所有左子节点放入栈中
            if (root != null){
                stack.push(root);
                root = root.getLeft();
            }
            else{
//                栈中无元素时 遍历结束
                if (stack.isEmpty()){
                    return;
                }
//                如果栈中最后一个元素的后子结点为空
                if (stack.lastElement().getRight() == null){
//                    栈中弹出一个结点输出
                    root = stack.pop();
                    System.out.print(root.getData() + "\t");
//                    栈中再弹出一个结点（刚刚输出结点的父结点）的右结点不为空的话
                    while (root == stack.lastElement().getRight()){
//                        输出这个结点的值
                        System.out.print(stack.lastElement().getData() + "\t");

                        root = stack.pop();
                        if (stack.isEmpty()){
                            break;
                        }
                    }
                }

                if (!stack.isEmpty()) {
                    root = stack.lastElement().getRight();
                }
                else{
                    root = null;
                }
            }
        }
    }




    /**
     * 层序遍历
     */
    private void levelOrder(BinaryTree root){
        BinaryTree temp;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.print(temp.getData() + "\t");
            if (temp.getLeft() != null){
                queue.offer(temp.getLeft());
            }

            if (temp.getRight() != null){
                queue.offer(temp.getRight());
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree node10 = new BinaryTree(10,null,null);
        BinaryTree node8 = new BinaryTree(8,null,null);
        BinaryTree node9 = new BinaryTree(9,null,node10);
        BinaryTree node4 = new BinaryTree(4,null,null);
        BinaryTree node5 = new BinaryTree(5,node8,node9);
        BinaryTree node6 = new BinaryTree(6,null,null);
        BinaryTree node7 = new BinaryTree(7,null,null);
        BinaryTree node2 = new BinaryTree(2,node4,node5);
        BinaryTree node3 = new BinaryTree(3,node6,node7);
        BinaryTree node1 = new BinaryTree(1,node2,node3);

        TraversalBinaryTree tree = new TraversalBinaryTree();

        //采用递归的方式进行遍历
        System.out.println("-----前序遍历------");
        System.out.print("递归:\t");
        tree.preOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.preOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----中序遍历------");
        System.out.print("递归:\t");
        tree.inOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.inOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----后序遍历------");
        System.out.print("递归:\t");
        tree.postOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.postOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----层序遍历------");
        System.out.print("递归:\t");
        tree.levelOrder(node1);
        System.out.println();
    }
}
