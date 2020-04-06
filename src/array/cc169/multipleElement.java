package array.cc169;

import java.util.HashMap;
import java.util.Map;

/**
 * Description TODO  LeetCode 169th 寻找一个数组中出现次数最多的元素
 * Author Cloudr
 * Date 2020/3/13 17:05
 **/
public class multipleElement {

    private static Map.Entry<Integer,Integer> method(int[] num){
        Map.Entry<Integer,Integer> most=null; //单个键值对，用于后续的比较
        Map<Integer,Integer>map=new HashMap<>();

        for(int a:num){
            map.put(a,map.getOrDefault(a,0)+1);  //map.getOrDefault(a,b) 若map.get(a)存在则值为get(a)，否则为默认值b
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (most==null||most.getValue()<entry.getValue())
                most=entry;
        }

        assert most!=null;
        return most;
    }

    public static void main(String[] args){
        int[] num={3,2,3};
        Map.Entry<Integer,Integer> most=method(num);
        System.out.println(most.getKey()+"出现"+most.getValue()+"次");

    }
}
