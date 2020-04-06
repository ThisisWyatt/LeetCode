package sort;

/**
 * Description TODO 选择排序
 * Author Cloudr
 * Date 2020/4/4 21:09
 **/
public class SelectSort {
    private static void select(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j; // 找到当前循环中最小的数的索引
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] a = {2, 1, 63, 2, 12, 7, 3, 12, 78, 6, 43};
        select(a);
        for (int i : a) {
            System.out.println(i);
        }

    }
}
