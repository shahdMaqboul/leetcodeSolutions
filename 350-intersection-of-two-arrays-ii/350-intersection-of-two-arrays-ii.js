/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    var nums1Len = nums1.length;
    var nums2Len = nums2.length;
    var minLen = Math.min(nums1Len,nums2Len);
    console.log(minLen)
    const arr=[];
    
    for(let i=0 ; i < minLen ;i++){
        if(minLen == nums1Len){
            console.log(minLen)
            if(nums2.indexOf(nums1[i])!= -1){
                nums2[nums2.indexOf(nums1[i])]=""
                arr.push(nums1[i])
            }
            console.log(nums2)
        }
        else{
            if(nums1.indexOf(nums2[i])!= -1){
                nums1[nums1.indexOf(nums2[i])]=""
                arr.push(nums2[i])
            }
        }
    }
    return arr;
    
};