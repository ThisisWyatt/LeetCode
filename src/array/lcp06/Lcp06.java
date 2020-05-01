package array.lcp06;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/5/1 23:10
 **/
public class Lcp06 {
    private static int solution(int[] coins) {
        int time = 0;
        for (int m : coins) {
            int n = 0;
            if (m % 2 == 0) {
                n = m / 2;
            } else {
                n = m / 2 + 1;
            }
            time += n;
        }
        return time;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 10};
        System.out.println(solution(a));
    }
}
