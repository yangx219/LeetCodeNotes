package array;
/*给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。

示例 1：

输入：nums = [1,1,0,1,1,1]
输出：3
解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
示例 2:

输入：nums = [1,0,1,1,0,1]
输出：2

*/
public class arr485 {
    //My solution
    public int findMaxConsecutiveOnesXue(int[] nums) {
        int count = 0;
        boolean isContinue = false;
        int maxContinue = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count ++;
                isContinue = true;
                if(count >= maxContinue){
                    maxContinue = count;
                }
            }else{
                count = 0;
                isContinue = false;
            }
        }
        return maxContinue;


    }

    //the better answer
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 1){
                temp++;
            }else{
                count = Math.max(count, temp);
                temp = 0;
            }
        }
        return Math.max(count, temp);
    }
}
