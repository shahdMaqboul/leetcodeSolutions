class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        if(nums.length ==0)return 0;
        else if(target<nums[0]) return 0;
        else if(target>nums[nums.length-1]) return nums.length;
        
            for(int i =0;i< nums.length;i++){
                if(nums[i]==target) 
                    return i;
                if(position == 0){
                    if(nums[i]>=target) 
                        position = i;
                    // else if(i==nums.length-1)
                    //     position = i+1;
                }
            }
           
        return position ;
    }
}