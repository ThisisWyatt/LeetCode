package sort;


import java.security.AlgorithmConstraints;
import java.util.IntSummaryStatistics;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/4/3 23:14`
 **/
public class test {
    private static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int index = getIndex(a, left, right);
            quickSort(a, left, index - 1);
            quickSort(a, index + 1, right);
        }

    }

    private static int getIndex(int[] a, int left, int right) {
        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        return left;
    }

    private static void bubble(int[] a) {
       for(int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length-1-i;j++){
               if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
    }

    private static void insert(int[] a) {
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                }
                else{
                    j++;
                    a[j]=temp;
                    break;
                }
            }
        }
    }


    private static void shell(int[] a) {
        int length = a.length;
        int gap = length / 2;
        while (gap >= 1) {
            for (int i = gap; i < a.length; i++) {
                int j = i;
                while (j - gap >= 0 && a[j] < a[j - gap]) {
                    int temp = a[j];
                    a[j] = a[j - gap];
                    a[j - gap] = temp;
                    j = j - gap;
                }
            }
            gap = gap / 2;
        }
    }

    private static void select(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index])
                    index = j;
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 6, 2, 33, 5, 2, 12, 3};
        insert(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
