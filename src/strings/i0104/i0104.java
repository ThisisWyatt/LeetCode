package strings.i0104;

import javax.crypto.interfaces.PBEKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Description TODO i0104
 * Author Cloudr
 * Date 2020/5/1 22:40
 **/
public class i0104 {
    private static boolean judge(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int n = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1)
                n++;
            if (n == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "tactcoa";
        System.out.println(judge(s));
    }

}
