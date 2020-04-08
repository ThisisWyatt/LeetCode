package interview;

/**
 * Description TODO 2020。04.08字节跳动面试算法题
 *
 * 字节跳动在北京有N个工区，形成一个环状，ByteBus是往返在各个工区的通勤车，按照工区的顺序行驶，其中第i个工区有汽油
 * gas[i]升。你有一辆邮箱容量无限的ByteBus，从第i个工区开往第i+1个工区需要消耗汽油cost[i]升。你从其中一个工区出发，
 * 开始时油箱为空。如果你可以绕路一周，则返回出发时工区的编号，否则返回-1
 *
 * Author Cloudr
 * Date 2020/4/8 23:44
 **/
public class ByteBus {

    private static int[] getAnswer(int[] gas, int[] cost){
        int[] returnRes=new int[gas.length];
        a:for(int i=0;i<gas.length;i++){
            int index=0;
            for(int j=i;j<gas.length;j++){
                index+=gas[i];
                index-=cost[i];
                if(index<0){
                    returnRes[i]=-1;
                    continue a;
                }
            }
            for(int j=0;j<i;j++){
                index+=gas[i];
                index-=cost[i];
                if(index<0){
                    returnRes[i]=-1;
                    continue a;
                }
            }
                returnRes[i]=i;
        }
        return returnRes;
    }

    public static void main(String[] args){
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int[] result=getAnswer(gas,cost);
        for(int i:result){
            if(i!=-1)
                System.out.println(i);
        }
    }
}
