package sort;

import javafx.scene.chart.StackedAreaChart;

/**
 * Description TODO 快速排序
 * Author Cloudr
 * Date 2020/4/3 0:47
 **/
public class QuickSort {

    private static void quickSort(int[] a, int left, int right) {
//        将a分成一边大的，一边小的，重复执行这个过程
        if (left < right) {
            int index = getIndex(a, left, right);
            quickSort(a, left, index - 1);
            quickSort(a, index + 1, right);
        }
    }

    private static int getIndex(int[] a, int left, int right) {

        int standard = a[left]; // 基准数据
        while (left < right) {
            while (left < right && a[right] >= standard) { //必须要 >= 不然 =等于那个得不到处理 left也指不到这边
                right--;                                   // 当队尾的元素大于等于基准数据时,向前挪动high指针
            }
            a[left] = a[right];                            //将小于基准数据的值放到左边（小的一边）
            while (left < right && a[left] <= standard) {
                left++;
            }
            a[right] = a[left];                           //将大于基准数据的值放到右边（大的一边）
        }
        a[left] = standard;                               //此时left==right 同时这个位置也是standard的位置
        return left;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4, 2, 21, 563, 1, 6246, 13, 4331};
        quickSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
