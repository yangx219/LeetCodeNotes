package array;


/*283. 移动零
* 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。

示例 1:
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
* */
public class arr283 {

    //直接用指针保存相对位置，然后覆盖值，最后补0
    public void moveZeroesBetter(int[] nums) {
        int index = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index;i< nums.length;i++){
            nums[i] = 0;
        }

    }


    //O(n**2)
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len;i++){
            if(nums[i] == 0){
                for(int j = i+1;j<len; j++){
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }

        }
    }

    //O(n)
    public void moveZeroesSolution(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }




}
