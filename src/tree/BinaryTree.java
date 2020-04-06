package tree;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/4/6 13:47
 **/
public class BinaryTree {
    private int data;  //结点的值
    private BinaryTree left;  //左子结点
    private BinaryTree right;  //右子结点

    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
//        super();
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
}
