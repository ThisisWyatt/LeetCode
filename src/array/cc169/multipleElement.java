package array.cc169;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;

/**
 * Description TODO  LeetCode 169th 寻找一个数组中出现次数最多的元素
 * Author Cloudr
 * Date 2020/3/13 17:05
 **/
public class multipleElement {

    private static Map.Entry<Integer, Integer> method(int[] num) {
        Map.Entry<Integer, Integer> most = null; //单个键值对，用于后续的比较
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : num) {
            map.put(a, map.getOrDefault(a, 0) + 1);  //map.getOrDefault(a,b) 若map.get(a)存在则值为get(a)，否则为默认值b
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (most == null || most.getValue() < entry.getValue())
                most = entry;
        }

        assert most != null;
        return most;
    }

    private static int Solution169(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int m : a) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            if (max < entry.getValue())
                max = entry.getValue();
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        System.out.println(Solution169(num));
    }
}
