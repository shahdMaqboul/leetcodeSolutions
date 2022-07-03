class Solution {
    public int majorityElement(int[] nums) {
        int ret =0;
        int sum=0;
        Arrays.sort(nums);
        int n=nums.length/2;

        for(int i=0; i< nums.length;i++){
            sum++;
            
            if(i==nums.length-1 || nums[i] != nums[i+1]){
                if(sum > n) {
                    ret=nums[i];
                    break;}
                else sum = 0;
            }
            
        }
        return ret;
    }
}