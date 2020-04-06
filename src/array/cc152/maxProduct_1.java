package array.cc152;

/**
 * Description TODO LeetCode 152th 乘积最大子数组
 * Author Cloudr
 * Date 2020/3/18 17:18
 **/
public class maxProduct_1 {
    public static void main(String[] args){
        int[] nums=new int[]{-2,3,-4};
        int maxSum=nums[0];
        int currentSumMax=nums[0];
        int currentSumMin=nums[0];

        for(int i=1;i<nums.length;++i){
            if(nums[i]<0){                    //因为会遇到负数，所以记录下最小乘积和最大乘积  如果nums[i]<=0的话  交换最小乘积和最大乘积
                int t=currentSumMax;
                currentSumMax=currentSumMin;
                currentSumMin=t;
            }

            currentSumMax = Math.max(nums[i], currentSumMax * nums[i]); //如果之前的currentSum乘上nums[i]比直接用nums[i]重新开始还小则将nums[i]的值直接赋值给currentSum
            currentSumMin = Math.min(nums[i], currentSumMin * nums[i]);
            maxSum = Math.max(maxSum, currentSumMax);
        }
        System.out.println(maxSum);
    }
}
