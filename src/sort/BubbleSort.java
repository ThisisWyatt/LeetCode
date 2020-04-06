package sort;

/**
 * Description TODO 冒泡排序
 * Author Cloudr
 * Date 2020/4/1 22:43
 **/
public class BubbleSort {
    private static void bubbleSorts(int[] a) {

        int i, j, temp;

        for (i = 0; i < a.length - 1; i++) {       //每轮都是把最大的数排到最后 注意是 a.length-1 因为下文有一个j+1
            for (j = 0; j < a.length - 1 - i; j++) { //每次需要排的个数减少i个
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 253, 56, 745, 342, 41, 654, 321432, 131, 324};
        bubbleSorts(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
