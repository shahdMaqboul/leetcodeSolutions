/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let n1 = m-1;
    let n2 = n-1;
    for(let i = m+n-1;i>=0;i--){
        if(n1 == -1 && n2 != -1){
            nums1[i] = nums2[n2];
            n2--;
        }else if(n2 == -1 && n1 != -1){
            nums1[i] = nums1[n1];
            n1--;
        }else if(nums1[n1]>=nums2[n2]){
            nums1[i]=nums1[n1];
            n1--;
        }else{
            nums1[i]=nums2[n2];
            n2--;
        }
    }
};