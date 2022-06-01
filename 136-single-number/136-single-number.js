/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    for(let i =0;i< nums.length;i++){
        if(i === nums.lastIndexOf(nums[i])){ // check if single number
            return nums[i];
        }else {
            nums.splice(nums.lastIndexOf(nums[i]), 1); //splice(start, deleteCount) - to delete the 2nd appearance of the element
       }     
    }
    
};