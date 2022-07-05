class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hs= new HashSet <Integer>();
        boolean flag=false;
        
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                flag=true;
                break;
            }
            hs.add(nums[i]);
        }
        
        return flag;
        
    }
}