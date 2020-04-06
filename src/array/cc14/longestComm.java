package array.cc14;

/**
 * Description TODO LeetCode 14th 最长公共前缀
 * Author Cloudr
 * Date 2020/3/16 22:48
 **/
public class longestComm {
    public static void main(String[] args){
        int n=0;
        String max="";
        StringBuffer comm=new StringBuffer();
        String[] list={"and","andA","andAB"};
        for (String s : list) { //找出最长的字符串
            if (n < s.length()){
                n = s.length();
                max=s;
            }
        }
        char[] commArray=max.toCharArray();
        boolean judge=true;
        for (char c : commArray) { //将最长字符串的每一个字符逐一添加到公共字符串后 逐一比对每一个字符串是否以其开始
            comm.append(c);        // 如有一个不是则返回此公共字符串
            for (String s : list) {
                if (!s.startsWith(String.valueOf(comm))) {
                    judge = false;
                    comm.deleteCharAt(comm.length() - 1);
                    break;
                }
            }
            if (!judge)
                break;
        }
        System.out.println(comm);
    }
}
