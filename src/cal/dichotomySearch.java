package cal;

import javax.sound.midi.MidiDevice;
import java.sql.Statement;

/**
 * Description TODO 二分查找
 * Author Cloudr
 * Date 2020/4/15 11:22
 **/
public class dichotomySearch {
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < arr[middle])
                end = middle - 1;
            else if (key > arr[middle]) {
                start = middle + 1;
            } else
                return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 6;
        int index = search(arr, key);
        System.out.println(index);
    }
}
