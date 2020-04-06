package sort;

/**
 * Description TODO 希尔排序
 * Author Cloudr
 * Date 2020/4/4 21:25
 **/
public class ShellSort {
    private static void shell(int[] a) {
        int gap = a.length / 2;  //增量，每隔gap为一组
        while (gap >= 1) {
            for (int i = gap; i < a.length; i++) { //依次遍历每一组 i=gap是因为后面的j-gap才有意义
                int j = i;
                while (j - gap >= 0 && a[j] < a[j - gap]) { //遍历每一组 如何发现后面的小于前面的则交换
                    int temp = a[j];                        //这里不采用每次给j+gap是因为 会有gap个a[j]遍历不到 换种方法也会比较麻烦
                    a[j] = a[j - gap];
                    a[j - gap] = temp;

                    j = j - gap;
                }
            }
            gap = gap / 2;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 7, 43, 12, 15, 33, 15, 2, 12, 14, 3};
        shell(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
