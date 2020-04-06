package strings.cci0101;

import java.util.HashMap;
import java.util.Map;

/**
 * Description TODO  LeetCode interview 01.01 判断字符串中是否有重复字符
 * Author Cloudr
 * Date 2020/4/2 22:43
 **/
public class isUnique {
    private boolean isUniques(String str) {
        char[] arrays=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:arrays){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)!=1)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str="asdfghf";
        isUnique i=new isUnique();
        System.out.println(i.isUniques(str));
    }
}
