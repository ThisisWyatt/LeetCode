package Nomal;

/**
 * Description TODO 斐波那契数列
 *                  F(0) = 0,   F(1) = 1
 *                  F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * Date 2020/4/2 21:15
 **/
public class Fib {

//    普通递归方法
    private int fib(int n){
         if(n<2)
             return n;
         else
             return fib(n-1)+fib(n-2);
    }

//    将每一次计算的结果都记录下来
    private int fibs(int n){
        int[] Results=new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<2)
                Results[i]=i;
            else
                Results[i]=Results[i-1]+Results[i-2];
        }
        return Results[n];
    }




    public static void main(String[] args){
        Fib b=new Fib();
        System.out.println(b.fib(4));
    }

}
