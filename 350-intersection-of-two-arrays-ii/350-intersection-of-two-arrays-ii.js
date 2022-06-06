/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    var minLen = Math.min(nums1.length,nums2.length);
    const arr=[];
    
    for(let i=0 ; i < nums2.length ;i++){
        // if(minLen == nums1.length){
            // if(nums2.indexOf(nums1[i])!= -1){
            //     nums2[nums2.indexOf(nums1[i])]=""
            //     arr.push(nums1[i])
            // }
        // }
        // else{
            if(nums1.indexOf(nums2[i])!= -1){
                nums1[nums1.indexOf(nums2[i])]=""
                arr.push(nums2[i])
            }
        // }
    }
    return arr;
    
};