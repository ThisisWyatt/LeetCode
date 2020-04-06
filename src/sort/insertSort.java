package sort;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/4/1 23:52
 **/
public class insertSort {
    private static void insertSorts(int[] a) {
        int Temp;
        for (int i = 1; i < a.length; i++) {
            Temp = a[i];                    //必须要用Temp 否则移动过程中会改变a[i]的值
            int j;
            for (j = i - 1; j >= 0; j--) {  //从已经排好的序列中的末尾（即最大的开始比较）
                if (a[j] > Temp)
                    a[j + 1] = a[j];
                else {
                    a[j + 1] = Temp; //因为之前j--了一次
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 623, 1, 132, 634, 2, 3, 4};
        insertSorts(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}

/*
* 直接插入排序是将未排序的数据插入至已排好序序列的合适位置。

具体流程如下：

1、首先比较数组的前两个数据，并排序；

2、比较第三个元素与前两个排好序的数据，并将第三个元素放入适当的位置；

3、比较第四个元素与前三个排好序的数据，并将第四个元素放入适当的位置；

......

4、直至把最后一个元素放入适当的位置。
* */
