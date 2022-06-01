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
// references
// https://iamketan.wordpress.com/2020/12/16/136-single-number-leetcode/
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/splice