/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    const missing =[];
    for(let i = 0; i<= nums.length ; i++){
        missing[i] = "yes";
    }
    
    for(let i = 0; i<= nums.length ; i++){
        if(missing[nums[i]] == "yes"){
            missing[nums[i]] ="no";
        }
    }
    
    return missing.indexOf("yes");
};

/* Array.indexOf()
The indexOf() method returns the first index at which a given element can be found in an array. It returns -1 if the element does not exist in the array.
*/
// reference
// https://www.freecodecamp.org/news/4-methods-to-search-an-array/